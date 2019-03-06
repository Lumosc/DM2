public class Roman extends Livre{
	private int reward;

	public Roman(String nom, int saveNumber, String author, int pages, int reward) {
		super(nom, saveNumber, author, pages);
		this.reward = reward;
	}
	
	public String toString() {
		switch (reward) {
		case 1:
			return (super.toString() + "Novel with Goncourt literary reward");
			
		case 2:
			return (super.toString() + "Novel with Medicis literary reward");
			
		case 3:
			return (super.toString() + "Novel with Interallie literary reward");

		default:
			return (super.toString() + "Novel without literary reward");
		}
	}
	
	public int getReward(){
		return this.reward;
	}
	
	public void setReward(int reward){
		this.reward = reward;
	}
}
