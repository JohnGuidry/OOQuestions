// An example of some interface
// Abstract Methods only, no body.
// Must use all methods within an interface
public interface PlantDef {
	
	// returns the name of some plant.
	String GetName();
	
	// returns what season the plant grows in.
	String GetSeason();
	
	// returns the Height of our plant.
	Double GetHeight();
	
	// returns the Width of our plant.
	Double GetWidth();
	
	// This is not allowed here since we are using an interface. Abstract Methods only.
	/*Boolean GetIsGolfGrass() {
		body;
	}*/

}