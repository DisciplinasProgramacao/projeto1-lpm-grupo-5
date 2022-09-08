package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidade.Agenda;
import entidade.Compromisso;

public class Program {

	public static void main1(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		Agenda ag;
		Compromisso comp;

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		

		System.out.println("Digite a quantidade de compromissos que você deseja cadastrar");
		int n = sc.nextInt();
		for(int i = 1; i<=n;i++) {
			System.out.println("Compromisso: "+ i);
			System.out.println("Qual será o compromisso?");
			sc.next();
			String nome = sc.nextLine();
			System.out.println("Quantas vezes o compromisso irá se repetir por semana?");
			Integer repeticaoCompromisso = sc.nextInt();
			System.out.println("Qual será a data inicial? Format dd/mm/yyyy");
			Date dataInicial = sdf.parse(sc.next());
			}
		}
	public static void limparTela() {
		System.out.flush();
	}

	public static void printMenu() {
		limparTela();
		System.out.println("Bem-vindo:\n");
		System.out.println("1 - Cadastrar compromisso");
		System.out.println("2 - Gerar Relatório entre uma data inicial e uma data final");
		System.out.println("0 - Sair e salvar");
	}

	/**
	 * Recebe um inteiro e retorna um objeto Month
	 * 
	 * @param mesCompromisso o mês do compromisso
	 * @return O método está retornando um objeto Month.
	 */
	public static Month lerMes(int mesCompromisso) {

		switch (mesCompromisso) {
			case 1:
				return Month.JANUARY;
			case 2:
				return Month.FEBRUARY;
			case 3:
				return Month.MARCH;
			case 4:
				return Month.APRIL;
			case 5:
				return Month.MAY;
			case 6:
				return Month.JUNE;
			case 7:
				return Month.JULY;
			case 8:
				return Month.AUGUST;
			case 9:
				return Month.SEPTEMBER;
			case 10:
				return Month.OCTOBER;
			case 11:
				return Month.NOVEMBER;
			case 12:
				return Month.DECEMBER;
			default:
				return null;
		}
	}

	public static void main(String[] args) throws ParseException {
		Scanner ler = new Scanner(System.in);

		try {
			List<Agenda> list = new ArrayList<>();
			int k;

			LocalDate dataInicial = LocalDate.of(2022, Month.AUGUST, 18);

			

			Compromisso c = new Compromisso();

			do {
				printMenu();
				k = ler.nextInt();
				ler.nextLine();

				switch (k) {
					case 1:
						System.out.println("Qual será o compromisso?");
						String nomeCompromisso = ler.nextLine();

						System.out.println("Qual será o dia do comprimisso?");
						int diaCompromisso = ler.nextInt();

						System.out.println("Qual será o mês do comprimisso?");
						int mesCompromisso = ler.nextInt();
						Month mes = lerMes(mesCompromisso);

						System.out.println("Qual será o ano do comprimisso?");
						int anoCompromisso = ler.nextInt();

						System.out.println("A cada quantos dias esse comprimisso irá de repetir?");
						int repeticaoCompromisso = ler.nextInt();

						System.out.println("Você quer que o compromisso se repita quantas vezes?");
						int vezesderepeticaoCompromisso = ler.nextInt();

						LocalDate data = LocalDate.of(anoCompromisso,mes, diaCompromisso);

						Compromisso novoCompromisso = new Compromisso(nomeCompromisso, data, repeticaoCompromisso, vezesderepeticaoCompromisso);

						System.out.println(novoCompromisso);
						
						break;
					case 2:
						System.out.println("Gerar Relatório:");
						break;
					default:
						break;

				}
				System.out.println("Press Enter to continue...");
				System.in.read();
			} while (k != 0);
		} catch (Exception e) {
			System.out.println("");
		}
		ler.close();

	}

}
