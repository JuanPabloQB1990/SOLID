public class Comparendo {

    private Vehiculo vehiculo;
    public Comparendo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void construirFotoMulta(int velocidad, String tipoVehiculo) {

        int codigoComparendo = vehiculo.calcularComparendo(velocidad, tipoVehiculo);
        String cuerpoCorreo = vehiculo.enviarCorreoFotomulta();

        MostrarComparendo comparendo = new MostrarComparendo();
        comparendo.imprimirComparendo(codigoComparendo, cuerpoCorreo, tipoVehiculo);
    }
}