package entidade;


public class Agenda {
	Compromisso compromisso;

	
	public Agenda() {
	}

	public Agenda(Compromisso compromisso) {
		this.compromisso = compromisso;
	}

	@Override
	public String toString() {
		return "Agenda [compromisso=" + compromisso + "]";
	}
	
	
}
