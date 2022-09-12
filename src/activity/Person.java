package activity;

public class Person {
	
	final char MALE = 'M';  
	
	private String name = "";
	private int age = 0;
	private String DNI = "";
	private char sex = MALE;
	
	public Person(){
		
	}
	
	public Person(String name, int age, char sex) {
		
		this.name = name;
		this.age = age;
		this.sex = sex;
	} 
	
	public Person(String name, int age, String DNI, char sex) {
		
		this.name = name;
		this.age = age;
		this.DNI = DNI;
		this.sex = sex;
	} 	
}
