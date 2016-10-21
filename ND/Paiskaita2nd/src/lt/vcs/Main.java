package lt.vcs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);



        System.out.println("Iveskite zodi");
        String sakinys = input.next();

        //        for (char raide: sakinys.toCharArray()){
//            if (raide == "a") {


        String rezultas = sakinys.replaceAll("a", "z");
        System.out.println("Pakeicia raides is A i Z: " +rezultas);


        String[] masyv = new String[3];
        masyv[0] = "1";
        masyv[1] = "2";
        masyv[2] = "3";
        for(int i=0; i < masyv.length; i++){
            System.out.println(masyv[i]);
        }

        char arr[]=sakinys.toCharArray();
        for(int i=0;i<arr.length;i++){
            System.out.println("Data at ["+i+"]="+arr[i]);
        }

       /*char[] stringToAr = sakinys.toCharArray();
        for (char output : stringToAr) {
            System.out.println(output);
            */
        System.out.println("raidziu isviso " + sakinys.length());

        }

    }

