exports.paginaInicial = (req, res) =>
{
    res.send('                                                                 <form action = "/" method = "POST">                                        Nome: <input type="text" name="nome"></input>                    <button>Enviar</button>                                                       </form>                                                                      ');  
};

exports.trataPost = (req, res) =>
{
    res.send('Oi, eu sou uma nova rota de POST!');  
};