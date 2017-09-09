package Metodos;

/**
 *
 * @author REY
 */
//clase fatoria 
public class FacturaFactory {
    
    //este metodo retorna un objeto tipo factura instanciado con la clase concreta que pertenezca al objeto instanciado
    // dependiendo el tipo de factura a generar llama a la clase a la que pertenece
    public static Factura getFactura(String tipo){
        if(tipo.equals("iva")){
            return new IVA();
        }else{
            return new IVAREDUCIDO();
        }
    }
}
