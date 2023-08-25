public class Avion extends Vehiculo{


    public Avion(int limiteInferior, int limiteInferiorIntermedio, int limiteSuperior) {
        super( limiteInferior, limiteInferiorIntermedio, limiteSuperior);
    }

    @Override
    public int calcularComparendo(int velocidad, String tipoVehiculo) {
        if(tipoVehiculo == "AVION") {
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
