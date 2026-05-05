package power_pro;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Separate utility class for validation
class AgeValidator {
    public void validateAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Age must be 0-150");
        }
        System.out.print("Valid age: " + age);
    }
}

public class TryCatch {
    public static void main(String[] args) {
        AgeValidator validator = new AgeValidator();
        
        // Test custom exception
        try {
            validator.validateAge(-5);  // This will throw InvalidAgeException
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println(" - Age validation cleanup complete");
        }
        
        System.out.println();
        
        // Test arithmetic exception
        int i = 10;
        try {
            int res = i / 0;  // This automatically throws ArithmeticException
            // throw new ArithmeticException("Division with zero");  // Unreachable!
        } catch (ArithmeticException e) {
            System.out.println("Division error: " + e.getMessage());
        } finally {
            System.out.println("Division check complete - never divide by zero");
        }
    }
}