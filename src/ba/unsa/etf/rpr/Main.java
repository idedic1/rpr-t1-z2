package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Unesite broj n: ");
        int brojN=s.nextInt();

        for(int i=1; i<=brojN; i++) {
            int sumaCifara = sumaCifara(i);
            if(i%sumaCifara==0) System.out.print(i+" ");
        }
    }

    public static int sumaCifara(int n){
        int suma=0;
        while(n!=0){
            suma+=n%10;
            n/=10;
        }
        return suma;
    }
}
