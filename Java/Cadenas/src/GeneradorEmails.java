public class GeneradorEmails {
    public static void main(String[] args) {
        System.out.println("*** Generador de emails ***");
        //Nombre completo del usuario
        var nombreCompleto="Angel Granados Perez";
        System.out.println("nombreCompleto = " + nombreCompleto);

        //Procesar o normalizar el nombre del usuario
        //Limpiar los espacios en blanco al inicio y al final
        var nombreNormalizado=nombreCompleto.strip();
        //Reemplazamos los espacios en blancos por puntos
        nombreNormalizado=nombreNormalizado.replace(" ",".");
        //Convertimos a minusculas el nombre
        nombreNormalizado=nombreNormalizado.toLowerCase();

        //Datos de la empresa
        var nombreEmpresa="Global Mentoriong";
        System.out.println("\nNombre empresa: "+ nombreEmpresa);
        var extensionDominio=".com.mx";

        //Quitamos los espacios en blanco y convertimos a minisculas
        var nombreEmpresaNormalizado=nombreEmpresa.strip().replace(" ",".").toLowerCase();
        var dominioEmailNormalizado="@"+ nombreEmpresaNormalizado + extensionDominio;
        System.out.println("dominioEmailNormalizado = " + dominioEmailNormalizado);
        
        //Creamos el email final
        var emailNormalizado=nombreNormalizado+dominioEmailNormalizado;
        System.out.println("emailNormalizado = " + emailNormalizado);

    }
}
