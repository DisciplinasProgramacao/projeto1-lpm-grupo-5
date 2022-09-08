package entidade;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Compromisso {
	private String nome;
	private int repeticaoCompromisso;
	private int vezesRepeticao;
	private LocalDate data;

	private LocalDate dataFinal;

	// Um Construtor.
	public Compromisso() {
	}
	// Um Construtor.
	public Compromisso(String nome, LocalDate data) {
		this.nome = nome;
		this.data = data;
	}

	// Um Construtor.
	public Compromisso(String nome, LocalDate data, int repeticaoCompromisso, int vezesRepeticao) {
		super();
		this.nome = nome;
		this.data = data;
		this.repeticaoCompromisso = repeticaoCompromisso;
		this.vezesRepeticao = vezesRepeticao;
	}

	// Os getters e setters.
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getData() {
		return data;
	}

	public int getRepeticaoCompromisso() {
		return repeticaoCompromisso;
	}

	public void setRepeticaoCompromisso(int repeticaoCompromisso) {
		this.repeticaoCompromisso = repeticaoCompromisso;
	}

	public int getVezesRepeticaoCompromisso() {
		return vezesRepeticao;
	}

	public void setVezesRepeticaoCompromisso(int vezesRepeticao) {
		this.vezesRepeticao = vezesRepeticao;
	}


	public LocalDate getDataFinal() {
		return dataFinal;
	}

	/**
	 * A função retorna uma string que contém o nome do evento, a data do evento, o
	 * repetição do evento e o número de vezes que o evento é repetido
	 * 
	 * @return O método toString está sendo retornado.
	 */
	public String relatorioCompromisso() {
		return "Compromisso: Ida ao " + this.getNome() +
				" em " + this.getData() + ", e  repete a cada " + this.getRepeticaoCompromisso() + " por " + this.getVezesRepeticaoCompromisso() + " vezes.";
	}
	
}
