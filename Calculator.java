package cse360assign3;

/** A basic calculator with history 
 * @author Chris LaVoy
 * @version Feb 21, 2016
 * */
public class Calculator {

	/** A value to hold the calculated to */
	private int total;
	
	/** Sets total to 0 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/** Returns the total */
	public int getTotal () {
		return total;
	}
	
	/** Adds a value to the total
	 * @param value		the value to add to the total 
	 */
	public void add (int value) {
		total += value;
	}
	
	/** Subtracts a value from the total
	 * @param value		the value to subtract from the total
	 */
	public void subtract (int value) {
		total -= value;
	}
	
	/** Multiplies the total by a value
	 * @param value		the value to multiply the total by 
	 */
	public void multiply (int value) {
		total *= value;
	}
	
	/**	Divides the total by a value
	 * @param value		the value to divide the total by
	 */
	public void divide (int value) {
		total /= value;
	}
	
	/** Returns the history of operations done by the calculator as a String */
	public String getHistory () {
		return "";
	}
}