package src;

public class Fraccion {
    private int denominador;
    private int numerador;
    private int denominador2;
    private int numerador2;

    public Fraccion(){
        
    }

    public Fraccion(int denominador, int numerador, int denominador2,int numerador2) {
        this.denominador = denominador;
        this.numerador = numerador;
        this.numerador2 = numerador2;
        this.denominador2 = denominador2;
    }

    public int suma(){
        int suma = multiplic(numerador,denominador2)+multiplic(numerador2,denominador);
        return suma;
    }
    public int resta(){
        int suma = multiplic(numerador,denominador2)-multiplic(numerador2,denominador);
        return suma;
    }
    public int multiplic(int num, int num2){
        int mult;
        mult = num*num2;
        return mult;
    }
    public int getDenominador() {
        return denominador;
    }
    public int getDenominador2() {
        return denominador2;
    }
    
    public int getNumerador() {
        return numerador;
    }
    public int getNumerador2() {
        return numerador2;
    }
    
    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    public void setDenominador2(int denominador2) {
        this.denominador2 = denominador2;
    }
    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }
    public void setNumerador2(int numerador2){
        this.numerador2 = numerador2;
    }
}
