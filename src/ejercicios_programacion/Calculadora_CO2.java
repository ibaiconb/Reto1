package ejercicios_programacion;

import java.util.Scanner;

public class Calculadora_CO2 {

	public static void main(String[] args) {
// Este es la main del proyecto.
		Scanner scanner = new Scanner(System.in);

		int numPersonas = 0;
		double totalGrupo = 0;
		boolean fasePersonas = false;

		while (!fasePersonas) {
			System.out.print("¿Cuantas personas se van a registrar? ");
			String texto = scanner.nextLine().trim();
			if (!texto.matches("[1-9][0-9]*")) {
				System.out.println("El valor introducido no es correcto.");
			} else {
				numPersonas = Integer.parseInt(texto);
				fasePersonas = true;
			}
		}

		for (int persona = 1; persona <= numPersonas; persona++) {
			double totalPersona = 0;
			boolean finalizar = false;

			System.out.println("Persona " + persona);

			while (!finalizar) {
				int opcion = 0;
				boolean faseMenu = false;

				while (!faseMenu) {
					System.out.println("1. Transporte en coche");
					System.out.println("2. Transporte en autobus");
					System.out.println("3. Transporte en bicicleta");
					System.out.println("4. Uso de plancha");
					System.out.println("5. Uso del ordenador");
					System.out.println("6. Uso del movil");
					System.out.println("7. Finalizar actividades del dia");
					System.out.print("Elige una opcion: ");
					String textoOpcion = scanner.nextLine().trim();
					if (!textoOpcion.matches("[1-7]")) {
						System.out.println("El valor introducido no es correcto.");
					} else {
						opcion = Integer.parseInt(textoOpcion);
						faseMenu = true;
					}
				}

				if (opcion == 1) {
					double km = 0;
					boolean faseKm = false;
					while (!faseKm) {
						System.out.print("¿Cuantos km recorrio en coche? ");
						String textoKm = scanner.nextLine().trim().replace(',', '.');
						if (!textoKm.matches("[0-9]+(\\.[0-9]+)?")) {
							System.out.println("El valor introducido no es correcto.");
						} else {
							km = Double.parseDouble(textoKm);
							faseKm = true;
						}
					}
					totalPersona = totalPersona + km * 0.21;
				} else if (opcion == 2) {
					double km = 0;
					boolean faseKm = false;
					while (!faseKm) {
						System.out.print("¿Cuantos km recorrio en autobus? ");
						String textoKm = scanner.nextLine().trim().replace(',', '.');
						if (!textoKm.matches("[0-9]+(\\.[0-9]+)?")) {
							System.out.println("El valor introducido no es correcto.");
						} else {
							km = Double.parseDouble(textoKm);
							faseKm = true;
						}
					}
					totalPersona = totalPersona + km * 0.10;
				} else if (opcion == 3) {
					double km = 0;
					boolean faseKm = false;
					while (!faseKm) {
						System.out.print("¿Cuantos km recorrio en bicicleta? ");
						String textoKm = scanner.nextLine().trim().replace(',', '.');
						if (!textoKm.matches("[0-9]+(\\.[0-9]+)?")) {
							System.out.println("El valor introducido no es correcto.");
						} else {
							km = Double.parseDouble(textoKm);
							faseKm = true;
						}
					}
					totalPersona = totalPersona + km * 0;
				} else if (opcion == 4) {
					int uso = -1;
					boolean faseUso = false;
					while (!faseUso) {
						System.out.print("¿Uso la plancha? Introduce 1 (si) o 0 (no): ");
						String textoUso = scanner.nextLine().trim();
						if (textoUso.equals("1")) {
							uso = 1;
							faseUso = true;
						} else if (textoUso.equals("0")) {
							uso = 0;
							faseUso = true;
						} else {
							System.out.println("El valor introducido no es correcto.");
						}
					}
					if (uso == 1) {
						double horas = 0;
						boolean faseHoras = false;
						while (!faseHoras) {
							System.out.print("¿Cuantas horas uso la plancha? ");
							String textoHoras = scanner.nextLine().trim().replace(',', '.');
							if (!textoHoras.matches("[0-9]+(\\.[0-9]+)?")) {
								System.out.println("El valor introducido no es correcto.");
							} else {
								horas = Double.parseDouble(textoHoras);
								faseHoras = true;
							}
						}
						totalPersona = totalPersona + horas * 0.70;
					}
				} else if (opcion == 5) {
					double horas = 0;
					boolean faseHoras = false;
					while (!faseHoras) {
						System.out.print("¿Cuantas horas uso el ordenador? ");
						String textoHoras = scanner.nextLine().trim().replace(',', '.');
						if (!textoHoras.matches("[0-9]+(\\.[0-9]+)?")) {
							System.out.println("El valor introducido no es correcto.");
						} else {
							horas = Double.parseDouble(textoHoras);
							faseHoras = true;
						}
					}
					totalPersona = totalPersona + horas * 0.08;
				} else if (opcion == 6) {
					double horas = 0;
					boolean faseHoras = false;
					while (!faseHoras) {
						System.out.print("¿Cuantas horas uso el movil? ");
						String textoHoras = scanner.nextLine().trim().replace(',', '.');
						if (!textoHoras.matches("[0-9]+(\\.[0-9]+)?")) {
							System.out.println("El valor introducido no es correcto.");
						} else {
							horas = Double.parseDouble(textoHoras);
							faseHoras = true;
						}
					}
					totalPersona = totalPersona + horas * 0.02;
				} else if (opcion == 7) {
					finalizar = true;
				}
			}

			System.out.println("CO2 emitido por la persona " + persona + ": " + totalPersona + " kg");
			totalGrupo = totalGrupo + totalPersona;
		}

		System.out.println("CO2 emitido por el grupo: " + totalGrupo + " kg");
		System.out.println("Fin del programa");
		scanner.close();
	}
}