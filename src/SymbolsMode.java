import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SymbolsMode {

    public static void SymbolsCalculations(){

        //Scanner operationScaner = new Scanner(System.in);
        //String operation = operationScaner.nextLine();
        System.out.println("52.52*5".matches("\\d+[.]?\\d+?[*]\\d+.?(\\d+)?"));
        String test = "5.5 5";
        String[] tab = new String[20];
        tab = test.split(" ");
        System.out.println(tab[0]);



    }
}
