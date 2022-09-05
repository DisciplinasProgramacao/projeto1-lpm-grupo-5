package entidade;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

public class Data {
	private LocalDateTime dataInicial;
	private LocalDateTime dataFinal;
	/* private Mensagem msg; */
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	
	public Data() {
	}
	
	public Data(LocalDateTime dataInicial, LocalDateTime dataFinal) {
		super();
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
	}
	public LocalDateTime getDataInicial() {
		return dataInicial;
	}
	public void setDataInicial(LocalDateTime dataInicial) {
		this.dataInicial = dataInicial;
	}
	public LocalDateTime getDataFinal() {
		return dataFinal;
	}
	public void setDataFinal(LocalDateTime dataFinal) {
		this.dataFinal = dataFinal;
	}
	/* public String validaSeDataInicalMenorQueDataDataFinal() {
		if(getDataInicial().compareTo(getDataFinal())< 0) {
			return msg.getInvalida();
		}
		return msg.getValida();
	}
	 */
	
}
