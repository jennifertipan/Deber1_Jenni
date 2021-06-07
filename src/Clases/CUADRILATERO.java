
package Clases;

public class CUADRILATERO {
    int a; 
    int b;

    public CUADRILATERO(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    public int area(){
       int x;
       x=this.a*this.b;
        return x;
    }

    public int perimetro(){
       int y;
       y=this.a+this.b+this.a+this.b;
        return y;
    }
}
