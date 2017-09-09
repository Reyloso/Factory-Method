package Metodos;

import javax.swing.JOptionPane;

/**
 *
 * @author REY
 */
public class Main {
    public static void main(String[] args) {
        int op = 0;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(
                    "\t MENU PRINCIPAL \n"
                    + "\t Generar Factura\n"
                    + "\t 1. SI \n"
                    + "\t 2. Salir \n"
                    + "\t Entre su opción: ?"
            ));
            switch (op) {
                case 1:
                    int q = 0;
                    do {
                        q = Integer.parseInt(JOptionPane.showInputDialog(
                                "\t Tipo Importe \n"
                                + "\t 1. IVA \n"
                                + "\t 2. IVA REDUCIDO \n"
                                + "\t 3. Atras \n"
                                + "\t Entre su opción: ?"
                        ));
                        switch (q) {
                            case 1:
                                Factura nueva = FacturaFactory.getFactura("iva");
                                int id = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el id de la factura"));
                                nueva.setIdFactura(id);
                                double importe = Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese el importe de la factura"));
                                nueva.setImporte(importe);
                                System.out.println("hola");
                                JOptionPane.showMessageDialog(null, "\t----Factura---\n" + "\t Id factura " + nueva.getIdFactura() + "\n"
                                        + "\t importe " + nueva.getImporteIva() + "\n");
                                break;
                            case 2:
                                Factura nueva2 = FacturaFactory.getFactura(" ");
                                int id2 = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el id de la factura"));
                                nueva2.setIdFactura(id2);
                                double importe2 = Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese el importe de la factura"));
                                nueva2.setImporte(importe2);
                                System.out.println("hola");
                                JOptionPane.showMessageDialog(null, "\t----Factura---\n" + "\t Id factura " + nueva2.getIdFactura() + "\n"
                                        + "\t importe " + nueva2.getImporteIva() + "\n");
                                break;
                            case 4:
                                JOptionPane.showMessageDialog(null, "Adios!");
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opción Invalida!!!");
                        }
                    } while (q != 3);
                    break;
                    case 2:
                    JOptionPane.showMessageDialog(null, "Adios!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción Invalida!!!");
            }
        } while (op != 2);
        System.exit(0);

    }

}
