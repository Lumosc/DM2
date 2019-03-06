public class Manuel extends Livre{
	private int scolarLevel;
	
	public Manuel(String nom, int saveNumber, String author, int pages, int scolarLevel) {
		super(nom, saveNumber, author, pages);
		this.scolarLevel = scolarLevel;
	}
	
	public String toString() {
		return "Manuel " + super.toString();
	}
}