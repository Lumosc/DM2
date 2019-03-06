import java.util.*;

public class Document{
	private String nom;
	private int saveNumber;
	
	public Document(String nom, int saveNumber) {
		this.nom = nom;
		this.saveNumber = saveNumber;
	}
	
	public String toString() {
		return nom + "(" + saveNumber + ")";
	}
}
