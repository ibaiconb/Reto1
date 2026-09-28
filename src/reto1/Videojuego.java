package reto1;

import java.util.Scanner;

public class Videojuego {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int contador=0;
		int contadorPartidas=0;
		int numeroPartidas=0;
		int enemigosDerrotados=0;
		int cantidadJugadores=0;
		int totalEnemigos=0;
		String nombresJugadores;
		double puntosPartidas=0;
		double puntuacionTotal=0;
		
		
		System.out.println("¿Cuantos jugadores se van a registrar?");
		cantidadJugadores = Integer.parseInt(sc.nextLine());
		
		while (contador<cantidadJugadores) 
					{
					System.out.println("Introduceme el nombre del jugador");
					nombresJugadores = sc.nextLine();
					System.out.println("Introduceme el numero de partidas del jugador "+nombresJugadores);
					numeroPartidas = Integer.parseInt(sc.nextLine());
					 contadorPartidas = 0;
					 puntuacionTotal = 0;
					 totalEnemigos = 0;
					while (contadorPartidas < numeroPartidas) 
																{
																System.out.println("Introduceme los puntos obtenidos en la partida "+(contadorPartidas+1));
																puntosPartidas = Integer.parseInt(sc.nextLine());
																if (puntosPartidas>1000) {puntosPartidas=puntosPartidas+100;}		
																puntuacionTotal=puntacionTotal+puntosPartidas;
																System.out.println("Ahora introduce el mumero de enemigos derrotados en la partida "+(contadorPartidas+1));
																enemigosDerrotados= Integer.parseInt(sc.nextLine());
																totalEnemigos= totalEnemigos+enemigosDerrotados;
																contadorPartidas++;
																}
					System.out.println("La puntuacion total obtenida por el jugador "+nombresJugadores+ " es de "+puntuacionTotal);
					System.out.println("El numero total de enemigos derrotados es de "+totalEnemigos);
					
										   
					
					
					
					
					
					
					}
		
	}		
}


