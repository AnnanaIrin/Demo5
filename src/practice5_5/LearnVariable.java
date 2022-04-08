package practice5_5;

public class LearnVariable {
	  //Variable: is a container which can hold value
	  //Vary able: value will change based on its need
	  //What is variable?
	
	 // Create a variable
	//DataType variableName=variableValue;
	
	String instructorName="Irin";
	public String address = "Queens,NY";
	//String is a Data type
	//instructorName is a variable name
	//= is Assignment operator
	//"Irin" is a string value which is string type of data
			
    //Declare a variable 
	
	String name;
	//Declare a variable and assign variable
	String studentName = "Tuli";
	  
	int age =24; //global instant variable
	static int salary=5000; //global static variable
	
	//left side variableName = right side value
	//a=5
	// Global variable/ global scope/ class variable
	
			//Any variable you created inside of a class but outside of a method is called class level variable
					
			//Any variable you created inside of a method  is called local variable
			
			//static global  variable called by class name
					
					//For example:
					//mobile phone: battery, camera, ram, microphone, speaker
					//  without this component we can't manufacture mobile phone. using the mobile phone it's have lot of feature.
					
					//class it's have variable, method, lot of functionality code.
					//class is combination of variable of method.
					//Object: is the instance of a class. using the instance you can actually call the  variable
					//If you declare public all are visibility
					
	
	public static void main(String arg []) {
		
		
		
		int a=5;
		int b=6;
		
		int c = b;
		System.out.println(c);
		
		int d=b-c;
		
		System.out.println(d);
		 
		int e= b*c;
		System.out.println(e); // no need dobul code
		System.out.println(salary);
		
		//static global  variable called by class name
		
		System.out.println(LearnVariable.salary);
		
		//For example:
		//mobile phone: battery, camera, ram, microphone, speaker
		//  without this component we can't manufacture mobile phone. using the mobile phone it's have lot of feature.
		
		//class it's have variable, method, lot of functionality code.
		//class is combination of variable of method.
		//Object: is the instance of a class. using the instance you can actually call the  variable
		//If you declare public all are visibility
		
		//non static variable we can not call directly or using class name.
		//create object
		//className objectName= new constructorOfClass(); // constructorOfClassName is same class name
		
		
		
				LearnVariable obj = new LearnVariable();
				
				System.out.println(obj.age);
				
				LearnVariable le = new LearnVariable(); // new obj
				LearnVariable.salary=6666; //Reassign value
				le.age=34;
				
				le.salary=7777;
				salary=7777; //without class name and object name
				LearnVariable.salary=7777;
				
				System.out.println(LearnVariable.salary);
				System.out.println(le.age);
				
				
				
				
				Tuli1 tu =new Tuli1();
				tu.length=100; //Reassign value
				 System.out.println(tu.length);
				 
				 tu.name="Akter";
				 tu.name="Husna";
				 System.out.println("Student Name : "+tu.name);
				
				tu.address="bronx,NY";
				System.out.println("Address : "+tu.address);
						
				
				
				
				
		
		
		
		
	
	

		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
