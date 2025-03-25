package application;

public class Boxing {

	public static void main(String[] args) {
		int x = 20;//memoria -> stack
		
		Object obj = x;//memoria -> heap
		
		System.out.println(obj);
		
		int y = (int)obj;//memoria -> stack
		
		System.out.println(y);

	}

}
