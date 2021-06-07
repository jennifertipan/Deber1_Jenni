package Clases;

import java.util.Scanner;

public class Ejecutacuadri {

    public static void main(String[] args) {
        int t, n, d, l;
        Scanner e = new Scanner(System.in);
        System.out.println("Escoga que va realizar :");
        System.out.println("Cuadrado: o  Rectangulo: 1");
        t=e.nextInt();
        switch(t){
                case 0: 
                    System.out.println("Ingrese el lado del cuadrado");
                    n=e.nextInt();
                    CUADRILATERO k=new CUADRILATERO(n,n);
                    System.out.println("El area es: "+k.area());
                    System.out.println("El perimetro es: "+k.perimetro());
                   break;
                case 1: 
                    System.out.println("Ingrese el lado del rectangulo");
                    d=e.nextInt();
                    System.out.println("Ingrese el lado del rectangulo");
                    l=e.nextInt();
                    CUADRILATERO p=new CUADRILATERO(d,l);
                    System.out.println("El area es: "+p.area());
                    System.out.println("El perimetro es: "+p.perimetro());
                          
    }

    }

}
