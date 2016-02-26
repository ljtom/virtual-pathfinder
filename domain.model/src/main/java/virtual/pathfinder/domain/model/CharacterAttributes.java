package virtual.pathfinder.domain.model;

public class CharacterAttributes {

	public enum Attribute {
	
		STRENGTH,
		DEXTERITY,
		CONSTITUTION,
		INTELLIGENCE,
		WISDOM,
		CHARISMA;

	}
	
	private int strength;
	private int dexterity;
	private int constitution;
	private int intelligence;
	private int wisdom;
	private int charisma;
	
	public int getValue(Attribute attribute) {
		int value = 0;
		switch(attribute) {
			case STRENGTH:
				value = strength;
			case DEXTERITY:
				value = dexterity;
			case CONSTITUTION:
				value = constitution;
			case INTELLIGENCE:
				value = intelligence;
			case WISDOM:
				value = wisdom;
			case CHARISMA:
				value = charisma;
		}
		return value;
	}
	
	public int getModifier(Attribute attribute) {
		return (getValue(attribute)-10)/2;
	}
	
	public static int getModifier(int value) {
		return (value-10)/2;
	}
}
