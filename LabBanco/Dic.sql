SELECT 
    t.table_name AS "Tabela",
    t.comments AS "Descrição",
    c.column_name AS "Coluna",
    c.comments AS "Descrição",
    tc.data_type || 
    CASE 
        WHEN tc.data_type IN ('VARCHAR2', 'CHAR') THEN '(' || tc.data_length || ')' 
        WHEN tc.data_type = 'NUMBER' AND tc.data_precision IS NOT NULL THEN '(' || tc.data_precision || ',' || NVL(tc.data_scale,0) || ')'
        ELSE ''
    END AS "Tipo",
    CASE WHEN tc.nullable = 'Y' THEN 'Sim' ELSE 'Não' END AS "Nulo?",
    CASE 
        WHEN pk.column_name IS NOT NULL THEN 'PK'
        WHEN fk.column_name IS NOT NULL THEN 'FK'
        WHEN uk.column_name IS NOT NULL THEN 'UK'
        ELSE ''
    END AS "Tipo Constraint",
    fk.referenced_table || '.' || fk.referenced_column AS "Referencia FK",
    fk.constraint_name AS "Nome FK",
    chk.search_condition AS "Condição Check"
FROM 
    user_tab_comments t
JOIN 
    user_col_comments c ON t.table_name = c.table_name
JOIN 
    user_tab_columns tc ON c.table_name = tc.table_name AND c.column_name = tc.column_name
LEFT JOIN (
    SELECT a.table_name, a.column_name
    FROM user_cons_columns a
    JOIN user_constraints b ON a.constraint_name = b.constraint_name
    WHERE b.constraint_type = 'P'
) pk ON pk.table_name = c.table_name AND pk.column_name = c.column_name
LEFT JOIN (
    SELECT a.table_name, a.column_name
    FROM user_cons_columns a
    JOIN user_constraints b ON a.constraint_name = b.constraint_name
    WHERE b.constraint_type = 'U'
) uk ON uk.table_name = c.table_name AND uk.column_name = c.column_name
LEFT JOIN (
    SELECT 
        a.table_name, 
        a.column_name,
        b.constraint_name,
        c_pk.table_name AS referenced_table,
        c_pk.column_name AS referenced_column
    FROM user_cons_columns a
    JOIN user_constraints b ON a.constraint_name = b.constraint_name
    JOIN user_cons_columns c_pk ON b.r_constraint_name = c_pk.constraint_name
    WHERE b.constraint_type = 'R'
) fk ON fk.table_name = c.table_name AND fk.column_name = c.column_name
LEFT JOIN (
    SELECT a.table_name, a.column_name, b.search_condition
    FROM user_cons_columns a
    JOIN user_constraints b ON a.constraint_name = b.constraint_name
    WHERE b.constraint_type = 'C'
) chk ON chk.table_name = c.table_name AND chk.column_name = c.column_name
WHERE 
    t.table_name IN ('COMPANHIA_AEREA', 'EMPRESA_AEREA', 'AEROPORTO', 'STATUS_VOO', 'VOO', 'DATAS_VOO')
ORDER BY 
    t.table_name, 
    CASE 
        WHEN pk.column_name IS NOT NULL THEN 0
        WHEN fk.column_name IS NOT NULL THEN 1
        ELSE 2
    END,
    c.column_name;