package randomclass;
import java.util.Random;
public class Usingrandomclass {
	public static void main (String args[]){

// we need to pass a value in Random constructor to get a random value if we 
//don't pass a value it will take the current time to generate the random number
		Random random1 = new Random(4);
		System.out.print("From random1 ");
		for(int i = 0; i < 10; i++){
// method nextInt returns a random int value between 0 and n(excluding n)
			int p = random1.nextInt(1000);
			System.out.print(p + " ");}
//I have passed the same value to generate random number between 0 and 1000 to 
// check if they generate same random numbers
			Random random2 = new Random(4);
			System.out.print(" \nFrom random2 ");
			for(int k = 0; k < 10; k++){
	// method nextInt returns a random int value between 0 and n(excluding n)
				int l = random2.nextInt(1000);
				System.out.print(l + " ");
		}
		
	}

}

