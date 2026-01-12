function carregar()
{
    var msg = window.document.getElementById('msg')
    var img = window.document.getElementById('imagem')
    var data = new Date()
    var hora = data.getHours()
    msg.innerHTML = 'Agora são ' + hora + ' horas.'
    if (hora >= 0 && hora < 12)
    {
        img.src = 'Imagens/manha.png'
        document.body.style.background = '#fcbc79'
    } else if (hora >= 12 && hora < 18)
    {
        img.src = 'Imagens/tarde.png'
        document.body.style.background = '#5d8094'
    } else
    {
        img.src = 'Imagens/noite.png'
        document.body.style.background = '#002145'
    }
}