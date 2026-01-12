package avaliacao;

import java.io.IOException;
import java.util.Arrays;

import avaliacao.dominio.CaixaTexto;
import avaliacao.dominio.CaixaVerificacao;
import avaliacao.dominio.Cores;
import avaliacao.dominio.Eixos;
import avaliacao.dominio.GrupoRadio;
import avaliacao.dominio.OpcaoRadio;
import avaliacao.dominio.Painel;
import avaliacao.dominio.Rotulo;

public class Principal {

    public static void main(String[] args) throws IOException {
        Painel painel = new Painel(Cores.BLUE);
//        painel.adicionarRotulo(new Rotulo(painel,1,2, "FORMULÁRIO DE CADASTRO DE CONTATOS", Cores.RED_BRIGHT));
//        painel.adicionarRotulo(new Rotulo(painel,2,3, "Nome:", Cores.GREEN));
//        painel.adicionarCaixaTexto(new CaixaTexto(painel, 12, 3, 50, 1, "Ex: Bruno Panccioni"));
//        painel.adicionarRotulo(new Rotulo(painel,2,4, "Telefone:", Cores.GREEN));
//        painel.adicionarCaixaTexto(new CaixaTexto(painel, 12, 4, 20, 1, "Ex: (11)4699-2799"));
//        painel.adicionarRotulo(new Rotulo(painel,34,4, "E-mail:", Cores.GREEN));
//        painel.adicionarCaixaTexto(new CaixaTexto(painel, 42, 4, 20, 1, "Ex: usuario@email.com"));
        
        painel.adicionarComponenteTela(new Rotulo(painel,1,2, "FORMULÁRIO DE CADASTRO DE CONTATOS", Cores.RED_BRIGHT));
        painel.adicionarComponenteTela(new Rotulo(painel,2,3, "Nome:", Cores.GREEN));
        painel.adicionarComponenteTela(new CaixaTexto(painel, 12, 3, 50, 1, "Ex: Bruno Panccioni"));
        painel.adicionarComponenteTela(new Rotulo(painel,2,4, "Telefone:", Cores.GREEN));
        painel.adicionarComponenteTela(new CaixaTexto(painel, 12, 4, 20, 1, "Ex: (11)4699-2799"));
        painel.adicionarComponenteTela(new Rotulo(painel,34,4, "E-mail:", Cores.GREEN));
        painel.adicionarComponenteTela(new CaixaTexto(painel, 42, 4, 20, 1, "Ex: usuario@email.com"));
        
        //Adicionando componente grupo radio e checkbox
        painel.adicionarComponenteTela(new CaixaVerificacao(painel,2,5,"Já bebeu?",true,Cores.BLACK));
        painel.adicionarComponenteTela(new CaixaVerificacao(painel,2,6,"Já fumou?",false,Cores.BLACK));
        
        //Grupo Radio Horizontal
        GrupoRadio grupoRadio = new GrupoRadio(painel, 2, 7, Eixos.HORIZONTAL, Cores.BLACK);
        grupoRadio.getOpcoes().add(new OpcaoRadio("Masculino", true));
        grupoRadio.getOpcoes().add(new OpcaoRadio("Feminino", false));
        grupoRadio.getOpcoes().add(new OpcaoRadio("Outros", false));
        
        
        //Grupo Radio Vertical
        GrupoRadio grupoRadioVertical = new GrupoRadio(painel, 2, 10, Eixos.VERTICAL, Cores.BLACK);
        grupoRadioVertical.getOpcoes().add(new OpcaoRadio("Masculino", false));
        grupoRadioVertical.getOpcoes().add(new OpcaoRadio("Feminino", false));
        grupoRadioVertical.getOpcoes().add(new OpcaoRadio("Outros", true));
        
        painel.adicionarComponenteTela(grupoRadio);
        painel.adicionarComponenteTela(grupoRadioVertical);
        
        painel.desenhar();
    }
}
