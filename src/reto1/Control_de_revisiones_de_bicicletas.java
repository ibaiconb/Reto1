package reto1;

import java.util.Scanner;

public class Control_de_revisiones_de_bicicletas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int dia = 0;
		int mes = 0;
		int ano = 0;

		int numerobicicleta = 0;

		int diarevision = 0;
		int mesrevision = 0;
		int anorevision = 0;

		int necesitanRevision = 0;
		int noNecesitanRevision = 0;

		boolean fechaCorrecta = false;
		boolean fechaCorrectaRevision = false;

		String bicicletasRevision = "";
		String bicicletasNoRevision = "";
		int respuesta = 1;

		/*
		 * Pedimos la fecha de hoy
		 */
		while (fechaCorrecta == false)

		{

			System.out.println("Introduce que dia es hoy:");
			dia = Integer.parseInt(sc.nextLine());

			System.out.println("Ahora introduce que mes es hoy:");
			mes = Integer.parseInt(sc.nextLine());

			System.out.println("Y ahora que año es");
			ano = Integer.parseInt(sc.nextLine());

			if (dia < 1 || dia > 31) {

				System.out.println("Este día no existe");

			} else if (mes < 1 || mes > 12) {

				System.out.println("Este mes no existe");

			} else if (mes == 2 && dia > 28) {

				System.out.println("Este día no existe en febrero");

			} else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {

				System.out.println("Este día no existe en este mes");

			} else {
				fechaCorrecta = true;
			}

		}

		/*
		 * Abrimos el bucle de si necesita mas bicicletas
		 */

		while (respuesta == 1) {
			fechaCorrectaRevision = false;

			/*
			 * Pedimos el numero de indentificación
			 */

			System.out.println("Introduceme el numero de identificación de la bicicleta");
			numerobicicleta = Integer.parseInt(sc.nextLine());

			/*
			 * Ahora pedimos la fecha de la ultima revision
			 */

			while (fechaCorrectaRevision == false) {
				System.out.println("Introduce el dia de la ultima revision");
				diarevision = Integer.parseInt(sc.nextLine());

				System.out.println("Introduce el mes de la ultima revision:");
				mesrevision = Integer.parseInt(sc.nextLine());

				System.out.println("Y ahora el año de la ultima revision");
				anorevision = Integer.parseInt(sc.nextLine());

				if (diarevision < 1 || diarevision > 31) {

					System.out.println("Este día no existe");

				} else if (mesrevision < 1 || mesrevision > 12) {

					System.out.println("Este mes no existe");

				} else if (mesrevision == 2 && diarevision > 28) {

					System.out.println("Este día no existe en febrero");

				} else if ((mesrevision == 4 || mesrevision == 6 || mesrevision == 9 || mesrevision == 11)
						&& diarevision > 30) {

					System.out.println("Este día no existe en este mes");

				} else {
					fechaCorrectaRevision = true;
				}

			}

			/*
			 * Comprobar si necesita revision
			 */

			if (ano < anorevision + 1) {
				System.out.println("Esta bicicleta no necesita revisión");
				noNecesitanRevision++;
				if (noNecesitanRevision == 1) {
					bicicletasNoRevision = "número " + numerobicicleta;
				} else {
					bicicletasNoRevision = bicicletasNoRevision + " y numero " + numerobicicleta;
				}
			}

			else if (ano == anorevision + 1) {

				if (mes < mesrevision) {
					System.out.println("Esta bicicleta no necesita revisión");
					noNecesitanRevision++;
					if (noNecesitanRevision == 1) {
						bicicletasNoRevision = "número " + numerobicicleta;
					} else {
						bicicletasNoRevision = bicicletasNoRevision + " y numero " + numerobicicleta;
					}
				}

				else if (mes == mesrevision && dia <= diarevision) {
					System.out.println("Esta bicicleta no necesita revisión");
					noNecesitanRevision++;
					if (noNecesitanRevision == 1) {
						bicicletasNoRevision = "número " + numerobicicleta;
					} else {
						bicicletasNoRevision = bicicletasNoRevision + " y numero " + numerobicicleta;
					}
				}

				else {
					System.out.println("Esta bicicleta necesita revisión");
					necesitanRevision++;
					if (necesitanRevision == 1) {
						bicicletasRevision = "número " + numerobicicleta;
					} else {
						bicicletasRevision = bicicletasRevision + " y número " + numerobicicleta;
					}
				}
			}

			else {
				System.out.println("Esta bicicleta necesita revisión");
				necesitanRevision++;
				if (necesitanRevision == 1) {
					bicicletasRevision = "número " + numerobicicleta;
				} else {
					bicicletasRevision = bicicletasRevision + " y número " + numerobicicleta;
				}
			}
			/*
			 * Le preguntamos para ver si quiere otra bicicleta
			 */

			System.out.println(
					"Quieres registrar otra bicicleta? Contesta '1' si quieres registrarla o contesta '2' si no quieres registrarla");
			respuesta = Integer.parseInt(sc.nextLine());

		}

		System.out.println("Bicicletas que necesitan revision:" + bicicletasRevision);
		System.out.println("Bicicletas que no necesitan revision:" + bicicletasNoRevision);
		sc.close();

	}

}
