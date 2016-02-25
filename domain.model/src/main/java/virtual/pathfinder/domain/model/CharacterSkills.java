package virtual.pathfinder.domain.model;

import java.util.Set;

public class CharacterSkills {

	
	Character character;
	Set<Skill> skills;
	
	private CharacterSkills() {/*empty constructor for hibernate*/	}
	
	
	
	private CharacterSkills(Character character, Set<Skill> skills) {
		this.character = character;
		this.skills = skills;
	}


}
