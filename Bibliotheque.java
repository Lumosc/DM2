import java.util.*;

public class Bibliotheque{
	private ArrayList<Document> document;
	private int capacite;
	private int enCours = 0;
	
	public Bibliotheque(int capacite) {
		this.capacite = capacite;
		document = new ArrayList<Document>();
	}
	
	public boolean ajouter(Document doc) {
		if( enCours < capacite ) {
			document.add(doc);
			enCours ++;
			return true;
		}
		else {
			return false;
		}
	}
	
	public void afficherDocuments() {
		for(Document doc : document) {
			System.out.println(doc.getTitle() + " n°" + doc.getNumero());
		}
	}
	
	public void afficherAuteurs() {
		for(Document doc : document) {
			if(doc instanceof Livre) {
				System.out.println(doc.getTitle() + " n°" + doc.getNumero() + " : " + ((Livre)doc).getAuthor());
			}
		}
	}
	
	public void ajouterLivre(ArrayList<Document> doc) {
		for(Document livre : doc) {
			if(livre instanceof Livre) {
				if(document.size() < capacite) {
					document.add(livre);
				}
			}
		}
	}
	
	public static void main(String[] argc) {
		
		Bibliotheque biblio = new Bibliotheque(50);
		
		
		Roman neogicia = new Roman("neogicia", 1, "F. Fournier", 400, 0);
		Manuel man = new Manuel("man 1", 2, "Auteur 1", 25, 3);
		Revue rev1 = new Revue("rev 1", 3, 2019, 03);
		
		biblio.ajouter(neogicia);
		biblio.ajouter(man);
		biblio.ajouter(rev1);
		
		biblio.afficherDocuments();
		
		
	}
	
}