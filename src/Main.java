import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        consultarMoneda consulta = new ConsultarMoneda();

        int opcion =0;
        while(opcion != 8){
            System.out.println("----------------------------\n"+
            "-Bienvenidos a mi conversor de monedas\n\n"+
            "Ingresa la conversion que deseas realizar\n\n"+
            "1.Dollar a Colones\n"+
            "2.Colones a Dollar\n"+
            "3.Dollar a Real Brasilero\n"+
            "4.Real bresilero a Dollar\n"+
            "5.Dollar a Peso Colombiano\n"+
            "6.Peso Colombiano a Dollar\n"+
            "7.Convertir otra moneda\n"+
            "8.Salir");
        opcion = lectura.nextInt();
        lectura.nextLine();

        switch (opcion){
            case 1:
                ConvertirMoneda.convertir("USD", "COLONES", consulta, lectura);
                break;
            case 2:
                ConvertirMoneda.convertir("COLONES", "COLONES", consulta, lectura;
                break;
            case 3:
                ConvertirMoneda.convertir("USD", "BRL", consulta, lectura);
                break;
            case 4:
                ConvertirMoneda.convertir("BRL", "USD", consulta, lectura;
                break;
            case 5:
                ConvertirMoneda.convertir("USD", "COP", consulta, lectura);
                break;
            case 6:
                ConvertirMoneda.convertir("COP", "USD", consulta, lectura;
                break;
            case 7:
                ConvertirMoneda.convertirOtraMoneda(consulta, lectura);
                break;
            case 8:
                System.out.println("Saliendo....");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
            }
        }
    }
}