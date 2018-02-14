import java.util.Arrays;
import java.util.Random;

/**
 * 
 */

/**
 * @author Dannyps
 *
 */
public class Totoloto {

	private int[] numbers;
	
	public int[] getNumbers() {
		return this.numbers;
	}

	private Random r = new Random();
	/**
	 * @brief aka *The Range*.
	 */
	private int inf_bound, sup_bound;
	
	/**
	 * 
	 * @param n The amount of numbers to be generated.
	 * @param inf_bound The lower bound.
	 * @param sup_bound The upper bound.
	 * @throws Exception
	 */
	public Totoloto(int n, int inf_bound, int sup_bound) throws Exception {
		if(sup_bound<inf_bound) {
			throw new Exception("sup_bound must be greater than inf_bound!");
		}else {
			this.inf_bound=inf_bound;
			this.sup_bound=sup_bound;
		}
		
		this.numbers = new int[n];
		
		// Make sure all positions are good to be used, i.e., are filled with something different than the numbers in the range.
		for(int i=0;i<this.numbers.length;i++) {
			this.numbers[i]=this.inf_bound-1;
		}
	}
	
	public void populateNumbers() {
		for(int i=0;i<this.numbers.length;i++) {
			this.numbers[i]=this.r.nextInt(this.sup_bound+1)+this.inf_bound;
		}
	}
	public void populateNumbersUnique() throws Exception {
		if(this.numbers.length>this.sup_bound-this.inf_bound) {
			throw new Exception("There are more positions to fill than numbers available.");
		}
		for(int i=0;i<this.numbers.length;i++) {
			int tempN;
			boolean success=false;
			do {
				tempN = this.r.nextInt(this.sup_bound+1)+this.inf_bound;
				//System.out.println(this);
				//System.out.println("Came up with " + tempN + " to fill position ["+i+"]="+this.numbers[i]);
				if(!this.isNumberInNumbers(tempN)) {
					success=true;
					this.numbers[i]=tempN;
				}
			} while(!success);			
		}
		//done
	}

	private boolean isNumberInNumbers(int tempN) {
		for(int i=0;i<this.numbers.length;i++) {
			if(this.numbers[i]==tempN)
				return true;
		}
		return false;
	}

	public String toString() {
		String numbersString = "";
		for(int number:this.numbers) {
			 numbersString = numbersString.concat(Integer.toString(number)+", ");
		}
		numbersString = numbersString.substring(0, numbersString.length()-2)+".";
		return "Numbers: "+numbersString;
	}
	
	@Override
	public boolean equals(Object T) {
		if(!(T instanceof Totoloto))
			return false;
		Totoloto t=(Totoloto) T;
		if(this.numbers.length!=t.getNumbers().length)
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	public void sortNumbers() {
		// TODO Auto-generated method stub
		Arrays.sort(this.numbers);
	}
	
	
}
