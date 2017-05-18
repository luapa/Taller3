package herenciaypolimorfismo;

public abstract class CuentaBancaria {
    
    private String Nombre;
    protected double Saldo;
    
    abstract double getinteresDeposito();
    
    public void deposito(double deposito){
        double totalInteres=0;
        if(deposito<1000)
            totalInteres=deposito*getinteresDeposito();
        
        this.Saldo+=deposito + totalInteres;
    }//del void deposito
    public void retiro(double retiro){
        this.Saldo-=retiro;
    }//del void retiro


    public String getNombre() {
        return Nombre;
    }//del public String

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }//del setNombre

    public double getSaldo() {
        return Saldo;
    }//del getSaldo

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }//del setSaldo

    /*public double getInteresDeposito() {
        return interesDeposito;
    }

    public void setInteresDeposito(double interesDeposito) {
        this.interesDeposito = interesDeposito;
    }*/

    
    
} //de la clase
