function contar()
{
    let inicio = document.getElementById('txti')
    let fim = document.getElementById('txtf')
    let passo = document.getElementById('txtp')
    let res = document.getElementById('res')

    if (inicio.value.length == 0 || fim.value.length == 0 || passo.value.length == 0)
    {
        res.innerHTML = 'Impossivel contar!'
        //window.alert('[ERRO] Falta dados!')
    } else
    {
        res.innerHTML = 'Contando: '
        let i = Number(inicio.value)
        let f = Number(fim.value)
        let p = Number(passo.value)
        if (p <= 0)
        {
            window.alert('Passo invalido ! Considerando passo = 1')
            p = 1
        }
        let c = i
        if (i < f)
        {
            do
            {
                res.innerHTML += c + '\u{1F449}'
                c += p
            } while (c <= f);
        } else
        {
            while (c >= f)
            {
                res.innerHTML += c + '\u{1F449}'
                c -= p
            }
        }

        res.innerHTML += '\u{1F3C1}' 
    }
}