package Calculate;

import java.util.Scanner;

public class Calculator{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a=scanner.nextInt();
		int b = scanner.nextInt();
		AddNum addNum = new AddNum();
		addNum.add(a,b);
		SubtractNum subtractNum = new SubtractNum();
		subtractNum.sub(a, b);
		DivideNum divideNum = new DivideNum();
		divideNum.divide(a, b);
		MultiplyNum multiplyNum = new MultiplyNum();
		multiplyNum.multiply(a, b);		
		scanner.close();
	}
}
