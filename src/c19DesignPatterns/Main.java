package c19DesignPatterns;

import c19DesignPatterns.creational.Factory.Payment;
import c19DesignPatterns.creational.Factory.PaymentFactory;
import c19DesignPatterns.creational.Factory.TypePayment;
import c19DesignPatterns.creational.singlenton.Card;

public class Main {

	public static void main(String[] args) {
	
		//probarFactoryMethod(); //Manda llamar el metodo
		probarSinglenton();
	}
	
	private static void probarFactoryMethod() {
		Payment payment = PaymentFactory.buildPayment(TypePayment.GOOGLEPAY);
		payment.doPayment();
	}
	
	private static void probarSinglenton() {
		/*Dado que el constructor es privado, manda a llamar a traves de la clase Synchronized '.getINSTANCE()' 
		 * 
		 * Se puede colocar el paquete si no se importa primero como en el set
		 * Si se importa solo se coloca el nombre de la clase a la que se va a llamar.
		 */
		c19DesignPatterns.creational.singlenton.Card.getINSTANCE().setCardNumber("1234-1234-1234-1234"); 
		System.out.println(Card.getINSTANCE().getCardNumber());
	}
}
