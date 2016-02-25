package virtual.pathfinder.domain.model;

public class Attribute {

	public enum Name {
		STRENGTH,
		DEXTERITY,
		CONSTITUTION,
		INTELLIGENCE,
		WISDOM,
		CHARISMA;
		
	}
	
	private int value;
	private Name name;
	

	public Attribute(int value, Name name) {
		super();
		this.value = value;
		this.name = name;
	}


	public int getValue() {
		return value;
	}


	public Name getName() {
		return name;
	}


	public int getModifier() {
		return (value-10)/2;
	}
}
