package reto1;

import java.util.Scanner;

public class Videojuego {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int contador = 0;
		int contadorPartidas = 0;
		int numeroPartidas = 0;
		int enemigosDerrotados = 0;
		int cantidadJugadores = 0;
		int totalEnemigos = 0;
		int enemigosTodosJugadores = 0;

		String nombresJugadores;
		String jugadorMayorPuntuacion = "";

		double puntosPartidas = 0;
		double puntuacionTotal = 0;
		double puntuacionMedia = 0;
		double mayorPuntuacion = 0;
		double puntuacionTodosJugadores = 0;

		System.out.println("¿Cuantos jugadores se van a registrar?");
		cantidadJugadores = Integer.parseInt(sc.nextLine());

		while (contador < cantidadJugadores) {
			System.out.println("Introduceme el nombre del jugador");
			nombresJugadores = sc.nextLine();
			System.out.println("Introduceme el numero de partidas del jugador " + nombresJugadores);
			numeroPartidas = Integer.parseInt(sc.nextLine());
			contadorPartidas = 0;
			puntuacionTotal = 0;
			totalEnemigos = 0;
			while (contadorPartidas < numeroPartidas) {
				System.out.println("Introduceme los puntos obtenidos en la partida " + (contadorPartidas + 1));
				puntosPartidas = Integer.parseInt(sc.nextLine());
				if (puntosPartidas > 1000) {
					puntosPartidas = puntosPartidas + 100;
				}
				puntuacionTotal = puntuacionTotal + puntosPartidas;
				System.out.println(
						"Ahora introduce el mumero de enemigos derrotados en la partida " + (contadorPartidas + 1));
				enemigosDerrotados = Integer.parseInt(sc.nextLine());
				totalEnemigos = totalEnemigos + enemigosDerrotados;
				contadorPartidas++;
			}
			puntuacionMedia = puntuacionTotal / numeroPartidas;
			System.out.println(
					"La puntuacion total obtenida por el jugador " + nombresJugadores + " es de " + puntuacionTotal);
			System.out.println("El numero total de enemigos derrotados es de " + totalEnemigos);
			System.out.println("La puntuacion media por partida es de " + puntuacionMedia);

			if (puntuacionTotal > mayorPuntuacion) {
				mayorPuntuacion = puntuacionTotal;
				jugadorMayorPuntuacion = nombresJugadores;
			}

			puntuacionTodosJugadores = puntuacionTodosJugadores + puntuacionTotal;

			enemigosTodosJugadores = enemigosTodosJugadores + totalEnemigos;

			contador++;
		}

		System.out.println("El jugador con mayor puntuacion es " + jugadorMayorPuntuacion);

		System.out.println("La puntuacion total de todos los jugadores es de " + puntuacionTodosJugadores);

		System.out.println(
				"El numero total de enemigos derrotados por todos los jugadores es de " + enemigosTodosJugadores);
		
		sc.close();
	}

}
