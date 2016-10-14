package lt.vcs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);



        System.out.println("Iveskite zodi");
        String sakinys = input.next();


       char[] stringToAr = sakinys.toCharArray();
        for (char output : stringToAr) {
            System.out.println(output);

        }
        /* pakeicia raide*/
        String result = sakinys.replace('a', 'z');
        System.out.println("Pakeistos a raides i z: " +result);


        System.out.println("raidziu isviso " + sakinys.length());

        }

    }

