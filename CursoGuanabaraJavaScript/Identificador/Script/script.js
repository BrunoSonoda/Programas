function verificar()
{
    var data = new Date()
    var ano = data.getFullYear()
    var fAno = document.getElementById('txtano')
    var res = document.getElementById('res')
    
    if (fAno.value.length == 0 || fAno.value > ano)
    {
        window.alert('[ERRO]Verifique os dados e tente novamente!')
    } else
    {
        var fsex = document.getElementsByName('radsex')
        var idade = ano - Number(fAno.value)
        var genero = ''
        var foto = document.getElementById('foto')
        foto.innerHTML = ''
        var img = document.createElement('img')
        img.setAttribute('id', 'foto')
        if (fsex[0].checked)
        {
            genero = 'Homem'
            if (idade >= 0 && idade < 10)
            {
                img.setAttribute('src', '../Imagens/CriancaHomem.png')
                res.innerHTML = 'Detectamos ' + genero + ' com ' + idade + ' ano!'
                foto.appendChild(img)
            } else if (idade >= 10 && idade < 21)
            {
                img.setAttribute('src', '../Imagens/AdolescenteHomem.png')
                res.innerHTML = 'Detectamos ' + genero + ' com ' + idade + ' ano!'
                foto.appendChild(img)
            } else if (idade >= 21 && idade < 55)
            {
                img.setAttribute('src', '../Imagens/AdultoHomem.png')
                res.innerHTML = 'Detectamos ' + genero + ' com ' + idade + ' ano!'
                foto.appendChild(img)
            } else if (idade >= 55 && idade < 120)
            {
                img.setAttribute('src', '../Imagens/IdosoHomem.png')
                res.innerHTML = 'Detectamos ' + genero + ' com ' + idade + ' ano!'
                foto.appendChild(img)
            } else
            {
                img.setAttribute('src', '../Imagens/Caveira.png')
                res.innerHTML = 'Detectamos ' + genero + ' com ' + idade + ' ano!'
                foto.appendChild(img)
            }
        } else if (fsex[1].checked)
        {
            genero = 'Mulher'
            if (idade >= 0 && idade < 10)
            {
                img.setAttribute('src', '../Imagens/CriancaMulher.png')
                res.innerHTML = 'Detectamos ' + genero + ' com ' + idade + ' ano!'
                foto.appendChild(img)
            } else if (idade >= 10 && idade < 21)
            {
                img.setAttribute('src', '../Imagens/AdolescenteMulher.png')
                res.innerHTML = 'Detectamos ' + genero + ' com ' + idade + ' ano!'
                foto.appendChild(img)
            } else if (idade >= 21 && idade < 55)
            {
                img.setAttribute('src', '../Imagens/AdultoMulher.png')
                res.innerHTML = 'Detectamos ' + genero + ' com ' + idade + ' ano!'
                foto.appendChild(img)
            } else if (idade >= 55 && idade < 120)
            {
                img.setAttribute('src', '../Imagens/IdosoMulher.png')
                res.innerHTML = 'Detectamos ' + genero + ' com ' + idade + ' ano!'
                foto.appendChild(img)
            } else
            {
                img.setAttribute('src', '../Imagens/Caveira.png')
                res.innerHTML = 'Detectamos ' + genero + ' com ' + idade + ' ano!'
                foto.appendChild(img)
            }
        }
        res.style.textAlign = 'center'
        foto.style.textAlign = 'center'
    }
}