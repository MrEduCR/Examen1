package examen1;

public class Factura {
    // declaracion de variables para la clase

    private String nombreCliente;
    private String cedula;
    private String codigoFactura;
    private String montoFactura;
    private String mesFactura;
    private String estadoFactura;

    // este es el constructor
    public Factura(String nombreCliente, String cedula, String codigoFactura, String montoFactura, String mesFactura, String estadoFactura) {
        this.nombreCliente = nombreCliente;
        this.cedula = cedula;
        this.codigoFactura = codigoFactura;
        this.montoFactura = montoFactura;
        this.mesFactura = mesFactura;
        this.estadoFactura = estadoFactura;
    }

    public String leerFactura() { // se encarga de leer la factura del cliente
        return "Nombre: " + nombreCliente + "\nCedula: " + cedula + "\nCodigo Factura: " + codigoFactura + "\nMonto Factura: " + montoFactura + "\nMes Factura: " + mesFactura + "\nEstado Factura: " + estadoFactura;
    }

}
