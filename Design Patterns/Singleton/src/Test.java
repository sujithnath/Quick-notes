/**
 * 
 * @author Nitinkumar Gove
 *
 */
public class Test {
	public static void main(String [] a){
		Configuration config = Configuration.getConfiguration();
		config.printConfiguration();
		
		config.setLanguage("french");
		config.setRegion("NA");
		config.printConfiguration();
	}

}
