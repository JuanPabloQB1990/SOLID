public class EnviarComparendo {

    public EnviarComparendo(){

    }

    public String enviarCorreoFotomulta(String tipoVehiculo) {

        if(tipoVehiculo == "CAMION") {
            String cuerpoMensaje = "//enviando correo para el tipo camion.";
            String asunto = "//asunto: comparendo camion";
            return   asunto + cuerpoMensaje;
        }else if(tipoVehiculo == "CARRO") {
            String cuerpoMensaje = "//enviando correo para el tipo carro.";
            String asunto = "//asunto: comparendo carro";
            return   asunto + cuerpoMensaje;
        }else if(tipoVehiculo == "MULA") {
            String cuerpoMensaje = "//enviando correo para el tipo mula.";
            String asunto = "//asunto: comparendo mula";
            return   asunto + cuerpoMensaje;
        } else {
            return "enviando correo con vehiculo desconocido";
        }
    }
}
