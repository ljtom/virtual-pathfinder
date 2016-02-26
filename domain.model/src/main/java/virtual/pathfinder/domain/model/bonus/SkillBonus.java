package virtual.pathfinder.domain.model.bonus;

import virtual.pathfinder.domain.model.Skill;
import virtual.pathfinder.domain.model.Skill.Name;

public class SkillBonus extends Bonus{

	private Skill.Name name;
	private int value;
	
	public SkillBonus(String source, Name name, int value) {
		super(source);
		this.name = name;
		this.value = value;
	}

	public Skill.Name getName() {
		return name;
	}

	public int getValue() {
		return value;
	}

	
}
