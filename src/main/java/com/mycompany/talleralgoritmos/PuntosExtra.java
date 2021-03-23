package com.mycompany.talleralgoritmos;

public class PuntosExtra {

    public static void main(String[] args) {
        System.out.println(factorial(10));
        System.out.println(fibo(5));
        System.out.println(cinco(8));
    }
    
    static public long factorial (long n) {
        if (n == 0 || n == 1){
            return 1;
        }else{
            return n * factorial (--n);
        }
    }
    
    static public long fibo(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return 3 * fibo(n - 2) + 2 * fibo(n - 1);
        }
    
    public static long cinco(int n) {
        if(n == 0||n ==1){
            return 1;
        }else{ 
            if (n % 2 == 0){
                return 2 + cinco(n - 1);
            }else{
                return 3 + cinco(n -  2);
            }
        }
    }
    
}
