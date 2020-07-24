package world;

import java.util.logging.Logger;
import java.util.logging.Level;

public class HelloWorld {
	public static void main(String[] args) {
		Logger L = Logger.getLogger(HelloWorld.class.getName());
		L.log(Level.INFO, "Hello world!");
	}
}
