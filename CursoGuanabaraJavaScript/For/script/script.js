function calc()
{
    var num = document.getElementById('txtn')
    var res = document.getElementById('res')
    var msg = document.getElementById('msg')
    res.innerHTML = ''

    if (Number(num.value.length) == 0)
    {
        window.alert('[ERRO] Verifique os dados novamente')
    } else
    {   
        let n = Number(num.value)
        msg.innerHTML = ('')
        for (var i = 1; i <= 10; i++) {
            let item = document.createElement('option')
            item.text = n + ' X ' + i + ' = ' + (n * i)
            item.value = 'tab'+i
            res.appendChild(item)
        }
    }
    
}