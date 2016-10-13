package lt.vcs;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        String ivedimas = input.next();

        System.out.println("");
        if (ivedimas.equals("pabaiga")){
            System.out.println("Ivestas zodis pabaiga");
        }
        else {
            System.out.println("neivestas");
        }

    }
}
