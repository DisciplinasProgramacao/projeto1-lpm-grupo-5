package entidade;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {
	private Date dataInicial;
	private Date dataFinal;
	/* private Mensagem msg; */
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	
	public Data() {
	}
	
	public Data(Date dataInicial, Date dataFinal) {
		super();
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
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
	/* public String validaSeDataInicalMenorQueDataDataFinal() {
		if(getDataInicial().compareTo(getDataFinal())< 0) {
			return msg.getInvalida();
		}
		return msg.getValida();
	}
	 */
	
}
