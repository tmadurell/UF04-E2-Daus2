

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int intents = 0;
        int guanyades = 0;
        JocdeDaus joc = new JocdeDaus();

        for (int opcio = menu(); opcio != 0; opcio = menu()) {

            System.out.println();

            ++intents;

            boolean triples = joc.jugar();

            if (triples) {
                System.out.println("Has guanyat!");
                ++guanyades;
            }

        }

        System.out.println("Has llançat " + intents + " y has guanyat " + guanyades + " partides!");

    }
        public static int menu(){

            Scanner scanner = new Scanner(System.in);

            System.out.println("¿Vols jugar a tirar els daus?");
            System.out.println("Espero que et surtin els tres daus amb el mateix valor:");
            System.out.println("1 - Jugar a tirar els daus");
            System.out.println("0 - Finalitzar");
            System.out.println("Tria:> ");
            return scanner.nextInt();

        }






    }

