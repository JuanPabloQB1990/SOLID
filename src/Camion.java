public class Camion extends Vehiculo{
    private int limiteInferiorCamion = 75;
    private int limiteInferiorIntermedioCamion = 76;
    private int limiteSuperiorCamion = 95;

    public Camion() {

    }

    @Override
    public int calcularComparendo(int velocidad, String tipoVehiculo) {
        if(tipoVehiculo == "CAMION") {
            if (velocidad <= limiteInferiorCamion) {
                return 0;
            } else if (velocidad >= limiteInferiorIntermedioCamion && velocidad <= limiteSuperiorCamion) {
                return 1;
            } else {
                return 2;
            }
        }

        return -1;
    }

    @Override
    public String enviarCorreoFotomulta() {
        String cuerpoMensaje = "//enviando correo para el tipo camion.";
        String asunto = "//asunto: comparendo camion";
        return   asunto + cuerpoMensaje;
    }
}
