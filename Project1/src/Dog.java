
public class Dog extends Animal {
	private String dogName,dogBreed;
	private int dogAge;
	private static int count;
	
	public String getDogBreed() {
		return this.dogBreed;
	}
	
	public void displayDogInformation() {
		System.out.println(this.dogName+" , "
					+this.dogBreed+","+this.dogAge);
	}
	
	//default constructor : invoked implicitly when we create object
//	public Dog() {
//		System.out.println("Default constructor invoked!!");
//		this.dogName="Bruno";
//		this.dogBreed="Husky";
//		this.dogAge=2;
//	}
	
	//parameterized constructor
	public Dog(String dogName, String dogBreed, int dogAge) {
		System.out.println("parameterizec constructor invoked !!!");
		this.dogName=dogName;
		this.dogBreed=dogBreed;
		this.dogAge=dogAge;
		count++;
	}
	
	public static int getCounter() {
		return count;
	}
	
	
	public void makeNoise() {
		System.out.println("Dog is barking !!");
	}

	public void trainDog() {
		System.out.println("I can be trained!! You need to be better at training!!");
	}
	
	
}
