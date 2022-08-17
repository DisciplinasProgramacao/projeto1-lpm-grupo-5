package entidade;

import java.util.Date;

public class Agenda {
	private String compromisso;
	private Date dataInicial;
	private Date dataFinal;
	private Integer repeticaoCompromisso;
	
	public Agenda() {
	}

	public Agenda(String compromisso, Date dataInicial, Date dataFinal, Integer repeticaoCompromisso) {
		this.compromisso = compromisso;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
		this.repeticaoCompromisso = repeticaoCompromisso;
	}

	public String getCompromisso() {
		return compromisso;
	}

	public void setCompromisso(String compromisso) {
		this.compromisso = compromisso;
	}

	public Date getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(Date dataInicial) {
		this.dataInicial = dataInicial;
	}

	public Date getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}

	public Integer getRepeticaoCompromisso() {
		return repeticaoCompromisso;
	}

	public void setRepeticaoCompromisso(Integer repeticaoCompromisso) {
		this.repeticaoCompromisso = repeticaoCompromisso;
	}

	public String relatorioDeCompromissos() {
		return "Agenda: Compromisso=" + compromisso + " do dia " + dataInicial + " até " + dataFinal
				+ ". Com repitição de " + repeticaoCompromisso + "vezes por semana.";
	}
	
}
