package src;



public class Contador {

    private int contador;
    private int finAumento;
    private int finDecremento;
    
    public Contador(){
        
    }

    public Contador(int contador, int finAumento, int finDecremento) {
        this.contador = contador;
        this.finAumento = finAumento;
        this.finDecremento = finDecremento;
        
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public int getFinAumento() {
        return finAumento;
    }

    public void setFinAumento(int finAumento) {
        this.finAumento = finAumento;
    }

    public int getFinDecremento() {
        return finDecremento;
    }

    public void setFinDecremento(int finDecremento) {
        this.finDecremento = finDecremento;
    }
    public void incremeto() {
        System.out.println("contador inicial"+contador);
        for (int i = 0; i < finAumento; i++) {
            contador++;

        }
        System.out.println("numero incrementado"+contador);
    }
    public void decremento(){
        System.out.println("el nuermo sin decremetno es:"+contador);
        for (int i = 0; i < finDecremento; i++) {
            contador--;
        }
        System.out.println("numero ha sido decrementado"+contador);
    }

}
