public class Livre extends Document{
	private String author;
	private int pages;

	public Livre(String nom, int saveNumber, String author, int pages) {
		super(nom, saveNumber);
		this.author = author;
		this.pages = pages;
	}

	public String toString() {
		return "Livre " + super.toString();
	}
}
