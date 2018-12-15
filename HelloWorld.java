
public class HelloWorld {
	
	static class Circle{
		
		public static Circle newCircleWithRadius(int radius) {
			return new Circle(radius);
		}
		
		public static Circle newCircleWithDiameter(int diameter) {
			return newCircleWithRadius(diameter / 2);
		}
		
		private int radius;
		private Circle(int rad){
			radius = rad;
		}
		
		public int getRadius(){
			return radius;
		}
		
		public void setRadius(int rad){
			radius = rad;
		}
		
}

	public static void main(String[] args) {
		
		Circle myCircle = new Circle(2);
		myCircle.setRadius(4);
		System.out.print(myCircle.getRadius());
			

		
	}
	}

