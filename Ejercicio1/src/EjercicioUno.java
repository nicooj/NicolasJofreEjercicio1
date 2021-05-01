import java.util.Scanner;

public class EjercicioUno {
    public static void main(String[] args) {
        //Declaro la clase scanner.
        Scanner scan = new Scanner(System.in);


        //Fecha
        String fecha = "30/04/2021";

        //Datos de los productos
        int cantidad1;
        int cantidad2;
        String descripcion1;
        String descripcion2;
        float valorUnitario1;
        float valorUnitario2;
        float resultado1=0;
        float cantidadMasValor1= 0;
        float resultado2= 0;
        float cantidadMasValor2= 0;

        //Datos del comprador
        String razonSocial;
        String domilicio;


        //Fecha
        System.out.println("Fecha: " + fecha);

        //Nombre y domicilio .
        System.out.println(" Ingrese su nombre: ");
        razonSocial = scan.nextLine();
        System.out.println("Ingrese su domicilio : ");
        domilicio = scan.nextLine();
        System.out.println(razonSocial +" " + domilicio);

        //Datos de los productos
        System.out.println("Ingrese cantidad del primer producto");
        cantidad1 = scan.nextInt();

        System.out.print("Ingrese descripcion del primer producto");
        descripcion1 = scan.next();

        System.out.println("Ingrese valor unitario del primer producto");
        valorUnitario1= scan.nextFloat();

        System.out.println("Su cantidad es: " + cantidad1 + " " + descripcion1 + " " + "Su valor es: "
                + valorUnitario1);
        cantidadMasValor1 = cantidad1 * valorUnitario1;
        resultado1 = cantidadMasValor1 * 0.21f ;
        System.out.println("El valor total es" + " " + (resultado1 + cantidadMasValor1));


        //Datos de los productos 2
        System.out.println("Ingrese cantidad del segundo producto");
        cantidad2 = scan.nextInt();

        System.out.print("Ingrese descripcion del segundo producto");
        descripcion2 = scan.next();

        System.out.println("Ingrese valor unitario del segundo producto");
        valorUnitario2= scan.nextFloat();

        System.out.println("Su cantidad es: " + cantidad2 + " " + descripcion2 + " " + "Su valor es: "
                + valorUnitario2);
        cantidadMasValor2 = cantidad2 * valorUnitario2;
        resultado2 = cantidadMasValor2 * 0.21f ;
        System.out.println("El valor total es" + " " + (resultado2 + cantidadMasValor2));

        //Iva, subtotal y total.
        String iva = "21%";
        float subtotal= cantidadMasValor1 + cantidadMasValor2;
        float total= (resultado1 + cantidadMasValor1 ) + (resultado2 + cantidadMasValor2);

        //iva
        System.out.println("El iva es: " + iva);

        //SubTotal
        //System.out.println("El subtotal es: " + (cantidadMasValor1 + cantidadMasValor2));
        System.out.println("El subtotal es: " + subtotal);

        //El total
        // System.out.println("El total es: " + ((resultado1 + cantidadMasValor1) + " " + (resultado2
        // + cantidadMasValor2)));
        System.out.println("El total es: " + total);
    }
}
