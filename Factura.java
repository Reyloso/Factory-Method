package Metodos;

/**
 *
 * @author  REY
 */
//clase abstracta
public abstract class Factura {
    //atributos encapsulados
    private int id_factura;
    private double importe;
    
    //metodo abstrato
    public abstract double getImporteIva();
    
    //metodos set
    void setIdFactura(int id_factura){this.id_factura = id_factura; }
    void setImporte(double importe){this.importe = importe; }
    //metodos get
    int getIdFactura(){return id_factura;}
    double getImporte(){return importe;}
    
    
}
 