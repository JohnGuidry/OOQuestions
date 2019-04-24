// An example of extending an Abstract Class, you may only do this once - Inheritance
public class Grass extends Plants {
	private String Name; //Encapsulation - Hidden from other classes and is only accessed via setter/getter
	private Boolean IsGolfGrass;
	private Boolean IsGrass;


	public Grass (String Name, String Season, Double Height, Double Width, Boolean IsGolfGrass, Boolean IsGrass) {
		super(Name, Season, Height, Width);
		this.Name = Name;
		this.IsGolfGrass = IsGolfGrass;
		this.IsGrass = IsGrass;
	}
	
	// Polymorphic/Method Overriding
	public void SetName(String InputName) {
		Name = InputName;
	}
	
	void SetGolfGrass(Boolean InputIsGolfGrass) {
		IsGolfGrass = InputIsGolfGrass;
	}
	
	// Polymorphic/Method Overriding
	public String GetName() {
		System.out.print("Grass Name: ");
		return (Name);
	}
	
	Boolean IsGrass() {
		return(this.IsGrass);
	}
	
	Boolean IsGolfGrass() {
		return (this.IsGolfGrass);
	}
	
	// Polymorphic/Method Overloading
	public Double Area() {
		Double Area;
		Area = this.GetHeight() * this.GetWidth();
		
		return (Area);
	}
	
}