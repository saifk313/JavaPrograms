package programs;

public class ConditionalStatements {

	public static void main(String[] args) {
		int age = 0;

		if (age > 18)
			System.out.println("Not Elegible to vote");
		else if (age >= 18)
			System.out.println("Elegible to vote");
		else
			System.out.println("Invalid age");
	}
}
