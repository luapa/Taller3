package herenciaypolimorfismo;

public class main {
   
public static void main(String[] args) {
	        
	CuentaBancaria cta1=new CuentaCorriente();
	CuentaBancaria cta2=new CuentadeAhorro();
	CuentadeAhorro cta3=new CuentadeAhorro();
	        
	cta1.setNombre("Cuenta 1:");
	cta2.setNombre("Cuenta 2:");
	cta3.setNombre("Cuenta 3:");
	        
	cta1.setSaldo(100);
	cta2.setSaldo(200);
	cta3.setSaldo(300);
	        
	imprimirSaldo(cta1);
    imprimirSaldo(cta2);
	imprimirSaldo(cta3);
	        
	CuentaCorriente cta4=new CuentaCorriente();
	cta4.setNombre("Cuenta 4:");
	cta4.setSaldo(10);
	cta4.deposito(100);
	imprimirSaldo(cta4);
	        
	       
	}//public static void main
	    
	public static void imprimirSaldo(CuentaBancaria cta){
	System.out.println("Cuenta: "+cta.getNombre()    +    "Saldo  : "+cta.getSaldo()   );
	}//imprimirSaldo
	    
	}//de la clase main

