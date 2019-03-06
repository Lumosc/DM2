public class Revue extends Document{
	private int year;
	private int month;
	
	public Revue(String nom, int saveNumber, int year, int month) {
		super(nom, saveNumber);
		this.year = year;
		this.month = month;
	}
	
	public String toString() {
		return (super.toString() + "Newspaper date of publication:"+ month+"/"+year);
	}
	
	public int getYear(){
		return this.year;
	}
	
	public int getMonth(){
		return this.month;
	}
	
	public void setYear(int year){
		this.year = year;
	}
	
	public void setMonth(int month){
		this.month = month;
	}
}
