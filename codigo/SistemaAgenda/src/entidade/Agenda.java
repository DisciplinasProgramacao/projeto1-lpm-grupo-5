package entidade;

import java.util.ArrayList;

public class Agenda {
	private ArrayList<Compromisso> compromisso;
	
	// Um Construtor.
	public Agenda() {
	}
	// Um Construtor.
	public Agenda(Compromisso compromisso) {
		this.compromisso.add(compromisso);
	}
	
	// Um construtor que recebe um Compromisso, um int e um int. Cria um novo Compromisso e adiciona
	// para o ArrayList.
	public Agenda(Compromisso compromisso, int tempo, int repeticoes){
		for(int i=1; i <= repeticoes; i++){
			this.compromisso.add(new Compromisso(compromisso.getNome(), compromisso.getData().plusDays(tempo*i)));
		}
	}
	
}
