exports.paginaInicial = (req, res) =>
{
    res.render('index');  
};

exports.trataPost = (req, res) =>
{
    res.send('Oi, eu sou uma nova rota de POST!');  
};