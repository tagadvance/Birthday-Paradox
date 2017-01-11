import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * 
 * @see https://en.wikipedia.org/wiki/Birthday_problem
 * @see https://betterexplained.com/articles/understanding-the-birthday-paradox/
 */
public class BirthdayParadox {

	public static final int DAYS = 365;
	public static final int ITERATIONS = 1000000;

	public static void main(String[] args) {
		final Random random = new Random();
		final Set<Integer> set = new HashSet<Integer>();
		double total = 0;
		for (int i = 0; i < ITERATIONS; i++) {
			while (set.add(random.nextInt(DAYS)));
			total += set.size();
			set.clear();
		}
		System.out.println("Average: " + total / ITERATIONS);
	}

}
