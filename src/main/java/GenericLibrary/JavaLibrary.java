package GenericLibrary;
/**
 * 
 * This class contain all java generic method
 */

import java.util.Random;

public class JavaLibrary {
/**
 * This method will generate random for excecution
 * @return
 */
	public int getRandomNum() {
		Random r= new Random();
		return	r.nextInt(1000);
	}
}
