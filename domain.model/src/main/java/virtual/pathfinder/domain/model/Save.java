package virtual.pathfinder.domain.model;

public class Save {

	public enum Name {
		FORTITUDE(Attribute.Name.CONSTITUTION),
		REFLEX(Attribute.Name.DEXTERITY),
		WILL(Attribute.Name.WISDOM);
		
		private Attribute.Name attributeName;

		private Name(Attribute.Name attributeName) {
			this.attributeName = attributeName;
		}
		
		public Attribute.Name getAttributeName() {
			return attributeName;
		}
		
		
	}
	
	public enum Progression {
		FAST,
		SLOW
	}
	
	private Name name;
	private Progression progression;
	
	
	public Save(Name name, Progression progression) {
		super();
		this.name = name;
		this.progression = progression;
	}
	
	public Name getName() {
		return name;
	}
	public Progression getProgression() {
		return progression;
	}
	
	public int getBaseValue(Character character) {
		//TODO:
		//calculate base value depending on level and progression;
		//calculate bonus value depending on attribute
		//calculate bonus value depending on equipment
		return 0;
	}
	
	
	
	
	
}
