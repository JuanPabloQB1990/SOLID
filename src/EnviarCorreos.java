public class EnviarCorreos {
    public EnviarCorreos(){

    }


    public String enviarCorreoFotomulta(String tipoVehiculo) {
        String cuerpoMensaje = "//enviando correo para el tipo " + tipoVehiculo;
        String asunto = "//asunto: comparendo " + tipoVehiculo;
        return   asunto + cuerpoMensaje;
    }
}
