public class Roman extends Livre{
	private int reward;

	public Roman(String nom, int saveNumber, String author, int pages, int reward) {
		super(nom, saveNumber, author, pages);
		this.reward = reward;
	}
	
	public String toString() {
		return "Roman " + super.toString();
	}
}
