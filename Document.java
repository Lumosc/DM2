public class Document{
	private String title;
	private int saveNumber;
	
	public Document(String title, int saveNumber) {
		this.title = title;
		this.saveNumber = saveNumber;
	}
	
	public String toString() {
		return title + " N°" + saveNumber;
	}
	
	public int getNumero(){
		return this.saveNumber;
	}
	
	public String getTitle(){
		return this.title;
	}
	
	public void setNumero(int numero){
		this.saveNumber = numero;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
}
