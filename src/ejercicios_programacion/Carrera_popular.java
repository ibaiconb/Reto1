package ejercicios_programacion;

import java.util.Scanner;

public class Carrera_popular {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int totalParticipantes = 0;
		int menosDe60 = 0;
		int masDe3Carreras = 0;
		int sumaTiemposSeg = 0;
		int mejorTiempoSeg = -1;

		boolean continuar = true;

		while (continuar) {

			String DNI = "";
			String tipo_carre = "";
			int num_carre = 0;
			int minutos = 0;
			int segundos = 0;

			boolean fase_DNI = false;
			boolean fase_tipo = false;
			boolean fase_num = false;
			boolean fase_tiempo = false;
			boolean fase_continuar = false;

			while (!fase_DNI) {
				System.out.print("Introduce tu DNI (XXXXXXXXY): ");
				DNI = scanner.nextLine().trim();
				if (!DNI.matches("[0-9]{8}[A-Z]")) {
					System.out.println("El valor introducido no es correcto.");
				} else {
					fase_DNI = true;
				}
			}

			while (!fase_tipo) {
				System.out.print("¿Participas en la carrera individual o por parejas? Introduce INDIVIDUAL o PAREJAS: ");
				tipo_carre = scanner.nextLine().trim();
				if (!tipo_carre.equals("INDIVIDUAL") && !tipo_carre.equals("PAREJAS")) {
					System.out.println("El texto introducido no es valido.");
				} else {
					fase_tipo = true;
				}
			}

			while (!fase_num) {
				System.out.print("¿En cuantas competiciones has participado anteriormente? ");
				String textoNum = scanner.nextLine().trim();
				if (!textoNum.matches("[0-9]{1,9}")) {
					System.out.println("El valor introducido no es correcto.");
				} else {
					num_carre = Integer.parseInt(textoNum);
					fase_num = true;
				}
			}

			while (!fase_tiempo) {
				System.out.print("Introduce los minutos del tiempo realizado: ");
				String textoMin = scanner.nextLine().trim();
				System.out.print("Introduce los segundos del tiempo realizado: ");
				String textoSeg = scanner.nextLine().trim();
				if (!textoMin.matches("[0-9]{1,9}") || !textoSeg.matches("[0-9]|[1-5][0-9]")) {
					System.out.println("El valor introducido no es correcto.");
				} else {
					minutos = Integer.parseInt(textoMin);
					segundos = Integer.parseInt(textoSeg);
					fase_tiempo = true;
				}
			}

			int tiempoSeg = minutos * 60 + segundos;

			if (tiempoSeg < 60 * 60) {
				System.out.println("Has terminado la carrera en menos de 60 minutos.");
				menosDe60++;
			} else {
				System.out.println("No has terminado la carrera en menos de 60 minutos.");
			}

			totalParticipantes++;
			sumaTiemposSeg += tiempoSeg;

			if (num_carre > 3) {
				masDe3Carreras++;
			}

			if (mejorTiempoSeg == -1 || tiempoSeg < mejorTiempoSeg) {
				mejorTiempoSeg = tiempoSeg;
			}

			System.out.println("Participante " + DNI + " (" + tipo_carre + ") registrado.");

			while (!fase_continuar) {
				System.out.print("¿Desea continuar registrando participantes? Introduce S o N: ");
				String resp = scanner.nextLine().trim();
				if (resp.equals("S")) {
					fase_continuar = true;
					continuar = true;
				} else if (resp.equals("N")) {
					fase_continuar = true;
					continuar = false;
				} else {
					System.out.println("El texto introducido no es valido.");
				}
			}
		}

		System.out.println("Numero total de participantes registrados: " + totalParticipantes);
		System.out.println("Participantes que han terminado en menos de 60 minutos: " + menosDe60);
		System.out.println("Participantes que han participado anteriormente en mas de 3 carreras: " + masDe3Carreras);

		if (totalParticipantes > 0) {
			int mediaSeg = sumaTiemposSeg / totalParticipantes;
			System.out.println("Tiempo medio: " + (mediaSeg / 60) + " minutos y " + (mediaSeg % 60) + " segundos.");
			System.out.println("Mejor tiempo registrado: " + (mejorTiempoSeg / 60) + " minutos y " + (mejorTiempoSeg % 60) + " segundos.");
		}

		System.out.println("Fin del programa");
		scanner.close();
	}
}