package Week_4_Assignment;

class CustomException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CustomException(String message) {
		super(message);
	}
}

public class ExceptionHandlingExample {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		try {
			// ArithmeticException example
			int a = 10, b = 0;
			System.out.println(a / b);

			// NullPointerException example
			String str = null;
			System.out.println(str.length());

			// CustomException example
			int age = 17;
			if (age < 18) {
				throw new CustomException("Age must be 18 or above.");
			}
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException: Division by zero is not allowed.");
		} catch (NullPointerException e) {
			System.out.println("NullPointerException: Cannot perform operation on null object.");
		} catch (CustomException e) {
			System.out.println("CustomException: " + e.getMessage());
		} finally {
			System.out.println("Exception handling completed.");
		}
	}
}
