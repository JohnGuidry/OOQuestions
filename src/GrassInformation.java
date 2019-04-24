public class GrassInformation {

	public static void main(String[] args) {
		Grass Bermuda = new Grass("Bermuda", "Warm", 2.0, 0.5, true, true);
		Plants Fescue = new Grass("Tall Fescue", "Cool", 3.5, 0.2, false, true);
		Plants Rose = new Grass("Rose", "Warm", 11.0, 4.0, false, false);
		
		Bermuda.SetName("Is it Bermuda?");
			
		System.out.println(Bermuda.GetName()); // Polymorphism/Method Overriding since we are calling our subclass GetName from Grass.java. Plants.java during compile time verifies our subclass over the JVM.
		System.out.println(Fescue.GetName());
		
		System.out.println(Bermuda.Area()); // Polymorphism/Method Overloading
		System.out.println(Rose.Area(4.0));
		
	}
}