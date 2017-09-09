package Metodos;

/**
 *
 * @author REY
 */
//clase concreta
public class IVAREDUCIDO extends Factura {
    //reescribe un metodo abstracto para calcular el impore reducido del iva
    @Override
    public double getImporteIva() { return getImporte()*1.07;}
    
}
