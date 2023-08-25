public class Mula extends Vehiculo {


    public Mula(int limiteInferior, int limiteInferiorIntermedio, int limiteSuperior) {
        super( limiteInferior, limiteInferiorIntermedio, limiteSuperior);
    }

    @Override
    public int calcularComparendo(int velocidad, String tipoVehiculo) {
        if(tipoVehiculo == "MULA") {
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
