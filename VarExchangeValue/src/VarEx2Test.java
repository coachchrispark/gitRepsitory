
public class VarEx2Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 400;
		int num2 = 300;
		int num3 = 200;
		int tmp = 0;
		
		
		System.out.println("num1 " + num1);
		System.out.println("num2 " + num2);
		System.out.println("num3 " + num3);
		
		tmp = num1;
		num1 = num2;
		num2 = tmp;
		
		System.out.println();
		System.out.println("num1 " + num1);
		System.out.println("num2 " + num2);
		System.out.println("num3 " + num3);
		
		tmp = num2;
		num2 = num3;
		num3 = tmp;
		
		System.out.println();
		System.out.println("num1 " + num1);
		System.out.println("num2 " + num2);
		System.out.println("num3 " + num3);
		
		tmp = num1;
		num1 = num2;
		num2 = tmp;
		
		System.out.println();
		System.out.println("num1 " + num1);
		System.out.println("num2 " + num2);
		System.out.println("num3 " + num3);
		
		

	}

}
