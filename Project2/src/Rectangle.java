
public class Rectangle extends Shape implements PrintInterface{
	private double width,height;
		
	public Rectangle(double width, double height){
		this.width=width;
		this.height=height;
	}
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return this.width*this.height;
	}
	@Override
	public String printInformation() {
		// TODO Auto-generated method stub
		return "This is the rectangle and we are calculating the area";
	}

}
