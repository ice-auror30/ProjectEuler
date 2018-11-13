import java.util.stream.IntStream;

/**
 * @author IceAuror
 * Solution to problem-1 from Project Euler. For problem details refer README.md
 */
public class problem1 {
	static int sum = 0;
	public static void main(String args[]) {
		IntStream.range(1, 1000).forEach(
				number -> {
					if(number%3==0 || number%5 == 0){
						sum+=number;
					}
				});
		System.out.println(sum);
	}
}
