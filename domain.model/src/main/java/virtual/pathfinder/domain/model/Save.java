package virtual.pathfinder.domain.model;

public class Save {

	public enum Type {
		FORTITUDE(Attribute.CONSTITUTION),
		REFLEX(Attribute.DEXTERITY),
		WILL(Attribute.WISDOM);
		
		private Attribute attributeName;

		private Type(Attribute attributeName) {
			this.attributeName = attributeName;
		}
		
		public Attribute getAttributeName() {
			return attributeName;
		}
		
		
	}
	
	public enum Progression {
		FAST,
		SLOW
	}
	
	private Type type;
	private Progression progression;
	
	
	public Save(Type type, Progression progression) {
		super();
		this.type = type;
		this.progression = progression;
	}
	
	public Type getType() {
		return type;
	}
	public Progression getProgression() {
		return progression;
	}
	
	public int getBaseValue(Character character) {
		int baseValue = 0;
		if (progression == Progression.FAST) {
			baseValue = fastProgression(character.getLevel());
		} else {
			baseValue = slowProgression(character.getLevel());
		}
		int modifier = character.getAttributeModifier(type.getAttributeName());
		
		return baseValue+modifier;
	}
	
	private int fastProgression(int level) {
		return 2 + (level/2);
		
	}
	
	private int slowProgression(int level) {
		return level/3;
		
	}
	
	
	
	
	
}
