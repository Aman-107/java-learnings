package Interface;

public interface Intro { 
	// here we can see it bydefault has interface instead of class (2nd word) -> here methods are not defined they are defined at abstract level

		public void greenGo(); 
		// when we try try to define a method( { } ) it throws an error to remove the method
		public void redStop();
		public void FlashYellow();
}






/*  

	Interfaces don't have return types; methods inside interfaces can have return types.
	Example : 
	
	interface Animal {
    void makeSound();    // return type: void
    int getAge();        // return type: int
    String getName();    // return type: String
}

When a class implements the interface, it must use the same return type:
	class Dog implements Animal {

    public void makeSound() {
        System.out.println("Woof");
    }

    public int getAge() {
        return 5;
    }

    public String getName() {
        return "Tommy";
    }
}




   Interface -> it defines the methods signatures i.e. some fixed set of rules - class 
   
    public void getData(){
    }
    
    will have methods but not body
    Example -> 
    Interface : 
    {
    Green           - to go
    Red             - to stop
    Flashing yellow - wait
    }
    
    CLASSES should define and implement methods present in interface
    Example ->
    Australia {
    Green()
    {
    // any other requirements of code or modification in code
    }
    }


	
 */
 
