import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Podaj w jakim formacie chcesz liczyc (slowny/symbole:");
        Scanner formatScaner = new Scanner(System.in);

        //String format = formatScaner.nextLine();
        SymbolsMode symbol = new SymbolsMode();
        TxtMode txt = new TxtMode();

        SymbolsMode.SymbolsCalculations();



    }
}