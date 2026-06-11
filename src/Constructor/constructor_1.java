/* constructor -> 
	-> it is a block of code when ever an object is created
	-> constructor will not return values
	-> name of constructor should be the class name
	*/

package Constructor;

public class constructor_1 {
	
	// Default Constructor
	public constructor_1() {   // creation of constructor. NOTE : There is no return type for the constructor
		System.out.println("I am in the constructor");
	} 
	
	// Parameterised Constructor
	public constructor_1(int a, int b) {
		System.out.println("you are in parameterised contructor of integer " + (a+b));
	}
	// Parameterised Constructor
	public constructor_1(String str) {
		System.out.println("you are in parameterised contructor of String " + str);
	}
	
	public void getData() {   // creation of function
		System.out.println(" I am in the method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		constructor_1 con1 = new constructor_1("hello"); 
		constructor_1 con2 = new constructor_1(07,19); 
		constructor_1 con3 = new constructor_1("Shadow"); 
		/*
		-> when ever we create an object constructor is called
		-> though we are not calling the constructor_1 method value still it gets executed since we have explicitly declared 
		constructor of the class name which has some method value present in it
		-> compiler will call implicit constructor if we had not defined any constructor block
		-> constructor_1 con = new constructor_1("hello"); == will throw error if no constructor has been declared which takes 
		   string as parameters.
		*/
		constructor_1 con = new constructor_1(); 
		con1.getData(); // this will also work since we calling via object irrespective to constructor parameter
		con.getData();
		// here we are calling via the class object to call the getData method values
	}

}
