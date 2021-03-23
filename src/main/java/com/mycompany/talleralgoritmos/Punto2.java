package com.mycompany.talleralgoritmos;

public class Punto2 {

    static int count = 1;
    static int num = 1;
    static double enl=1.0;
    static double fact=1.0;
    static double  delta=1.0;
     
    public static void main(String[] args) {
        RecusiveWat();
        System.out.println(enl);
    }

  

    static public void RecusiveWat() {
       

        if (enl != enl + delta) {

            enl += delta;

            count += 1;

            fact *= count;

            delta = 1.0 / fact;

            RecusiveWat();

        }

    }
    
}
