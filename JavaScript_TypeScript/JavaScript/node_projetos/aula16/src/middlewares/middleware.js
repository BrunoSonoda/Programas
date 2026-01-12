exports.middlewareGlobal = (req, res, next) => {
    res.local.umaVariavelLocal = 'Este é o valor da variável local.';
    next();
};

exports.middlewareGlobal = (req, res, next) =>
{
    next();
};