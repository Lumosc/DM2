public class Livre extends Document{
	private String author;
	private int pages;

	public Livre(String nom, int saveNumber, String author, int pages) {
		super(nom, saveNumber);
		this.author = author;
		this.pages = pages;
	}

	public String toString() {
		return (super.toString() + "Book ");
	}
	
	public String getAuthor(){
		return this.author;
	}
	
	public int getPages(){
		return this.pages;
	}
	
	public void setAuthor(String author){
		this.author = author;
	}
	
	public void setPages(int Pages){
		this.pages = pages;
	}
}
