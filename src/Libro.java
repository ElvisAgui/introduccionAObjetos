package src;
import java.util.*;


public class Libro {
    private int numHojas;
    private String nombreLibro;
    private boolean disponible = false;
    private int diasPres;
    Scanner entrada = new Scanner(System.in);
    public Libro(){

    }
    public Libro(String nombreLibro,boolean disponible,int diasPres, int numHojas){
        this.nombreLibro = nombreLibro;
        this.diasPres = diasPres;
        this.disponible = disponible;
        this.numHojas = numHojas;
    }
    public void prestamo(){
        System.out.print("ingrese el la cantidad de dias para prestamo ");
        this.diasPres = entrada.nextInt();
        System.out.println("prestamo correctamente****************");
        this.disponible = true; 
    }
    public void devolucion(){
        System.out.print("el nombre del libor a devolver");
        this.nombreLibro = entrada.next();
        System.out.println("devolcion correctamente****************");  
        this.disponible = false;
    }

    public int getDiasPres() {
        return diasPres;
    }
    public String getNombreLibro() {
        return nombreLibro;
    }
    public boolean isDisponible() {
        return disponible;
    }
    public void setDiasPres(int diasPres) {
        this.diasPres = diasPres;
    }
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }
    public int getNumHojas() {
        return numHojas;
    }
    public String estado(){
        String  result=  "";
        if (disponible) {
            result = "Prestado";
        } else {
            result = "Disponible";
        }
        return result;
    }
}
