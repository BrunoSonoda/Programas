package avaliacao.dominio;

import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Painel{
    private Cores corFundo;
    // IMPLEMENTAR: melhorar para poder adicionar novos componentes facilmente.
//    private List<CaixaTexto> caixasTexto;
//    private List<Rotulo> rotulos;
    private List<ComponenteTela> componentes;

    // Usado para desenhar. Desconsidere os detalhes. Eles sao abstraidos
    // nos metodos prepararDesenho e escrever.
    private TerminalScreen terminalScreen;

    // IMPLEMENTAR: melhorar para garantir validações.

    public Painel(Cores corFundo) {
    	setCorFundo(corFundo);
    	componentes = new ArrayList<>();
        prepararDesenho();
    }
    
    public Cores getCorFundo() {
    	return this.corFundo;
    }
    
    public void setCorFundo(Cores cor) {
    	corFundo = Objects.requireNonNull(cor);
    }

//    public void adicionarCaixaTexto(CaixaTexto caixaTexto) {
//        caixasTexto.add(caixaTexto);
//    }

//    public void adicionarRotulo(Rotulo rotulo) {
//        rotulos.add(rotulo);
//    }
    
    public void adicionarComponenteTela(ComponenteTela componente) {
    	componentes.add(componente);
    }

    private void prepararDesenho() {
        DefaultTerminalFactory defaultTerminalFactory = new DefaultTerminalFactory();
        try {
            this.terminalScreen = defaultTerminalFactory.createScreen();
            terminalScreen.startScreen();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao criar tela.");
        }
    }

    public void desenhar() throws IOException {
        terminalScreen.clear();
        terminalScreen.refresh();

        // IMPLEMENTAR: melhorar para poder adicionar novos componentes facilmente.
//        for (CaixaTexto caixaTexto : caixasTexto) {
//            caixaTexto.desenhar();
//        }
//
//        for (Rotulo rotulo : rotulos) {
//            rotulo.desenhar();
//        }
        
        for(ComponenteTela componente : componentes) {
        	componente.desenhar();
        }
    }

    public void escrever(int x, int y, String texto, Cores cor) {
        try {
            TextGraphics textGraphics = terminalScreen.newTextGraphics();
            textGraphics.setForegroundColor(TextColor.ANSI.valueOf(cor.toString()));
            textGraphics.setBackgroundColor(TextColor.ANSI.valueOf(corFundo.toString()));
            textGraphics.putString(x, y, texto);
            terminalScreen.refresh();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao escrever no terminal.");
        }
    }
}
