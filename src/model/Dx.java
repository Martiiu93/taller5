
package model;

import javax.swing.JOptionPane;


public class Dx {
    String docAfiliado,nomAfiliado;
    double smlv=1000000;
    

    public Dx(String docAfiliado, String nomAfiliado) {
        this.docAfiliado = docAfiliado;
        this.nomAfiliado = nomAfiliado;
    }
    
    public void presentarPagar(double vlrPagar){
    JOptionPane.showMessageDialog(null,"Valor final del Examen: "+vlrPagar);
    }
     
}
