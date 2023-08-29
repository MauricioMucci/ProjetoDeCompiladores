package org.test;

import java.io.*;
import java.util.Scanner;
public class Karloff {
    
    public static void main(String[] args) {
        int numTermos;
        int contador;
        contador = 0;
        Scanner scan = new Scanner(System.in);
        numTermos = scan.nextInt();
        scan.nextLine();
        
        while ((contador < (numTermos + 1))) {
            System.out.println(fibonnaci(contador));
            contador = (contador + 1);
        }
    }
    
    public static int fibonnaci(int seq) {
        if ((seq < 2)) {
            return 1;
        }
        return (fibonnaci((seq - 1)) + fibonnaci((seq - 2)));
    }
    
}
