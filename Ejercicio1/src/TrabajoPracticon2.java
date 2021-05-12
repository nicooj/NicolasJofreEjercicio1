import java.util.Scanner;

public class TrabajoPracticon2 {
    public static void main(String[] args) {

        nombreYdomicilio();
        cantidadDeProductos();

    }


    public static void nombreYdomicilio (){

        Scanner scan = new Scanner(System.in);

        String fecha = "30/04/2021";
        String domicilio, razonSocial;

        System.out.println("Fecha: " + fecha);

        System.out.println(" Ingrese su nombre: ");
        razonSocial = scan.nextLine();
        System.out.println("Ingrese su domicilio : ");
        domicilio = scan.nextLine();
        System.out.println(razonSocial +" " + domicilio);
    }

    public static void cantidadDeProductos (){
        Scanner scan1 = new Scanner(System.in);
        //Declaracion de variables.
        int cantidadProductos;
        int cantidad;
        float valorUnitario;
        float cantidadMasValor;
        float resultado=0;
        float resultadoTotal=0;

        //Cantidad de productos que tiene que ingresar.
        System.out.println("ingrese cantidad de productos que compro");
        cantidadProductos = scan1.nextInt();

        for (int i=1; i<= cantidadProductos; i++ ){
            System.out.println("Ingrese cantidad de unidades de los productos");
            cantidad = scan1.nextInt();

            System.out.println("ingrese su valor por unidad");
            valorUnitario = scan1.nextFloat();

            System.out.println("Su cantidad es: " + cantidad + " " + " " + "Su valor sin iva: "
                    + valorUnitario);
            cantidadMasValor = cantidad * valorUnitario;
            resultado = cantidadMasValor * 0.21f ;
            System.out.println("El valor total con iva es:" + " " + (resultado + cantidadMasValor));
            resultadoTotal= resultadoTotal + (resultado + cantidadMasValor);


        }
        System.out.println("El monto final de todos los productos es: " + resultadoTotal);





    }
}
