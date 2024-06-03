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


QueryConversor query = new QueryConversor();
ConversorMoney consulta =  query.searchPair("USD", "EUR", 2000.0);
        System.out.println(consulta);
    }
}
