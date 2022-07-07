package java_220706;

import java.util.Arrays;
import java.util.stream.*;

public class javaStream {
	 
	public static void main(String[] args) {
		String line = "Test 15 lqlq 35 bad 99999 guess 34";

		int sum = Arrays
			.stream(line.split(" "))
			.filter((s) -> s.matches("\\d+"))
			.mapToInt(Integer::parseInt)
			.sum();
		
		System.out.println(sum);
	}
}