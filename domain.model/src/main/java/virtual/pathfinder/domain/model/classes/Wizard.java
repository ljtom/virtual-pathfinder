package virtual.pathfinder.domain.model.classes;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import virtual.pathfinder.domain.model.Character;
import virtual.pathfinder.domain.model.Save;
import virtual.pathfinder.domain.model.Skill;
import virtual.pathfinder.domain.model.Skill.Name;
import virtual.pathfinder.domain.model.Spellbook;

public class Wizard extends Character{
	
	private static final Set<Skill.Name> classSkills = Collections.unmodifiableSet(new HashSet<Skill.Name>(Arrays.asList(
			Name.APPRAISE, Name.CRAFT, Name.FLY, Name.KNOWLEDGE_ARCANA,
			Name.KNOWLEDGE_DUNGEONEERING, Name.KNOWLEDGE_ENGINEERING,
			Name.KNOWLEDGE_GEOGRAPHY, Name.KNOWLEDGE_HISTORY, Name.KNOWLEDGE_LOCAL,
			Name.KNOWLEDGE_NATURE, Name.KNOWLEDGE_NOBILITY, Name.KNOWLEDGE_PLANES,
			Name.KNOWLEDGE_RELIGION, Name.LINGUISTICS, Name.PROFESSION, Name.SPELLCRAFT
			)));

	private Spellbook spellbook;
	
	@Override
	protected void createSaves() {
		super.willSave = new Save(Save.Type.WILL, Save.Progression.FAST);
		super.reflexSave = new Save(Save.Type.REFLEX, Save.Progression.SLOW);
		super.fortitudeSave = new Save(Save.Type.FORTITUDE, Save.Progression.SLOW);
	}

	@Override
	protected Set<Skill.Name> getClassSkills() {
		return classSkills;
	}
	
	public Spellbook getSpellbook() {
		return spellbook;
	}
	
	
}
