
public class StrTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch = ' ';
		//문자형
		String str = "";
		String name = "";
		//문자열 -> 어떤 다른 내용들과 합쳐져도 영향을 주지 않아야 한다
		
		//문자열 특징
		// 문자열 + any type -> 문자열 + 문자열 -> 문자열
		// any type + 문자열 -> 문자열 + 문자열 -> 문자열
		
		str = "Ja" + "va";
		name = str + 8.0;
		
		System.out.println("str : " + str);
		System.out.println("name : " + name);
		
		String string = "";
		
		string = 7 + " " + true;
		
		System.out.println(string);
		
		System.out.println(7 + 7 + "");
		System.out.println("" + 7 + 7);

	}

}
