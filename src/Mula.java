public class Mula extends Vehiculo {
    private int limiteInferiorMula = 95;
    private int limiteInferiorIntermedioMula = 96;
    private int limiteSuperiorMula = 110;

    public Mula() {

    }

    @Override
    public int calcularComparendo(int velocidad, String tipoVehiculo) {
        if(tipoVehiculo == "MULA") {
            if (velocidad <= limiteInferiorMula) {
                return 0;
            } else if (velocidad >= limiteInferiorIntermedioMula && velocidad <= limiteSuperiorMula) {
                return 1;
            } else {
                return 2;
            }
        }

        return -1;
    }

    @Override
    public String enviarCorreoFotomulta() {
        String cuerpoMensaje = "//enviando correo para el tipo mula.";
        String asunto = "//asunto: comparendo mula";
        return   asunto + cuerpoMensaje;
    }
}
