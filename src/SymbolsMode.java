import java.util.Scanner;

public class SymbolsMode {

    public static void SymbolsCalculations(){

        System.out.println("Please enter equation: ");
        //Scanner operationScaner = new Scanner(System.in);
        //String operation = operationScaner.nextLine();
        //System.out.println("52.52*5".matches("\\d+[.]?\\d+?[*]\\d+.?(\\d+)?"));
        //System.out.println(operation);
        //String[] equationStr = operation.split("");
        String numberPattern = "[0-9]+";
        String opPattern = "[^0-9]+";
        Scanner sc = new Scanner(System.in);
        int prod = Integer.parseInt(sc.useDelimiter(opPattern).next());
        int sum = 0;
        char ops;


      do {
            ops = sc.useDelimiter(numberPattern).next().charAt(0);
            switch (ops) {
                case '*':
                    prod *= Integer.parseInt(sc.useDelimiter(opPattern).next());
                    break;
                case '/':
                    prod /= Integer.parseInt(sc.useDelimiter(opPattern).next());
                    break;
                case '+':
                    sum += prod;
                    prod = Integer.parseInt(sc.useDelimiter(opPattern).next());
                    break;
                case '-':
                    sum += prod;
                    prod = -Integer.parseInt(sc.useDelimiter(opPattern).next());
                    break;

            }
        } //while ((sc.useDelimiter(opPattern).hasNext() & sc.useDelimiter(numberPattern).hasNext()) == false );
            while (sc.useDelimiter("\n").hasNext() == false);


        System.out.println("koniec");
        System.out.println(sum + prod);




    }
}
