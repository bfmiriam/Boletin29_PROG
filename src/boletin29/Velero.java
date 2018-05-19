
package boletin29;


public class Velero extends Barco {
    
    private int numMastiles;

    public Velero() {
    }

    public Velero(int numMastiles) {
        this.numMastiles = numMastiles;
    }

    public Velero(int numMastiles, int eslora, String matricula) {
        super(eslora, matricula);
        this.numMastiles = numMastiles;
    }

    public int getNumMastiles() {
        return numMastiles;
    }

    public void setNumMastiles(int numMastiles) {
        this.numMastiles = numMastiles;
    }

    @Override
    public String toString() {
        return "Velero -> "+super.toString() + " numMastiles: " + numMastiles;
    }
    
    

    @Override
    public double aluguer(Barco b, int dias) {
      return(super.moduloBase()+numMastiles * 2) * dias;
    }
    
}
