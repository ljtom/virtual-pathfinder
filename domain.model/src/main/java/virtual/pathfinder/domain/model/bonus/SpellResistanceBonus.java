package virtual.pathfinder.domain.model.bonus;

public class SpellResistanceBonus extends Bonus {
	
	private int value;

	public SpellResistanceBonus(String source, int value) {
		super(source);
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
