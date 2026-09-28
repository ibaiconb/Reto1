package Reto;

import java.util.Scanner;

public class r5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        System.out.print("Usuarios: ");
        int usuarios = sc.nextInt();

        int usuario = 1;
        int totalTodos = 0; // Sirve para el total de mins de todos los usuarios
        int diasTodos = 0; //Sirve para el total de dias de todos
        int mayor = 0; //sirve para el usuario con mayores minutos
        int usuarioMayor = 0;

        while (usuario <= usuarios) {

            System.out.print("Días del usuario " + usuario + ": ");
            int dias = sc.nextInt();

            int dia = 1;
            int total = 0;
            int mas60 = 0;

            while (dia <= dias) {

                System.out.print("Minutos del día " + dia + ": ");
                int minutos = sc.nextInt();

                total = total + minutos;

                if (minutos > 60) {
                    mas60 = mas60 + 1;
                }

                dia = dia + 1;
            }

            System.out.println("Total: " + total);
            System.out.println("Media: " + total / dias);
            System.out.println("Días con más de 60: " + mas60);

            if (total > 300) {
                System.out.println("Objetivo conseguido");
            }

            totalTodos = totalTodos + total;
            diasTodos = diasTodos + dias;

            if (total > mayor) {
                mayor = total;
                usuarioMayor = usuario;
            }

            usuario = usuario + 1;
        }

        System.out.println("Usuario con más minutos: " + usuarioMayor);
        System.out.println("Total de minutos: " + totalTodos);
        System.out.println("Total de días: " + diasTodos);

        sc.close();
}
}