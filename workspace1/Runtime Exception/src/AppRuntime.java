
public class AppRuntime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "HI";
		System.out.println(text.length());
		
		
		int k = 0;
		try{
			int i = 6/k;
			
		}catch(ArithmeticException e){
			
			System.out.println("An Arithmetic Exception is catched");
		}
		System.out.println("passed,");
		
		String[] texts = {"one", "two", "three"};
		System.out.println(texts[3]);
	}

}
