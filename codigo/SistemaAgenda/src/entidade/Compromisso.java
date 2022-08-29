package entidade;

public class Compromisso {
	private String nome;
	private Integer repeticaoCompromisso;
	private Data data;
	
	public Compromisso() {
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
	public Integer getRepeticaoCompromisso() {
		return repeticaoCompromisso;
	}
	public void setRepeticaoCompromisso(Integer repeticaoCompromisso) {
		this.repeticaoCompromisso = repeticaoCompromisso;
	}
	
	
}
