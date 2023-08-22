public class Avion extends Vehiculo{

    private int limiteInferiorAvion = 150;
    private int limiteInferiorIntermedioAvion = 400;
    private int limiteSuperiorAvion = 700;

    public Avion() {

    }

    @Override
    public int calcularComparendo(int velocidad, String tipoVehiculo) {
        if(tipoVehiculo == "AVION") {
            if (velocidad <= limiteInferiorAvion) {
                return 0;
            } else if (velocidad >= limiteInferiorIntermedioAvion && velocidad <= limiteSuperiorAvion) {
                return 1;
            } else {
                return 2;
            }
        }

        return -1;
    }

    @Override
    public String enviarCorreoFotomulta() {
        String cuerpoMensaje = "//enviando correo para el tipo avion.";
        String asunto = "//asunto: comparendo avion";
        return   asunto + cuerpoMensaje;
    }
}
