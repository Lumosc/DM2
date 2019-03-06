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
			break;
		
		case 2:
			return (super.toString() + "Novel with Medicis literary reward");
			break;
			
		case 3:
			return (super.toString() + "Novel with Interallie literary reward");
			break;

		default:
			return (super.toString() + "Novel without literary reward");
			break;
		}
	}
	
	public getReward(){
		return this.reward;
	}
	
	public setReward(reward){
		this.reward = reward;
	}
}
