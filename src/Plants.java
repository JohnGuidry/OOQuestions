// An example of implementing an interface, you may have more than one
// Abstract Classes can contain both Abstract and Non-Abstract Methods.
public abstract class Plants implements PlantDef {
	private String Name;
	private String Season;
	private Double Height;
	
	public Plants(String Name, String Season, Double Height) {
		this.Name =  Name;
		this.Season = Season;
		this.Height = Height;
	}
	
	public void SetName(String InputName) {
		Name = InputName;
	}
	
	public void SetSeason(String InputSeason) {
		Season = InputSeason;
	}
	
	public void SetHeight(Double InputHeight) {
		Height = InputHeight;
	}
	
	public String GetName() {
		System.out.print("Plant Name: ");
		return (this.Name);
	}
	
	public String GetSeason() {
		return (this.Season);
	}
	
	public Double GetHeight() {
		return (this.Height);
	}
	
	// abstract Boolean IsGolfGrass();
	// This was removed due Grass.java being used within main(). 

}