
public class Triangle {
	private double base,height;
	private double area;
	
	public Triangle(int base) {
		this.base=base;
		this.height=this.base*2;
	}
	
	public void calculateArea() {
		this.area=0.5*this.base*this.height;
		
	}
	
	public void displayTriangleData() {
		System.out.println("base "+this.base);
		System.out.println("height: "+this.height);
		System.out.println("area: "+this.area);
	}

}
