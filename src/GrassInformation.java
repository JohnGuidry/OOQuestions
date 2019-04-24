public class GrassInformation {

	public static void main(String[] args) {
		Grass Bermuda = new Grass("Bermuda", "Warm", 2.0, true);
		Plants Fescue = new Grass("Tall Fescue", "Cool", 3.5, false);
		
		Bermuda.SetName("Is it Bermuda?");
			
		System.out.println(Bermuda.GetName()); // Polymorphism since we are calling our subclass GetName from Grass.java. Plants.java during compile time verifies our subclass over the JVM.
		System.out.println(Fescue.GetSeason());
	}
}