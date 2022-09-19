package threads;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Controle controle = new Controle();

		Relogio relogio = new Relogio(controle);
		relogio.start();
		Cronometro cronometro = new Cronometro(controle);
		cronometro.start();
		Alarme alarme = new Alarme(controle);

		Scanner sc = new Scanner(System.in);

		boolean runApplication = true;
		int horas, minutos, segundos;

		while (runApplication) {
			int menu;

			System.out.println();
			System.out.println("1 Ajustar horário");
			System.out.println("2 Visualizar horário");
			System.out.println("3 Iniciar cronômetro");
			System.out.println("4 Parar cronômetro");
			System.out.println("5 Zerar cronômetro");
			System.out.println("6 Definir alarme");
			System.out.println("0 Sair");
			System.out.println("-----------------------------");
			System.out.println("Digite sua escolha: ");
			menu = sc.nextInt();
			System.out.println();

			switch (menu) {
			case 1:
				System.out.print("Digite a hora: ");
				horas = sc.nextInt();
				System.out.print("Digite os minutos: ");  
				minutos = sc.nextInt();
				System.out.print("Digite os segundos: ");
				segundos = sc.nextInt();
				controle.setHoraDoRelogio(tempoSegundos(horas, minutos, segundos));
				break;

			case 2:
				timeToString(controle.getHoraDoRelogioSegundos());
				break; 

			case 3:
				cronometro.setStatus(true);
				System.out.println("O cronômetro está em execução!");
				break;

			case 4:
				cronometro.setStatus(false);
				System.out.println("O cronômetro parou em: ");
				timeToString(controle.getCronometroSegundos());
				break;

			case 5:
				System.out.println("O cronômetro foi zerado!");
				cronometro.setStatus(false);
				controle.reiniciarCronometro();
				break;

			case 6:
				System.out.print("Digite a hora: ");
				horas = sc.nextInt();
				System.out.print("Digite os minutos: ");
				minutos = sc.nextInt();
				controle.criarAlarme(tempoSegundos(horas, minutos));
				alarme.start();
				break;

			case 0:
				runApplication = false;
				break;

			default:
				System.out.println("Opção inválida!!!");
				break;
			}
		}

		sc.close();
		
		System.out.println();
		System.out.println("Programa encerrado!!!");

	}

	public static int tempoSegundos(int horas, int minutos, int segundos) {
		int totalSegundos = horas * 3600;
		totalSegundos += minutos * 60;
		totalSegundos += segundos;
		return totalSegundos;
	}

	public static int tempoSegundos(int horas, int minutos) {
		int totalSegundos = horas * 3600;
		totalSegundos += minutos * 60;
		return totalSegundos;
	}

	public static void timeToString(int segundos) {
		int segundosAtuais, horas, minutos;
		segundosAtuais = segundos;
		horas = segundosAtuais / 3600;
		segundosAtuais -= horas * 3600;
		minutos = segundosAtuais / 60;
		segundosAtuais -= minutos * 60;

		System.out.printf("%02d:%02d:%02d", horas, minutos, segundosAtuais);
		System.out.println();
	}

} 
