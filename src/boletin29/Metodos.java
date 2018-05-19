
package boletin29;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class Metodos {
    List <Barco> lista = new ArrayList();
    
    public void crear(){
        Barco v = new Velero(1,4,"111");
        lista.add(v);
        lista.add(new Motor(2,3,"222"));
        lista.add(new Yate (2,200,30,"222"));
    }
    public void amosar(){
        for(Barco b:lista){
            System.out.println(b);
        }
    }
    public void calcularAluguer(Barco b){
        int dias =Integer.parseInt(JOptionPane.showInputDialog("Introduce dias"));
        System.out.println(b.aluguer(b, dias)+" €");
    }
}
