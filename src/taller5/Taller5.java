//Tatiana Rojas
//Juan Jose Rivilla
//Martin Alejandro Ramirez Meneces
package taller5;

import javax.swing.JOptionPane;
import model.Caja;

public class Taller5 {

    
    public static void main(String[] args) {
        String continuar="S";
        
        while(continuar.equals("S")){
        String eps=JOptionPane.showInputDialog("Seleccione letra de eps "+
                                                "\nH - Hasta morir "+
                                                "\nP - Pior es na "+
                                                "\nG - De guatemala pa guate pior ").toUpperCase();
                
       String tipoAfiliado=JOptionPane.showInputDialog("Seleccione tipo afiliado"+
                                                       "\nB - beneficiario "+
                                                       "\nC - Cotizante").toUpperCase();
       String docAfiliado=JOptionPane.showInputDialog("Documento del afiliado");
       String nomAfiliado=JOptionPane.showInputDialog("Nombre del afiliado");
       double precio=Double.parseDouble(JOptionPane.showInputDialog("Precio inicial examen"));
       
       Caja caja = new Caja(tipoAfiliado,docAfiliado,nomAfiliado);
       double vlrPagar=0;
       
       if (eps.equals("H")){
           int nivel = Integer.parseInt(JOptionPane.showInputDialog("Digite nivel"+
                                                                    "\n1"+
                                                                    "\n2"));
           vlrPagar=caja.valorPagar(nivel, precio);
       }
       else {if (eps.equals("P")){
          String categoria=JOptionPane.showInputDialog("Ingrese categoria"+
                                                       "\nA"+
                                                        "\nB").toUpperCase(); 
       vlrPagar=caja.valorPagar(categoria, precio);
           }
       else{ if(eps.equals("G")){
           double salario = Double.parseDouble(JOptionPane.showInputDialog("Salario basico cotizante"));
           vlrPagar=caja.valorPagar(salario, precio);
           }}
       
    }
      caja.presentarPagar(vlrPagar); 
      continuar=JOptionPane.showInputDialog("Desea continuar S/N? ").toUpperCase();
        }
    }
}
