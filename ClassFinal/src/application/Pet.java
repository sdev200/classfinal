package application;

public abstract class Pet {
	// private variables
	private String Type="";
	private String Name="";
	private String Breed="";
	private String Color="";
	private double Weight = 0.0;

	// default constructor
	public Pet() {
	}
	
	
	// public properties
	public String getType() {
		return Type;
	}


	public void setType(String type) {
		Type = type;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getBreed() {
		return Breed;
	}


	public void setBreed(String breed) {
		Breed = breed;
	}


	public String getColor() {
		return Color;
	}


	public void setColor(String color) {
		Color = color;
	}


	public double getWeight() {
		return Weight;
	}


	public void setWeight(double weight) {
		Weight = weight;
	}


	
	
	
	

}
