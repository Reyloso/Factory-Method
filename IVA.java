package Metodos;

/**
 *
 * @author REY
 */
//clase concreta 
public class IVA extends Factura {
    //reescribe un metodo abstracto para calcular el importe de iva
    @Override
    public double getImporteIva() {return getImporte()*1.21; }
    
}
