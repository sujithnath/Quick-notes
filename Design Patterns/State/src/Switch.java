
public class Switch {
	
	OnState onstate;
	OffState offstate;
	
	State state = offstate;

	public Switch() {
		this.onstate = new OnState(this);
		this.offstate = new OffState(this);
		this.state = offstate;
	}
	
	public void printCurrentState(){
		System.out.println(this.getState());
	}
	
	public void pressButton(){
		state.pressButton();
		printCurrentState();
	}

	public void setState(State state){
		this.state = state;
	}
	
	public OnState getOnstate() {
		return this.onstate;
	}

	public OffState getOffstate() {
		return this.offstate;
	}

	public State getState() {
		return this.state;
	}
	
	
	

}
