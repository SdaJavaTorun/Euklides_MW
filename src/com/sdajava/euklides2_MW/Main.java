package com.sdajava.euklides2_MW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main  (String[] args) throws IOException {

        int a,b;


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Program wyliczy największy wspólny dzielnik dwóch liczb");

        System.out.println("Wprowadź wartość a: ");
        a = Integer.parseInt(br.readLine());

        System.out.println("Wprowadź wartość b: ");
        b = Integer.parseInt(br.readLine());



        while (a != b){
            if (a > b)
                a -= b;
            else
                b -= a;
        }

        System.out.println("Największy wspólny dzielnik wynosi: " + a);


    }
}
