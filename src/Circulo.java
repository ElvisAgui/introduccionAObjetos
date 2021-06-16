package src;
import java.util.*;

public class Circulo{
    private int radio;
    private double perimetro;
    private double area;
    Scanner scanner = new Scanner(System.in);

    public Circulo(){
        ingresarDatos();

    }
    public void ingresarDatos(){
        System.out.print("ingrese el radio: ");
        radio = scanner.nextInt();
    }

    public void calculoArea(){
        area = Math.PI*Math.pow(radio,2);
        System.out.println("el area es; "+area);
    }
    public void calculoPerimetro(){
        perimetro = Math.PI*2*radio;
        System.out.println("el perimetro es; "+perimetro);
    }

    public double getArea() {
        return area;
    }
    public double getPerimtero() {
        return perimetro;
    }
    public int getRadio() {
        return radio;
    }
    public void setRadio(int radio){
        this.radio = radio;
    }


}