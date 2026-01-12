package avaliacao.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GrupoRadio implements ComponenteTela{
    // IMPLEMENTAR: código de um componente de grupo de botões de rádio (radiobox).
    // Este componente tem várias opções e apenas uma delas pode estar marcada.
    // Ainda, o componente pode ser desenhado na horizontal ou vertical.

    // Se o grupo tiver 3 opções, por exemplo Masculino, Feminino, Não informado, a opção Feminino estiver marcada, e
    // o desenho for na vertical, ele deverá ser exibido assim:
    // ( ) Masculino
    // (X) Feminino
    // ( ) Não informado

    // Se o desenho for na horizontal, ele deverá ser exibido assim:
    // ( ) Masculino (X) Feminino ( ) Não informado
	
	private List<OpcaoRadio> opcoes;
	private Eixos eixo;
	private int x;
	private int y;
	private Painel painel;
	private Cores cor;
	
	public GrupoRadio(Painel painel,int x,int y, Eixos eixos, Cores cor){
		setPainel(painel);
		opcoes = new ArrayList<>();
		setEixo(eixos);
		setX(x);
		setY(y);
		setCor(cor);
	}
	
	public void desenhar() {
		if(eixo == Eixos.HORIZONTAL) {
			int i = 0;
			for(OpcaoRadio opcao : opcoes) {
				System.out.print(opcao+ " ");
				painel.escrever(x+i,y,opcao+" ", cor);
				i+= 20;
			}
		}else {
			int i = 0; 
			for(OpcaoRadio opcao : opcoes) {
				System.out.println(opcao);
				painel.escrever(x,y+i,opcao+" ", cor);
				i++;
			}
		}
		
		
	}
	
	public List<OpcaoRadio> getOpcoes() {
		return this.opcoes;
	}
	
	public void addOpcao(OpcaoRadio opcao) {
		if(opcao.getIsSelected()) {
			int count = 1;
			for(OpcaoRadio opcaoFor : opcoes) {
				if(opcaoFor.getIsSelected()) {
					count++;
					break;
				}
				
				if(count>1) {
					throw new RuntimeException("Duas opções marcadas no radio"); 
				}
			}
		}else {
			opcoes.add(opcao);
		}
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
	
	public Eixos getEixo() {
		return this.eixo;
	}
	
	public void setEixo(Eixos eixo) {
		this.eixo = Objects.requireNonNull(eixo);
	}
	
	public Painel getPainel() {
	   return painel;
	}
	    
    public void setPainel(Painel painel) {
    	this.painel = Objects.requireNonNull(painel);
    }
    
    public Cores getCor() {
    	return this.cor;
    }
    
    public void setCor(Cores cor) {
    	this.cor = Objects.requireNonNull(cor);
    }
	
}
