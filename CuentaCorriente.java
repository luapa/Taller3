package herenciaypolimorfismo;

public class CuentaCorriente extends CuentaBancaria {

    @Override
    double getinteresDeposito() {
        return 0.02;
    }//del get
    
    /*@Override
    public void deposito(double deposito){
        double interes=0;
        if(deposito<1000)
            interes=deposito*0.01;
        
        this.Saldo=this.Saldo+deposito+interes;    
    }*/
    
}// de la clase