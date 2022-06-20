package core_java;

public class ExceptionExample {

	static void procA() {
		try {
			System.out.println("Inside ProcA");
			throw new RuntimeException("Demo");
		} catch(Exception e) {
			System.out.println("ProcA is Finally"+e);
		}
	}
	static void procB() {
		try {
			System.out.println("Inside ProcB");
			return;
		} finally {
			System.out.println("Procb is finally");
		}
	}
	static void procC() {
		try {
			System.out.println("Inside ProcC");
			
		} finally {
			System.out.println("ProcC is Finally");
		}
	}
	public static void main(String[] args) {
		try {
			procA();
		} catch (Exception e) {
			System.out.println("Exception caught");
		}procB(); procC();

	}
	
}

