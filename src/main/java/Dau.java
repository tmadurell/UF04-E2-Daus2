
import java.util.Random;

public class Dau {
    Random nrandom;
    int valor;

    public Dau(){
        nrandom = new Random();
    }

    ///Exemple: public void tirar() {valor = nrandom.nextInt(6)+1;}
    public void tirar(){this.valor = (int)(Math.random() * 6) + 1;}

    //Exemple public void imprimir() { System.out.print("\nDau=[Dau{valor="+getValor()+"}");}
    public void imprimir() { System.out.print("\nHa sortit un: " + valor);}

    public int getValor() {

        return valor;

    }
}
