package co.edu;

public class BitOpertor {

	public static void main(String[] args) {
		int num = 10;
		int result =~num; // -11, 비트반전연산자, 모수 
		result++;
		System.out.println(result);
		
		//대입연산자 : =, +=, -=, *=, /= .......
		String names = "홍길동";
		names = names + " 김민수";
		names += " 박의식";         // += : 값 누적
		System.out.println(names);
		
		result = result -2;
		result -= 2;
		System.out.println(result);		
		
	}

}
