public class Comparendo {

    private Vehiculo vehiculo;
    public Comparendo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void construirFotoMulta(int velocidad, String tipoVehiculo) {
        // calcula comparendo deacuerdo al tipo de vehiculo
        int codigoComparendo = vehiculo.calcularComparendo(velocidad, tipoVehiculo);

        //envio de correos
        EnviarCorreos correo = new EnviarCorreos();
        String cuerpoCorreo = correo.enviarCorreoFotomulta(tipoVehiculo);

        // muestra comparendo
        MostrarComparendo comparendo = new MostrarComparendo();
        comparendo.imprimirComparendo(codigoComparendo, cuerpoCorreo, tipoVehiculo);
    }
}