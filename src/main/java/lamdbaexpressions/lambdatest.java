package lamdbaexpressions;




public class lambdatest {
public static void main(String args[]){
		   //declare lambda 
	      lambdatest tester = new lambdatest();
			
	      //with type declaration
	      MathOperation addition = (int a, int b) -> a + b;
			
	      //with out type declaration
	      MathOperation subtraction = (c, d) -> c - d;
			
	      //with return statement along with curly braces
	      MathOperation multiplication = (int a, int b) -> { return a * b; };
			
	      //without return statement and without curly braces
	      MathOperation division = (int a, int b) -> a / b;
	      
	      //concatenate
	      
			
	      System.out.println("100 + 5 = " + tester.operate(100, 5, addition));
	      System.out.println("1012 - 512 = " + tester.operate(1012, 512, subtraction));
	      System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
	      System.out.println("10 / 5 = " + tester.operate(10, 5, division));
			
	      //with parenthesis
	      GreetingService greetService1 = message ->
	      System.out.println("Hello " + message);
			
	      //without parenthesis
	      GreetingService greetService2 = (message) ->
	      System.out.println("Hello " + message);
			
	      greetService1.sayMessage("Jason");
	      greetService2.sayMessage("Seannen");
	      
	      Age nameage = message ->
	      System.out.println("My age is" + " " + message);

	      Age nameage2 = message ->
	      System.out.println("My age is" + " " + message);
	      
	     
	      nameage.sayMessage("17");
	      nameage2.sayMessage("21");
	      
	   }
		
	   interface MathOperation {
	      int operation(int a, int b);
	   }
		
	   interface GreetingService {
	      void sayMessage(String message);
	   }
	   
	   interface Age {
		   void sayMessage(String message);
	   }
		
	   private int operate(int a, int b, MathOperation mathOperation){
	      return mathOperation.operation(a, b);
	   }
	}