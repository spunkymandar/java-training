
public class Main {
	public static void main(String... args) {
		System.out.println("hello from java again  & again!");
//		int[] data= {10,20,40,4,54,23,54};
		
//		Employee emp1=new Employee();
//		emp1.initEmployeeData(101, "John", "Programming");
//		emp1.calculateSalary();
//		String empInfo=emp1.displayEmployee();
//		System.out.println(empInfo);
//		
		
//		Dog dog1=new Dog("Husky","Bruno",2);
//		dog1.displayDogInformation();
//		
//		Dog dog2=new Dog("s","Neko",4);
//		dog2.displayDogInformation();
//		
//		int dogCount=Dog.getCounter();
//		System.out.println("Number of dogs :"+dogCount);
		
		
//		Triangle triangle1=new Triangle(10);
////		triangle1.height=500;
//		triangle1.calculateArea();
//		triangle1.displayTriangleData();
		
		
		/*
		 * in inheritance, the methods will be searched in the current object first, if is available in current object, that method is
		 * invoked. If not, it goes to parent object and that is invoked. If it not avaiable there also it generates error!!
		 */
		
//		Cat cat1=new Cat();
		Animal cat1=new Cat(); //polymorphic Reference
		cat1.eat();
		cat1.makeNoise();
		cat1.sleep();
		//cat1.readNewsPaper();
		
		Animal dog1=new Dog("Husky","Bruno",2);
		dog1.eat();
		dog1.makeNoise();
		dog1.sleep();
//		dog1.displayDogInformation();//specific method from subclass
		
		((Dog) dog1).trainDog();
		
		
		getAnimalInformation(cat1);
		
		
	}

	private static void getAnimalInformation(Animal dog1) {
		// TODO Auto-generated method stub
		
	}
}
