import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int select = 0;
        String menu = """
                *******************************************************************
                Sea bienvenido/a al conversor de moneda del programa ALURA - ONE 🧮
                                
                Seleccione una de las siguientes opciones:
                                
                1) Dólar =>> Peso argentino
                2) Peso argentino =>> Dólar
                3) Dólar =>> Real brasileño
                4) Real brasileño =>> Dólar
                5) Dólar =>> Peso colombiano
                6) Peso colombiano =>> Dolár
                7) Salir
                                
                > Elija una opción válida...                
                *******************************************************************
                                
                """;

        String inPair = "";
        String outPair = "";
        double money = 0;
        String inMoney = "";
        String outMoney = "";

        Scanner input = new Scanner(System.in);


        while (select != 7) {
            System.out.println(menu);
            select = input.nextInt();

            switch (select) {
                case 1:
                    System.out.println("Eligío DÓLAR AMERICANO a PESO ARGENTINO, ingrese la cantidad de dinero a cambiar:");
                    inPair = "USD";
                    outPair = "ARS";
                    inMoney = "dólar americano";
                    outMoney = "peso argentino";
                    money = input.nextDouble();
                    break;
                case 2:
                    System.out.println("Eligío PESO ARGENTINO a DÓLAR AMERICANO, ingrese la cantidad de dinero a cambiar:");
                    inPair = "ARS";
                    outPair = "USD";
                    inMoney = "peso argentino";
                    outMoney = "dólar americano";
                    money = input.nextDouble();
                    break;
                case 3:
                    System.out.println("Eligío DÓLAR AMERICANO a REAL BRASILEÑO, ingrese la cantidad de dinero a cambiar:");
                    inPair = "USD";
                    outPair = "BRL";
                    inMoney = "dólar americano";
                    outMoney = "real brasileño";
                    money = input.nextDouble();
                    break;
                case 4:
                    System.out.println("Eligío REAL BRASILEÑO a DÓLAR AMERICANO, ingrese la cantidad de dinero a cambiar:");
                    inPair = "BRL";
                    outPair = "USD";
                    inMoney = "real brasileño";
                    outMoney = "dólar americano";
                    money = input.nextDouble();
                    break;
                case 5:
                    System.out.println("Eligío DÓLAR AMERICANO a PESO COLOMBIANO, ingrese la cantidad de dinero a cambiar:");
                    inPair = "USD";
                    outPair = "COP";
                    inMoney = "dólar americano";
                    outMoney = "peso colombiano";
                    money = input.nextDouble();
                    break;
                case 6:
                    System.out.println("Eligío PESO COLOMBIANO a DÓLAR AMERICANO, ingrese la cantidad de dinero a cambiar:");
                    inPair = "COP";
                    outPair = "USD";
                    inMoney = "peso colombiano";
                    outMoney = "dólar americano";
                    money = input.nextDouble();
                    break;
                case 7:
                    System.out.println("Vuelva pronto, gracias por usar nuestro sistema de conversión de moneda");
                    break;
                default:
                    System.out.println("Ingrese una opción válida.");
            }
            QueryConversor query = new QueryConversor();
            ConversorMoney consulta = query.searchPair(inPair, outPair, money);
            if (select < 7 && select > 0) {
                System.out.println("Su cambio está hecho, los " + money + " de " + inMoney + " corresponden a " + consulta.conversion_result() + " de " + outMoney);
            }
        }


    }
}
