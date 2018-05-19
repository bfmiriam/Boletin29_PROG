
package boletin29;


public class Motor extends Barco {
    
    private int potencia;

    public Motor() {
    }

    public Motor(int potencia) {
        this.potencia = potencia;
    }

    public Motor(int potencia, int eslora, String matricula) {
        super(eslora, matricula);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Motor-> "+ super.toString() + " potencia: " + potencia;
    }
    
    

    @Override
    public double aluguer(Barco b, int dias) {
         return(super.moduloBase()+potencia * 3) * dias;
    }
    
}
