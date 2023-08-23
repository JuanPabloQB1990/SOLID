public class Main {

    public static void main(String[] args) {
        Mula mula = new Mula();
        Comparendo comparendo =  new Comparendo(mula);
        comparendo.construirFotoMulta(200, "MULA");

        Carro carro = new Carro();
        Comparendo comparendo2 =  new Comparendo(carro);
        comparendo2.construirFotoMulta(80, "CARRO");

        Avion avion = new Avion();
        Comparendo comparendo3 =  new Comparendo(avion);
        comparendo3.construirFotoMulta(500, "AVION");

    }
}