package avaliacao.dominio;

import java.util.Objects;

public class OpcaoRadio {
	private String nome;
	private boolean isSelected;
	
	
	public OpcaoRadio(String nome, boolean isSelected){
		setNome(nome);
		setIsSelected(isSelected);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = Objects.requireNonNull(nome);
	}

	public boolean getIsSelected() {
		return isSelected;
	}

	public void setIsSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}
	
	
	
	@Override
	public String toString() {
		if(isSelected) {
			return "(X) "+ nome;
		}else {
			return "( ) "+ nome;
		}
		
	}
	
	
}
