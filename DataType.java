public class DataType{
   public static void main(String[] args){
     // integer type (byte,short,int,long)
   
     byte age = 50;
   System.out.printf("Your age is %d%n", age);
   
   
   // short datatype
     short quantity = 32000;
	 System.out.printf("I bought %d quantity of bags for my business%n", quantity);
	 
	 //int represents a 16 bit signed integer
	 int populationInNigeria = 1000000000;
	 System.out.printf("The total population in Nigeria is %d%n", populationInNigeria);
	 
	 //long
	 long worldPopulation = 8000000000L;
	 System.out.printf("The world population is %d%n", worldPopulation);
   
   //float-point type (float & double)
    float myBalance = 123465.8585999F;
    System.out.printf("Your account balance is %f%n",myBalance);
	
	//double 
	double cbnReserve = 5575857.737367366363;
	System.out.printf("The CBN balance is %.5f%n", cbnReserve);
	
	
	//boolean type (boolean)
	boolean isJavaFun = true;
	System.out.printf("Is Java a fun language ? %b%n", isJavaFun) ;
	
	//character type(char)
	char alpha ='@';
	System.out.printf("My email is mercyben405%cgmail.com",alpha);
	
	
	
	// git status,git add -A, git commit -m "....",git push
   }
}