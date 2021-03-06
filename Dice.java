/**
 * |Members|
 * Jonathan		[s165213]
 * Johnny		[s165543] 
 * Chris		[s165230]
 * Thomas		[s154424]
 * Jesper		[s144211]
 * Bertram		[s153538]
 */
package terning;

public class Dice {
	// roll the die and return the value (1-6)
	public int roll() {
		float d1=(float)Math.random();     // 0-1
		float d2=d1*6;                     // 0-5
		int d3=(int)d2;             // 0-5 integer
		return d3 + 1;                     // 1-6		
	}
	
	// roll the die n times and print the values
	public void rollMultiple(int n) {
		for (int i=0; i<n; i++) {
			System.out.print(roll() + " ");
		}		
	}
}
