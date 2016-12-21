
public class Follower extends Observer {
	
	private int value;
	
	public Follower(Leader leader){
		this.leader = leader;
		this.leader.startListening(this);
		this.value = 0;
		printValue();
	}
	
	public void printValue(){
		System.out.println("Follower -" + value);
	}


	@Override
	public void replicateScore() {
		// TODO Auto-generated method stub
		this.value = leader.getValue();
		printValue();
		
	}

}
