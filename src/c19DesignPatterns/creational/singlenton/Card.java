package c19DesignPatterns.creational.singlenton;

public class Card {
	
	//Minimo tiene una variable del mismo tipo, minimo tiene dos metodos.
	private static Card INSTANCE; //Variable estatica del mismo tipo de la clase y lo llama 'INSTANCE' (objeto) pero no lo instancea (no le da el new)
	private String cardNumber; //Variable privada 'cardNumber'
	
	private Card() { //Metodo constructor Privado
		
	}
	
	public synchronized static Card getINSTANCE() { //Metodo para obtener la instancia
		if(INSTANCE == null) { //Si esta vacia crea la variable por el metodo constructor
			INSTANCE = new Card(); //Se instancea a traves del constructor
		}
		return INSTANCE;
	}
	
	public String getCardNumber() { 
		return cardNumber;
	}
	
	public void setCardNumber(String cardNumber) { //Le llega CardNumber y lo asigna
		this.cardNumber = cardNumber;
	}
}
