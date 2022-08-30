package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entidade.Agenda;
import entidade.Compromisso;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Agenda> list = new ArrayList<>();
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

}
