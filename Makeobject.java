package makingobject;

public class Makeobject {
	public static void main (String args[]){
		table table1 = new table();
		table1.setleg(6);
		table1.setcolor("yellow");
		
		
		table table2 = new table();
		table2.setleg(9);
		table2.setcolor("pink");
		
		table table3 = new table();
		
		System.out.println("table1's color is "+ table1.color + " table1's leg is"
				+ " " + table1.leg);
		System.out.println("table2's color is "+ table2.color + " table2's leg is"
				+ " " + table2.leg);
		System.out.println("table3's color is "+ table3.color + " table3's leg is"
				+ " " + table3.leg);
		
	}
}
class table{
	int leg = 4; // default leg
	String color = "yellow"; // default color
	public table(){
		//color = "blue";
		//leg = 5;
		}
	public int setleg(int newleg){
		leg = newleg;
		return leg;
		}
	public String setcolor(String newcolor){
		color = newcolor;
		return color;
		}
}