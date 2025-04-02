import java.util.Scanner;

public class SwitchStatement{
	public static void main(String [] args ){
	Scanner input = new Scanner(System.in);
	
		System.out.println ("Enter *131# To Subscribe Data");
		System.out.println ("Enter *310# To Check Airtime Balance");
		System.out.println ("Enter *303# To Borrow Data");
		
		System.out.print("Enter code: ");
		String option = input.nextLine();
		
		switch(option) {
			case "*131#":
			{
				System.out.println (" ");
				System.out.println("Enter 1 for 1 Month Plan");
				System.out.println("Enter 2 for 2 Month Plan");
				System.out.println("Enter 3 for 3 Month Plan");
				System.out.println("Enter 4 for 4 Month Plan");
				System.out.println(" ");
				
				System.out.print("Enter code:  ");
				int code = input.nextInt();
				
				switch (code) {
					case 1:
					{
					System.out.println("Your 1 months subscription has to be activated");	
					}
					break;
					
					case  2 :
					{
					System.out.println("Your 2 months subscription has to be activated");
					
					}
					break;
					
					case 3:
					{
						System.out.println("Your 3 months subscription has to be activated");	
					}
					break;
					
					case 4:
					{
						System.out.println("Your 4 months subscription has to be activated");	
					}
					break;
					default:
					 System.out.println("Invalid input");
				}
			}
			break;
			
			case "*310#":
			{
				System.out.println("your balance is N78w2.97");
			}
			break;
			
			case "*303#":
			{
				System.out.println (" ");
				System.out.println("Enter 1 for 1 Month Plan");
				System.out.println("Enter 2 for 2 Month Plan");
				System.out.println("Enter 3 for 3 Month Plan");
				System.out.println("Enter 4 for 4 Month Plan");	
				
				
				System.out.print("Enter code:  ");
				int code = input.nextInt();
				
				switch (code) {
					case 1:
					{
					System.out.println("Your 1 months subscription has to be activated");	
					}
					break;
					
					case  2 :
					{
					System.out.println("Your 2 months subscription has to be activated");
					
					}
					break;
					
					case 3:
					{
						System.out.println("Your 3 months subscription has to be activated");	
					}
					break;
					
					case 4:
					{
						System.out.println("Your 4 months subscription has to be activated");	
					}
					break;
					default:
					 System.out.println("Invalid input");
				}
			
			}c
			break;
			default:
			System.out.println("Invalid input");
		
		}
	}
}