public class Main {

    public static void main(String[] args) {
        Mula mula = new Mula(50,80,100);
        Comparendo comparendo =  new Comparendo(mula);
        comparendo.construirFotoMulta(200, "MULA");

        Carro carro = new Carro(50,70,100);
        Comparendo comparendo2 =  new Comparendo(carro);
        comparendo2.construirFotoMulta(80, "CARRO");

        Avion avion = new Avion(500,1000,1500);
        Comparendo comparendo3 =  new Comparendo(avion);
        comparendo3.construirFotoMulta(500, "AVION");

    }
}