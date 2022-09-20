package test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Cls implements I{

	@Override
	public void print() {
		printNew();
		I.printNew2();
		
	}
	
	public static void main(String[] args) {
		Path p = Paths.get("/");
	}

}
