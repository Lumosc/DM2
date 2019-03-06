import java.util.*;

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
	
	public getNumero(){
		return this.saveNumber;
	}
	
	public getTitle(){
		return this.title;
	}
	
	public setNumero(int numero){
		this.saveNumber = numero;
	}
	
	public setTitle(String title){
		this.title = title;
	}
}
