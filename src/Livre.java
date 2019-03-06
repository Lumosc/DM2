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
	
	public getAuthor(){
		return this.author;
	}
	
	public getPages(){
		return this.pages;
	}
	
	public setAuthor(String author){
		this.author = author;
	}
	
	public setPages(int Pages){
		this.pages = pages;
	}
}
