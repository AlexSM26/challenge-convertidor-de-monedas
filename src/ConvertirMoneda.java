import java.util.Scanner;

public class ConvertirMoneda {
    public static void convertir(String monedabase, String monedaTarget, ConsultarMoneda consulta, Scanner lectura){
        double cantidad;
        double cantidadConvertida;

        Monedas monedas = consulta.buscarMoneda(monedabase, monedaTarget);
        System.out.println("La tasa de conversion de hoy\n1"+monedabase+" = "+monedas.conversion_rate()+ " "+monedaTarget);
        System.out.println("Ingrese la cantidad de "+monedas);
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad + monedas.conversion_rate();
        System.out.println(cantidad+" "+monedabase+" = "+cantidadConvertida+ " "+monedas.target_code());
    }

    public static void convertirOtraMoneda(consultarMoneda consulta, Scanner lectura){
        System.out.println("Ingrese el codigo de la moneda base: ");
        String monedaBase = lectura.nextLine().toUpperCase();
        System.out.println("Ingrese la moneda objetivo: ");
        String monedaObjetivo = lectura.nextLine().toUpperCase();
        convertir(monedaBase, monedaObjetivo, consulta, lectura);
    }
}
