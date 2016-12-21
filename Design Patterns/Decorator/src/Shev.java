/**
 * @author Nitinkumar Gove
 */
public class Shev extends ItemDecorator{
	
	Item item;
	private String description;
	
	public Shev(Item item) {
		super();
		this.item = item;
		this.description = "Shev";
	}

	@Override
	public void printDescription() {
		// TODO Auto-generated method stub
		item.printDescription();
		System.out.println("+ "+description);		
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return ( 5 + item.cost() );
	}

}
