package avaliacao.dominio;

import java.util.Objects;

public class CaixaTexto implements ComponenteTela{
    private Painel painel;
    private int x;
    private int y;
    private int largura;
    private int altura;
    private String conteudo;
    private Cores cor = Cores.GREEN;

    // IMPLEMENTAR: melhorar para garantir validações.
    // IMPLEMENTAR: metodos de acesso para alterar o conteudo e a cor.

    public CaixaTexto(Painel painel, int x, int y, int largura, int altura, String conteudo) {
        setPainel(painel);
        setX(x);
        setY(y);
        setLargura(largura);
        setAltura(altura);
        setConteudo(conteudo);
    }

    public CaixaTexto(Painel painel, int x, int y, int largura, int altura, Cores cor) {
    	setPainel(painel);
        setX(x);
        setY(y);
        setLargura(largura);
        setAltura(altura);
        setCor(cor);
    }

    public void atualizarPosicao(int x, int y) {
        setX(x);
        setY(y);
    }

    public void atualizarDimensao(int largura, int altura) {
        setLargura(largura);
        setAltura(altura);
    }

    public void desenhar() {
        for(int i = 0; i < altura; i++) {
            painel.escrever(x, y + i, String.format("[%s]", " ".repeat(largura - 2)), cor);
        }
    }
    
    public String getConteudo() {
    	return this.conteudo;
    }
    
    public void setConteudo(String conteudo) {
    	if(conteudo.length()<1) {
    		throw new RuntimeException("Não há conteúdo a ser exibido no rótulo");
    	}
    	this.conteudo = Objects.requireNonNull(conteudo); 
    }
    
    public Cores getCor() {
    	return this.cor;
    }
    
    public void setCor(Cores cor) {
    	this.cor = Objects.requireNonNull(cor);
    }
    
    public int getX() {
        return x;
    }
    
    public void setX(int x) {
    	if(x < 0) {
    		throw new RuntimeException("A posição de x não pode ser negativo");
    	}
    	this.x = x;
    }
    
    public int getY() {
        return y;
    }
    
    
    public void setY(int y) {
    	if(y<0) {
    		throw new RuntimeException("A posição de y não pode ser negativo");
    	}
    	this.y = y;
    }
    public int getLargura() {
        return largura;
    }
    
    public void setLargura(int largura) {
    	if(largura<1) {
    		throw new RuntimeException("Largura deve ser maior ou igual a 1.");
    	}
    	this.largura = largura;
    }
    
    public int getAltura() {
        return altura;
    }
    
    public void setAltura(int altura) {
    	if(altura<1) {
    		throw new RuntimeException("Altura deve ser maior ou igual a 1.");
    	}
    	this.altura = altura;
    }

    public Painel getPainel() {
        return painel;
    }
    
    public void setPainel(Painel painel) {
    	this.painel = Objects.requireNonNull(painel);
    }
}
