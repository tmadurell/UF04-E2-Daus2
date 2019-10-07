

public class JocdeDaus {

    Dau[] daus = new Dau[3];

    public JocdeDaus() {

        this.daus[0] = new Dau();
        this.daus[1] = new Dau();
        this.daus[2] = new Dau();
    }

    public boolean jugar(){

        boolean triples = false;

        daus[0].tirar();
        daus[1].tirar();
        daus[2].tirar();

        int a = daus[0].getValor();
        int b = daus[1].getValor();
        int c = daus[2].getValor();


        for (int i = 0; i < daus.length; i++) {

            daus[i].imprimir();
        }
        System.out.println();

        if (a == b && b == c){

            triples = true;
        }


        return triples;
    }

}
