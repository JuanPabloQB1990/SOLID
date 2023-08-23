public class Carro extends Vehiculo{
    private int limiteInferiorCarro = 65;
    private int limiteInferiorIntermedioCarro = 66;
    private int limiteSuperiorCarro = 85;

    public Carro() {

    }

    @Override
    public int calcularComparendo(int velocidad, String tipoVehiculo) {
        if(tipoVehiculo == "CARRO") {
            if (velocidad <= limiteInferiorCarro) {
                return 0;
            } else if (velocidad >= limiteInferiorIntermedioCarro && velocidad <= limiteSuperiorCarro) {
                return 1;
            } else {
                return 2;
            }
        }

        return -1;
    }


}
