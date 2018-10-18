package com.company;

/* Zadatak 2 */



import java.util.Scanner;

public class Main {

    static int sumaCifara(int n) {
        int suma = 0;

        while(n!=0) {
            suma+=n%10;
            n/=10;
        }

        return  suma;
    }
    public static void main(String[] args) {
            System.out.println("Unesite neki prirodan broj n :");
            Scanner ulazniTok = new Scanner (System.in);
            int n = ulazniTok.nextInt();

            System.out.println("Brojevi u rasponu od 1 do n djeljivi sa sumom svojih cifara su:");
            for(int i = 1;i <= n;i++) {
                if(i%sumaCifara(i) == 0) System.out.print(i + " ");
            }
    }
}


