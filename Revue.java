public class Revue extends Document{
	private int year;
	private int month;
	
	public Revue(String nom, int saveNumber, int year, int month) {
		super(nom, saveNumber);
		this.year = year;
		this.month = month;
	}
	
	public String toString() {
		return "Revue " + super.toString();
	}
}
