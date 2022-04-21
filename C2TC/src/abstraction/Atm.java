package abstraction;

abstract class Atm {

	abstract void withdraw();
}
 class DataAbstract extends Atm {
	 
	void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("withdraw successful");
	}
	
	public static void main(String[] args) {
		
		DataAbstract obj = new DataAbstract();
		obj.withdraw();
		
	}
	
}