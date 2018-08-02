import math.Calculator;
import java.util.*;
import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Calculator calculator=new Calculator();
            System.out.println("introduceti primul si al doilea numar");
            Scanner inp= new Scanner(System.in);
            int primulnumar,aldoileanumar;
            primulnumar = inp.nextInt();
            aldoileanumar = inp.nextInt();
            int ans;
            System.out.println("Apasati tasta " +
                    "  1 pentru adunare" +
                    "  2 pentru scadere" +
                    "  3 pentru inmultire" +
                    "  4 pentru impartire");
            int choose;
            choose = inp.nextInt();
            switch (choose){
                case 1:
                    System.out.println(calculator.aduna( primulnumar,aldoileanumar));
                    break;
                case 2:
                    System.out.println(calculator.scadere( primulnumar,aldoileanumar));
                    break;
                case 3:
                    System.out.println(calculator.inmultire( primulnumar,aldoileanumar));
                    break;
                case 4:
                    System.out.println(calculator.impartire( primulnumar,aldoileanumar));
                    break;
                default:
                    System.out.println("Illigal Operation");

            }}   }

