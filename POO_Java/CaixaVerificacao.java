package avaliacao.dominio;

import java.util.Objects;

public class CaixaVerificacao implements ComponenteTela{

    // IMPLEMENTAR: código de um componente de caixa de verificação (checkbox). Ele deve ter um estado: marcado ou não marcado.
    // O visual dele será [ ] para não marcado e [X] para marcado.
	private boolean estaMarcado;
	private int x;
	private int y;
	private Painel painel;
	private String nome;
	private Cores cor = Cores.MAGENTA_BRIGHT;
	
	public CaixaVerificacao(Painel painel, int x, int y, String nome,boolean estaMarcado, Cores cor){
		setPainel(painel);
		setX(x);
		setY(y);
		setNome(nome);
		setEstaMarcado(estaMarcado);
		setCor(cor);
	}
	
    public void atualizarPosicao(int x, int y) {
        setX(x);
        setY(y);
    }
	
    public void desenhar() {
		if(estaMarcado) {
			painel.escrever(x, y, "[X] "+nome, cor);
		}else {
			painel.escrever(x, y, "[ ] "+nome, cor);
		}
	
	}
    
	public boolean getEstaMarcado(){
		return this.estaMarcado;
	}
	
	public void setEstaMarcado(boolean estaMarcado) {
		this.estaMarcado = estaMarcado;
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
    
    public Painel getPainel() {
        return painel;
    }
    
    public void setPainel(Painel painel) {
    	this.painel = Objects.requireNonNull(painel);
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = Objects.requireNonNull(nome);
	}
	
    public Cores getCor() {
    	return this.cor;
    }
    
    public void setCor(Cores cor) {
    	this.cor = Objects.requireNonNull(cor);
    }

}
