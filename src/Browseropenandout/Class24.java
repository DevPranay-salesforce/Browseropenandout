package Browseropenandout;

public class Class24 {
	
	//This is an instance variable.
    public int age = 31;

    //This is an example of a Getter, it simply returns the value of age.
    public int getAge()
    {
        return age;
    }

    //This is an example of a Setter.
    //You can see we have 'int age' after the method name, this is a parameter.
    //The other class calling this method would provide that value
    //e.g setAge(31)
    public void setAge(int age)
    {
        //the keyword 'this' is being used here. It basically means 'this' class, the current instance.
        this.age =22;
    }

    //This is a class variable. Every instance we made of this class would have this variable and value.
    public static String firstName = "Richard";

    //We have a method called doSomeStuff.
    public void doSomeStuff()
    {
        //This is a local variable.
        //It's specific to this method. 
        //Cannot be set externally or used anywhere else in the class, only this method.
        int a = 14;
    }
	
	    public static void main(String[] args) {
	        // Create an instance of the class
	    	Class24 myObject = new Class24();

	        // Access and print the value of the age variable using the getter method
	        int currentAge = myObject.getAge();
	        System.out.println("Current age: " + currentAge);

	        // Set a new age value using the setter method
	        myObject.setAge(35);
	        System.out.println("New age: " + myObject.getAge());

	        // Access the class variable directly
	        System.out.println("First name: " + myObject.firstName);

	        // Call the doSomeStuff() method
	        myObject.doSomeStuff();
	    }
	}

