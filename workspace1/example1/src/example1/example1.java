package example1;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double input = 0;
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		input = scan.nextDouble();
		double s, c;
		
		//ArrayList ans = new ArrayList();
		String[] ans = new String[(int) input];
		for (int x = 1; x <= input; x++){
			
			s = Math.pow(x, 0.5);
			c = Math.pow(x, 0.333333333333333333333);
			
			if (( s%2==x) && (c%2 ==x)){
				ans[x-1] = x + "SC ";
			
			}
			else if(( x%s==0) && (x%c !=0)){
				ans[x-1] = x + "S ";
			}
			else if(( x%s!=0) && (x%c ==0)){
				ans[x-1] = x + "C ";
			}
			else{
				ans[x-1] = " ";
			}
			System.out.print(ans[x-1].toString());
		}
		
	
}
}