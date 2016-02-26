package virtual.pathfinder.domain.model.classes;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import virtual.pathfinder.domain.model.Character;
import virtual.pathfinder.domain.model.Save;
import virtual.pathfinder.domain.model.Skill;
import virtual.pathfinder.domain.model.Skill.Name;

public class Fighter extends Character {

	
	private static final Set<Skill.Name> classSkills = Collections.unmodifiableSet(new HashSet<Skill.Name>(Arrays.asList(
			Name.CLIMB, Name.CRAFT, Name.HANDLE_ANIMAL, Name.INTIMIDATE, Name.KNOWLEDGE_DUNGEONEERING, 
			Name.KNOWLEDGE_ENGINEERING, Name.PROFESSION, Name.RIDE, Name.SURVIVAL, Name.SWIM 
			)));
	
	@Override
	protected void createSaves() {
		super.willSave = new Save(Save.Type.WILL, Save.Progression.SLOW);
		super.reflexSave = new Save(Save.Type.REFLEX, Save.Progression.SLOW);
		super.fortitudeSave = new Save(Save.Type.FORTITUDE, Save.Progression.FAST);
	}

	@Override
	protected Set<Skill.Name> createClassSkills() {
		return classSkills;
	}


}
