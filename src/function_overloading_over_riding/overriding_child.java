package function_overloading_over_riding;

import Inheritance.inheritance_child;

public class overriding_child extends overriding_parent{

	public void engine() {
		System.out.println("This is new generation engine");
	}
	
	public void colour() {
		System.out.println(color);
	}
	// calling the color variable from parent class i.e. inheritance_intro
	
	public void audiosystems() {
		System.out.println("This is the audiosystems section of child class");
	}
	
	public static void main(String[] args) {
		
		overriding_child cc = new overriding_child();      
		// here we use the same class name for creation of object unlike of interface		
		// cc.color(); 
		//since this is a variable in parent class 
		/* 
		it will throw an error bcoz 
		Unresolved compilation problem: 
		The method color() is undefined for the type inheritance_child 
		*/
		cc.brakes();
		cc.colour();
		cc.audiosystems(); 

		// suppose we create object for parent class via child class and call the audiosystem then also it will prefer child method only.
		// overriding_parent c1 = new overriding_child();
		// c1.audiosystems();   //Output -> This is the audiosystems section of child class.(Hence we use Super Keyword)
		
		// function overriding - both have method same name, same signature, same parameters but preference is given to child 
		// class because it's a local and this feature is known as overriding in OOPs of JAVA.
}
}
