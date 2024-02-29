package examen1;

import javax.swing.JOptionPane;

public class Examen1 {

    public static void main(String[] args) {
        int veces = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantas facturas de un solo cliente debe resgistar:"));
        for (int i = 0; i < veces; i++) {
            añadirFactura();
        } // llama a la funcion dependiendo de la cantidad de facturas

    }

    public static void añadirFactura() {//para añadir una factura

        double deuda = 0;
        double montoCancelado = 0;

        String nombreCliente = JOptionPane.showInputDialog("Ingrese el nombre:");
        String cedula = JOptionPane.showInputDialog("Ingrese la cedula:");
        String codigoFactura = JOptionPane.showInputDialog("Ingrese el codigo de factura:");
        String montoFactura = JOptionPane.showInputDialog("Ingrese el monto de la factura :");
        String mesFactura = JOptionPane.showInputDialog("Ingrese el mes de la factura:");
        String estadoFactura = JOptionPane.showInputDialog("Ingrese el estado de la factura(1 pagado, 2 debe de pagar):");

        int estadoFacturaInt = Integer.parseInt(estadoFactura); // para leer si la factura esta pagada o no 
        
        if (estadoFacturaInt == 1) { // este if solo suma montos de las facturas que estan pagadas
            double montoFacturaDouble = Double.parseDouble(montoFactura);
            montoCancelado += montoFacturaDouble;
        }

        if (estadoFacturaInt == 2) { // este if solo suma montos de las facturas que se deben
            double montoFacturaDouble = Double.parseDouble(montoFactura);
                if (montoFacturaDouble >= 60000) {
                    deuda = ((montoFacturaDouble * 0.15) + montoFacturaDouble) / 4;
                    JOptionPane.showMessageDialog(null, "La deuda desde marzo hasta junio (con 0.15 y en 4 cuotas): " + deuda);
                }
                deuda += montoFacturaDouble;
                JOptionPane.showMessageDialog(null, "La deuda es de " + deuda);

            }

            JOptionPane.showMessageDialog(null, "La cantidad cancelada es " + montoCancelado);

            Factura factura = new Factura(nombreCliente, cedula, codigoFactura, montoFactura, mesFactura, estadoFactura);

            JOptionPane.showMessageDialog(null, "Se ha creado una nueva factura:\n" + factura.leerFactura());

        }

    }// public class


