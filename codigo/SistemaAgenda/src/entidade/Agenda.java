package entidade;


public class Agenda {
	private Compromisso compromisso;
	private Data data;

	
	public Agenda() {
	}

	public Agenda(Compromisso compromisso) {
		this.compromisso = compromisso;
	}


	public Data getData() {
		return data;
	}

	public void setDete(Data data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Compromisso: "+compromisso.getNome()+
			   " com "+compromisso.getRepeticaoCompromisso()+" repetições por semana. Do dia "+data.getDataInicial()+ " até " +data.getDataFinal();
	}
	
	
}
