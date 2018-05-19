
package boletin29;


public class Yate extends Barco {
    
    private int numCamarotes;
    private int potencia;

    public Yate() {
    }

    public Yate(int numCamarotes, int potencia) {
        this.numCamarotes = numCamarotes;
        this.potencia = potencia;
    }

    public Yate(int numCamarotes, int potencia, int eslora, String matricula) {
        super(eslora, matricula);
        this.numCamarotes = numCamarotes;
        this.potencia = potencia;
    }

    public int getNumCamarotes() {
        return numCamarotes;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setNumCamarotes(int numCamarotes) {
        this.numCamarotes = numCamarotes;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return  "Yate-> "+super.toString()+" numCamarotes: " + numCamarotes + ", potencia: " + potencia;
    }
    
    

    @Override
    public double aluguer(Barco b, int dias) {
       return(super.moduloBase()+potencia * 3 + numCamarotes * 4 ) * dias;
    }
    
    
    
}
