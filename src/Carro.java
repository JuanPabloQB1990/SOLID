public class Carro extends Vehiculo{


    public Carro(int limiteInferior, int limiteInferiorIntermedio, int limiteSuperior) {
        super( limiteInferior, limiteInferiorIntermedio, limiteSuperior);
    }

    @Override
    public int calcularComparendo(int velocidad, String tipoVehiculo) {
        if(tipoVehiculo == "CARRO") {
            if (velocidad <= getLimiteInferior()) {
                return 0;
            } else if (velocidad >= getLimiteInferiorIntermedio() && velocidad <= getLimiteSuperior()) {
                return 1;
            } else {
                return 2;
            }
        }

        return -1;
    }


}
