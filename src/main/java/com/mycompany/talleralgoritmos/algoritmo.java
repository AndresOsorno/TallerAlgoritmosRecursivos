package com.mycompany.talleralgoritmos;

import java.util.Scanner;

public class algoritmo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;      
        System.out.println("Digite hasta donde se sumara (n): ");
        n = leer.nextInt();
        
        iterativo(n);
        glauss(n);
        
    }   
    
    public static void iterativo(int num){
        
        long t1, t2, dif;
        int res=0;
        
        //De forma iterativa
        t1 = System.nanoTime();
        for (int i = 1; i<=num; i++){
            res = res + i;
        }
        t2 = System.nanoTime();
        dif = t2 - t1;
        
        System.out.println("De manera iterativa el resultado es: "+ res);
        System.out.println("El tiempo usado en nanoTime es de: "+ dif);
        
    }
    
    public static void glauss(int num){
        
        long t1, t2, dif;
        
        //Solucion de glauss
        //Seria algo tipo S=n(+1)/2
        t1 = System.nanoTime();
        System.out.println("Usando la solucion de gauss el resultado es: "+ ((num*(num+1))/2));
        t2 = System.nanoTime();
        dif = t2 - t1;
        System.out.println("El tiempo usado en nanoTime es de: "+ dif);
    }
    
}
