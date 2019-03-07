import java.util.*;

public class Bibliotheque{
	private ArrayList<Document> document;
	private ArrayList<Livre> livre;
	private int capacite;
	private int NbLivre = 0;

	public Bibliotheque(int capacite) {
		this.capacite = capacite;
		document = new ArrayList<Document>();
		livre = new ArrayList<Livre>();
	}

	public boolean ajouter(Document doc) {
		if( document.size() < capacite ) {
			document.add(doc);
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
		for(Livre doc : livre) {
			System.out.println(doc.getTitle() + " n°" + doc.getNumero() + " : " + doc.getAuthor());
		}
	}

	public void ajouterLivres(ArrayList<Document> doc) {
		for(Document livre : doc) {
			if(livre instanceof Livre) {
				if(document.size() < capacite) {
					document.add(livre);
					NbLivre ++;
				}
			}
		}
	}

	public void ajouterLivre(Livre livre){
		this.livre.add(livre);
	}

	public static void main(String[] argc) {

		Bibliotheque biblio = new Bibliotheque(50);
		Livrotheque livro = new Livrotheque(25);

		Roman neogicia = new Roman("neogicia", 1, "F. Fournier", 400, 0);
		Manuel man = new Manuel("man 1", 2, "Auteur 1", 25, 3);
		Revue rev1 = new Revue("rev 1", 3, 2019, 03);


		livro.ajouterLivre(neogicia);
		livro.ajouterLivre(man);
		biblio.ajouter(rev1);

		biblio.afficherDocuments();
		livro.afficherAuteurs();

	}

}
