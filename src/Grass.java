// An example of extending an Abstract Class, you may only do this once - Inheritance
public class Grass extends Plants {
	private String Name; //Encapsulation - Hidden from other classes and is only accessed via setter/getter
	private Boolean IsGolfGrass;


	public Grass (String Name, String Season, Double Height, Boolean IsGolfGrass) {
		super(Name, Season, Height);
		this.Name = Name;
		this.IsGolfGrass = IsGolfGrass;
	}
	
	// Polymorphic
	public void SetName(String InputName) {
		Name = InputName;
	}
	
	void SetGolfGrass(Boolean InputIsGolfGrass) {
		IsGolfGrass = InputIsGolfGrass;
	}
	
	// Polymorphic
	public String GetName() {
		System.out.print("Grass Name: ");
		return (Name);
	}
	
	Boolean IsGolfGrass() {
		return (this.IsGolfGrass);
	}
	
}