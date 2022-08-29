package entidade;

public class Mensagem {
	private String valida;
	private String invalida;

	public Mensagem() {
	}
	public Mensagem(String valida, String invalida) {
		this.invalida = invalida;
		this.valida = valida;
	}
	public String getValida() {
		return "Dado cadastrado com sucesso";
	}
	public void setValida(String valida) {
		this.valida = valida;
	}
	public String getInvalida() {
		return "Dado inválido";
	}
	public void setInvalida(String invalida) {
		this.invalida = invalida;
	}
	
}