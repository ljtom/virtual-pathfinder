package virtual.pathfinder.domain.model;

public enum Attribute {

	
	STRENGTH,
	DEXTERITY,
	CONSTITUTION,
	INTELLIGENCE,
	WISDOM,
	CHARISMA;
	
	

	public static int getModifier(int value) {
		return (value-10)/2;
	}
	
	
}
