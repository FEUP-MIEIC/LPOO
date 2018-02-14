public class HelloWorld {

	/**
	 * @brief lelele
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("First iteration:");
		Totoloto ttlt1;
		try {
			ttlt1 = new Totoloto(6, 1, 50);
			ttlt1.populateNumbers();
			System.out.println(ttlt1);
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
		
		System.out.println("Second iteration:");
		Totoloto ttlt2;
		try {
			
			ttlt2 = new Totoloto(6, 1, 50);
			ttlt2.populateNumbersUnique();
			System.out.println(ttlt2);
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
		
		System.out.println("Third iteration:");
		Totoloto ttlt3;
		try {
			
			ttlt3 = new Totoloto(6, 1, 50);
			ttlt3.populateNumbersUnique();
			ttlt3.sortNumbers();
			System.out.println(ttlt3);
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
	}
}
