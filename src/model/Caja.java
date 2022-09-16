
package model;

public class Caja extends Dx {
    String  tipoAfiliado;

    public Caja(String tipoAfiliado, String docAfiliado, String nomAfiliado) {
        super(docAfiliado, nomAfiliado);
        this.tipoAfiliado = tipoAfiliado;
        
    }
    
       //EPS HASTA MORIR
    public double valorPagar(int nivel, double precio){
        double vlrPagar=precio;
        if (nivel==1){
        vlrPagar=precio*0.5;}
        else{if(nivel==2){
                
               vlrPagar=precio*0.7;
                }
        }
        vlrPagar-=descuento(precio);
        return vlrPagar;
     }
    
    //EPS PIOR Es NA
    public double valorPagar(String categoria,double precio){
    double vlrPagar=precio;
    if (categoria.equals("A")){
    vlrPagar=precio*0.55;
    }
    else{if (categoria.equals("B")){
    vlrPagar=precio*0.6;
    }
    }
    vlrPagar-=descuento(precio);
    return vlrPagar;
    }
    
    //EPS DE GUATEMALA PA GUATEPIOR
    public double valorPagar(double salario, double cmbPrecio){
    double vlrPagar=cmbPrecio;
    if (salario<=(2*smlv)){
    vlrPagar= cmbPrecio*0.4;
    }
    else{vlrPagar=cmbPrecio*0.65;
    }
    vlrPagar-=descuento(cmbPrecio);
    return vlrPagar;
    }
    
    public double descuento(double cmbPrecio){
    if(tipoAfiliado.equals("C")){
    return cmbPrecio*0.05;
    }
    return 0;
    }
    
}
