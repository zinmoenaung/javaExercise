package conditional;

public class modifycondi {

	public static void main(String[] args) {
		System.out.println("helloworld");

		System.out.println(ifElse(2, 3, false));// assigned
		System.out.println(condTwo(3, 4));
		System.out.println("count is "+q);
			}

	public static int numreturn(int a, int b) {
		int t = a + b;
		System.out.println(t);
		return t;
	}

	// conditional
	public static int ifElse(int j, int k, Boolean l) {
		if (l == true) {
			return j + k; // output 5
		} else {
			return j - k;// output 1 for false
		}
	}

	// CONDITIONAL2
	public static int condTwo(int g, int h) {
		if (g == 0 && h == 0)
			return 0;
		else {
			if (g == 0 || h == 0) {
				return g + h;
			} else
				return g * h;
		}
	}

	// for loop
	public static int q = 10;
	{
		for(int i=1; i<q; i++) {
				
			}
		}

/*Iteration: loop that will call and 
output the result of your method from 
Conditionals 2, 10 times, using the current 
iteration as one of the parameters you pass to it.
skip and do later!!*/	
	
/* array: create array hold 10 integer number
 * populate the array with values
 * call and output the result of your
 *  method from Conditionals 2,
 */
	
	

	
