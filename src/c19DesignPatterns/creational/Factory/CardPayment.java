package c19DesignPatterns.creational.Factory;

public class CardPayment implements Payment {
	@Override
	public void doPayment() {
		System.out.println("Pagando con Tarjeta");
	}

}
