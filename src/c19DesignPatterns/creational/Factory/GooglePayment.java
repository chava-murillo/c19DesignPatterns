package c19DesignPatterns.creational.Factory;

public class GooglePayment implements Payment{ //Clase con Interface de Pago
	@Override
	public void doPayment() {
		System.out.println("Pagando con Google Payment");
	}

}
