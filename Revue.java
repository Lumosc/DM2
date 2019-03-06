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
	
	public getYear(){
		return this.year;
	}
	
	public getMonth(){
		return this.month;
	}
	
	public setYear(int year){
		this.year = year;
	}
	
	public setMonth(int month){
		this.month = month;
	}
}
