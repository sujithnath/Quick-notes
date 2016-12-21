/**
 * 
 * @author Nitinkumar Gove
 *
 */
public class Test {
	public static void main(String args[]){
		
		Menu file = new Menu("File");
		
		file.addSubmenu(new Menu("New File"));
			
		Menu saveas = new Menu("Save as");
		saveas.addSubmenu(new Menu("Java File"));
		saveas.addSubmenu(new Menu("C File"));
		saveas.addSubmenu(new Menu("C++ File"));
		
		file.addSubmenu(saveas);
		
		file.addSubmenu(new Menu("Save File"));
		file.addSubmenu(new Menu("Open File"));
		file.addSubmenu(new Menu("Close File"));	
		
		for(Menu m : file.getSubmenus()){
			System.out.println(m);
			for(Menu sm : m.getSubmenus()){
				System.out.println(sm);
			}
		}
			
	}
}
