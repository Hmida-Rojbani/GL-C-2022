package test;

public interface I {
	int i = 9;

	void print();

	default void printNew( ){
		
		
		printNew3("fr");
	}
	
default void printNewEn( ){
		
		
		printNew3("en");
	}

	default void printNew01() {
		System.out.println();
		printNew4();
	}

	default void printNew02() {
		System.out.println();
		printNew4();
	}

	static void printNew2() {
		System.out.println();
	}

	private String printNew3(String lg) {
		switch (lg) {
		case "fr":

			return "Bonjour";

		case "en":

			return "Hello";

		default:
			return "NaN";
		}
	}

	private static void printNew4() {

	}

}
