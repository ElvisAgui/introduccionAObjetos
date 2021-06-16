
package src;

import java.util.*;
public class Rectangulo {

    private int largo;
    private int  ancho;
    private int area;
    private int perimetro;
    Scanner scanner = new Scanner(System.in);
    
    public Rectangulo(){
        ingresarDatos();
    }
    public void ingresarDatos(){
        System.out.println("El largo no puede ser igual al ancho ");
        System.out.print("ingrese el largo ");
        largo = scanner.nextInt();
        do{
            System.out.print("ingrese el ancho ");
            ancho = scanner.nextInt();
            if (largo == ancho) {
                System.out.println("Error, El largo no puede ser igual al ancho "); 
            }
        }while(largo == ancho);
    }
    public int calculoArea(){
        area = largo*ancho;
        return area;
    }
    public int calculoPerimetro(){
        perimetro = 2*largo+2*ancho;
        return perimetro;
    }
    

    public int getAncho() {
        return ancho;
    }
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    public int getLargo() {
        return largo;
    }
    public void setLargo(int largo) {
        this.largo = largo;
    }
    
}
