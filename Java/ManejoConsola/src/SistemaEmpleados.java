package Java.ManejoConsola.src;

import java.util.Scanner;

public class SistemaEmpleados {
    public static void main(String[] args) {
        System.out.println("*** Sistema de empleados ***");

        var consola=new Scanner(System.in);

        //Nombre del empleado
        System.out.print("Nombre del empleado:  ");
        var nombreEmpleado=consola.nextLine();

        //Edad del empleado
        System.out.print("Edad del empleado: ");
        var edadEmpleado=Integer.parseInt(consola.nextLine());

        //Salario empleado
        System.out.print("Salario empleado: ");
        var salarioEmpleado=Double.parseDouble(consola.nextLine());

        //Es jefe de departamento
        System.out.print("Es jefe de departamenro (true/false)? ");
        var esJefeDepartamento= Boolean.parseBoolean(consola.nextLine());

        //Imprimir los valores del Empleado

        System.out.println("\nDatos del empleado: ");
        System.out.println("\tnombre: "+ nombreEmpleado);
        System.out.println("\tedad: "+edadEmpleado + "Años" );
        System.out.println("\tSalario: $%.2f".formatted(salarioEmpleado));
        System.out.println("\tEs jefe de departamento? "+ esJefeDepartamento);

    }
}
