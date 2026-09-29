package Reto;

import java.util.Scanner;

public class Gimnasio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
System.out.println("Usuario");
int usuarios= sc.nextInt();

int usuario=1;
int totalMins=0;
int diasTodos=0;
int mayor=0; 
int usuarioMayor=0;

while (usuario <= usuarios) { //El usuario es igual o menos a usuario es por ejemplo pones 2, entonces si usuario es mayor a 2, ya no pide mas
	System.out.print("Dias del usuario" + usuario + ":");
	int dias = sc.nextInt();
			int dia=1;
			int total=0;
			int mas60=0;
			
while (dia <= dias) {
	System.out.println("Minutos del dia:" + dia);
	int minutos = sc.nextInt();
	total=total+minutos; 
	if (minutos>60) {
		mas60=mas60+1;
				
	}
			dia=dia+1;
}
	System.out.println("Total:" + total);
	System.out.println("Media:"+ total / dias);
	System.out.println("Dias con mas de 60:" + mas60);
	
	if (total>300);{
	System.out.println("Objetivo conseguido");
	}
	totalMins= totalMins + total;
	diasTodos = diasTodos + dias;
	
	if (total > mayor) {
		mayor=total;
		usuarioMayor=usuario;
	}
	usuario=usuario+1;
	
	}
System.out.println("Usuario con mas minutos:"+ usuarioMayor);
System.out.println("Total de minutos:"+ totalMins);
System.out.println("Total de dias:" + diasTodos);
sc.close();
	}
}


	
	


    
