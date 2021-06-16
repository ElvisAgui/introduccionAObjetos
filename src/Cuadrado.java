 
package src;

public class Cuadrado{
    private int lado;
    private int area;
    private int perimetro;
    public Cuadrado(){

    }

    public Cuadrado(int lado){
        this.lado = lado;
        
    }
    public int getLado() {
        return lado;
    }
    public void setLado(int lado) {
        this.lado = lado;
    }
    public int area(){
        area = lado*lado;
        return area;
    }
    public int perimetro(){
        perimetro = 4*lado;
        return perimetro;
    }


    
}