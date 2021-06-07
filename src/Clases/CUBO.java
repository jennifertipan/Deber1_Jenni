
package Clases;


public class CUBO {
    int a;
    int b; 
    int c;

    public CUBO(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public CUBO(){
        
    }
    public int volumen(){
        int j;
        j=this.a*this.b*this.c;
        return j;
    }
}
