public abstract class Vehiculo {
    private int limiteInferior;
    private int limiteInferiorIntermedio;
    private int limiteSuperior;

    public Vehiculo(int limiteInferior, int limiteInferiorIntermedio, int limiteSuperior) {
        this.limiteInferior = limiteInferior;
        this.limiteInferiorIntermedio = limiteInferiorIntermedio;
        this.limiteSuperior = limiteSuperior;
    }

    public int getLimiteInferior() {
        return limiteInferior;
    }

    public int getLimiteInferiorIntermedio() {
        return limiteInferiorIntermedio;
    }

    public int getLimiteSuperior() {
        return limiteSuperior;
    }

    public abstract int calcularComparendo(int velocidad, String tipoVehiculo);


}
