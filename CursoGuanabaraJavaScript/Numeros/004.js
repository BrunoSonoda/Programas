//variaveis
var agora = new Date()
var hora = agora.getHours()
var minutos = agora.getMinutes()
var segundos = agora.getSeconds()
var turno

//condições para saber que turno é
if (hora < 12 && hora > 5)
{
    turno = 'manhã'
}
else if (hora > 12 && hora < 18)
{
    turno = 'tarde'
}
else
{
    turno = 'noite'
}

console.log('A hora atual é: ' + hora + ':' + minutos + ':' + segundos + ' da ' + turno + '!\n')

if (hora < 12 && hora > 5)
{
    console.log('Bom dia!')
}
else if (hora > 12 && hora < 18)
{
    console.log('Boa tarde!')
}
else
{
    console.log('Boa noite!')
}