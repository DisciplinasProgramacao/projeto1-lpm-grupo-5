package entidade;

import java.time.LocalDateTime;

public class Compromisso {
	private String nome;
	private Integer repeticaoCompromisso;
	private LocalDateTime data;
	
	public Compromisso() {
	}

	public Compromisso(String nome, LocalDateTime data){
		this.nome = nome;
		this.data = data;
	}
	public Compromisso(String nome, Integer repeticaoCompromisso) {
		super();
		this.nome = nome;

		this.repeticaoCompromisso = repeticaoCompromisso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDateTime getData(){
		return data;
	}
	public Integer getRepeticaoCompromisso() {
		return repeticaoCompromisso;
	}
	public void setRepeticaoCompromisso(Integer repeticaoCompromisso) {
		this.repeticaoCompromisso = repeticaoCompromisso;
	}

	
	
	@Override
	public String toString() {
		return "Compromisso: "+this.getNome()+
			   " com "+this.getRepeticaoCompromisso()+" repetições por semana. Do dia "+data.getDataInicial()+ " até " +data.getDataFinal();
	}

}

	
