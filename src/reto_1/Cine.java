package reto_1;

import java.util.Scanner;
public class Cine {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner teclado = new Scanner(System.in);
		
	int cliente;
	int entrada;
	int nino;
	int adulto;
	double precioadulto = 9;
	double precionino = 6;
	double total;
	double totalrecaudado = 0;
	int totaladulto = 0;
	int totalnino  = 0;
	int entradasmax = 0;
	int clientemasentradas = 0;
		
	System.out.println("Cuanto clientes se van a registrar");
	cliente = teclado.nextInt();
		
	for (int i = 1; i <= cliente; i++)
	{
		do
		{
			System.out.println("¿Cuantas entradas quieres?");
			entrada = teclado.nextInt();
			
			System.out.println("¿Cuantos adultos?");
			adulto = teclado.nextInt();
				
			System.out.println("¿Cuantos niños?");
			nino = teclado.nextInt();
			
			if ((adulto + nino != entrada))
			{
				System.out.println("Error: el numero de entradas no coincide");
			}
			
		}
		while (adulto + nino != entrada);
		{
			total = (adulto * precioadulto) + (nino * precionino);
				
			if (entrada >= 5)
				{
					System.out.println("¡Tienes un descuento del 10%!");
					total = total * 0.90;
					System.out.println("Entradas de adultos: " + adulto);
					System.out.println("Entradas de niños:" + nino);
					System.out.println("Numero de entradas total:" + entrada);
					System.out.println("El precio total con descuento es: " + total);
					
					totalrecaudado += total;
					totaladulto += adulto;
					totalnino += nino;
				}
			else if (entrada < 5)
				{
					System.out.println("Entradas de adultos: " + adulto);
					System.out.println("Entradas de niños:" + nino);
					System.out.println("Numero de entradas total:" + entrada);
					System.out.println("El precio total es: " + total);
					
					totalrecaudado += total;
					totaladulto += adulto;
					totalnino += nino;
				}
				
			if  (entrada > entradasmax)
				{
					entradasmax = entrada;
		            clientemasentradas = i;
				}
				
			}
		
		}
		
		System.out.println("Dinero total recaudado: " + totalrecaudado + " €");
		System.out.println("Total entradas de adulto: " + totaladulto);
		System.out.println("Total entradas infantiles: " + totalnino);
		System.out.println("El cliente que compró más entradas fue el cliente " + clientemasentradas + " con " + entradasmax + " entradas.");
			
		teclado.close();
	}
}
