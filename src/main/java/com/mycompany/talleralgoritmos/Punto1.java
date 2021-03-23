package com.mycompany.talleralgoritmos;

import java.util.Scanner;

public class Punto1 {

    static float res;
    static int contador = 1;
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int n;
        
        System.out.println("Digite hasta que numero se hará la ecuación: ");
        n = leer.nextInt();
        
        iterativo(n);
        recursivo(n);
        System.out.println("El resultado de manera recursiva es: "+ res);
    }
    
    public static void iterativo(int n) {
        float resultado=0;
        
        for (int i=1; i <= n; i++){
            resultado += 1/(float)i;
        }
        System.out.println("El resultado de manera iterativo es: "+ resultado);
        
    }
    
    public static void recursivo (int n){
        
        res += (1 / (float) contador);
        contador++;
        
        if (contador <= n){
            recursivo(n);
        }
        
    }
    
}
