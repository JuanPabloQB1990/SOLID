public class MostrarComparendo {

    public MostrarComparendo(){

    }

    public void imprimirComparendo(int codigoComparendo, String cuerpoCorreo, String tipoVehiculo){
        if(codigoComparendo == -1) {
            System.out.println("no hay calculo para el tipo de vehiculo" + tipoVehiculo + "corre: " + cuerpoCorreo);
        } else {
            System.out.println("----el tipo de comparendo es: " + codigoComparendo + " ----cuerpo del correo" + cuerpoCorreo);
        }
    }
}
