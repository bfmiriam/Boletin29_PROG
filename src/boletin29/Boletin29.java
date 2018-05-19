
package boletin29;


public class Boletin29 {

   
    public static void main(String[] args) {
       
        Metodos obx = new Metodos();
        Barco y = new Yate (2,200,30,"222");
        Barco v = new Velero(3,40,"333");
        
        obx.crear();
        obx.amosar();
        obx.calcularAluguer(y);
        obx.calcularAluguer(v);
    }
    
}
