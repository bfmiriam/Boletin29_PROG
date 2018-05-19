
package boletin29;


public abstract class Barco {
    
    private int eslora;
    private String matricula;
    public static int valor=10;

    public Barco() {
    }

    public Barco(int eslora, String matricula) {
        this.eslora = eslora;
        this.matricula = matricula;
    }

    public float getEslora() {
        return eslora;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return " eslora: " + eslora + ", matricula: " + matricula;
    }
    
    public double moduloBase(){
        
        return eslora * valor;
    }
    
    public abstract double aluguer(Barco b,int dias);
    
    
    
}
