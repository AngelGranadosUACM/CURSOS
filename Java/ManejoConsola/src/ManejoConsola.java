package Java.ManejoConsola.src;
import java.util.Scanner;

public class ManejoConsola {
    public static void main(String[] args) {
        //Introducir valores por consila
        var consola=new Scanner(System.in);
        System.out.println("escribe tu nombre");
        var nombre=consola.nextLine();
        System.out.print("nombre = " + nombre);
    }
}
