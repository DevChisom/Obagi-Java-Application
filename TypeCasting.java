public class TypeCasting{
  public static void main(String[]args){
	  //widening Type Casting
	  double balance = 58585;
	  System.out.printf("Your account balance is %c%f%n", '$', balance);
	  
	  // Narrowing Type Casting (ASCII code for ? = 63)
	  char alpha = '?';
	  int asciiCode = (char)alpha;
	  System.out.printf("The Ascii code for ? is %d%n", asciiCode);
	  
	  double height = 5.8;
	  short myHeight = (short)height;
	  System.out.printf("My Faculty's height is %d%n", myHeight);
	  
	  
	  
	  
  }
}
  