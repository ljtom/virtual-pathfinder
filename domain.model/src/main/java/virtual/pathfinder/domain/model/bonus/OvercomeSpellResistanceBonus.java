package virtual.pathfinder.domain.model.bonus;

public class OvercomeSpellResistanceBonus extends Bonus{

	private int value;

	public OvercomeSpellResistanceBonus(String source, int value) {
		super(source);
		this.value = value;
	}

	public int getValue() {
		return value;
	}
	
	
}
