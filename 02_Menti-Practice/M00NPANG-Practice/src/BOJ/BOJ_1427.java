package BOJ;

import java.util.*;

public class BOJ_1427 {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		String s = scanf.nextLine();
		
		char[] arr = s.toCharArray();
		
		Arrays.sort(arr);
		
		for (int i = arr.length -1; i >= 0 ; i--)
			System.out.print(arr[i]);

	}

}
