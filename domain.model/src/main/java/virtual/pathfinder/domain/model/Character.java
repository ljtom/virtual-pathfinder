package virtual.pathfinder.domain.model;

import java.util.List;
import java.util.Set;

import virtual.pathfinder.domain.model.CharacterAttributes.Attribute;


public abstract class Character {

	private CharacterAttributes attributes;
	private Race race;	
	
	private int level;
	
	private List<Feat> feats;
	private Alignment alignment;
	private Equipment equipment;
	private Set<Skill> skills;
	
	
	//transient fields, calculated in constructor
	protected Save willSave;
	protected Save fortitudeSave;
	protected Save reflexSave;
	
	
	private Set<Skill.Name> classSkills;
	
	
	private Set<Proficiency> proficiencies; //calculated from list feats, race, spells etc.
	
	protected Character() {	/*should never be used, it is here only for hibernate, characters should be created using constructors with properties*/}
	
	public Character(Race race, int level,  Alignment alignment, CharacterAttributes attributes) {
		this.race = race;
		this.level = level;
		this.attributes = attributes;
		this.alignment = alignment;
		createSaves();
		classSkills = createClassSkills();
		for(Skill.Name skillName : Skill.Name.values()) {
			Skill skill = new Skill(skillName, classSkills.contains(skillName));
			skills.add(skill);
		}
		
	}
	
	protected abstract void createSaves(); 
	
	protected abstract Set<Skill.Name> createClassSkills();
	
	
	public int getFortitudeSave() {
		int value = fortitudeSave.getBaseValue(this);
		//TODO: calculate bonuses from spells, equipment abilites etc.
		return value;
	}
	
	public int getReflexSave() {
		int value = reflexSave.getBaseValue(this);
		//TODO: calculate bonuses from spells, equipment abilites etc.
		return value;
	}
	
	public int getWillSave() {
		int value = willSave.getBaseValue(this);
		//TODO: calculate bonuses from spells, equipment abilites etc.
		return value;
	}
	
	public int getLevel() {
		return level;
	}
	
	public int getAttributeValue(Attribute attribute) {
		int value = attributes.getValue(attribute);
		value+=race.getRacialBonus(attribute);
		//TODO: apply any racial, equipment, spell, feat or other bonuses
		return value;
	}
	
	public int getAttributeModifier(Attribute attribute) {
		return CharacterAttributes.getModifier(getAttributeValue(attribute));
	}
	
	public void increaseSkillRanks(Skill.Name name, int byValue) {
		getSkill(name).increaseRanks(byValue);	
	}
	
	public int getSkillValue(Skill.Name name) {
		Skill skill = getSkill(name);
		int modifier = getAttributeModifier(skill.getKeyAttribute());
		int value = skill.getRanks() + modifier;
		//TODO: calculate bonus from spells and other stuff
		return value;
	}
	
	public int getSkillRanks(Skill.Name name) {
		return getSkill(name).getRanks();
	}
	
	public Skill getSkill(Skill.Name name) {
		if (classSkills == null) {
			classSkills = createClassSkills();
		}
		for (Skill skill : skills) {
			if (skill.getName().equals(name)) {
				return skill;
			}
		}
		Skill skill = new Skill(name, classSkills.contains(name));
		skills.add(skill);
		return skill;
	}
	
	public void equipItem(Item item) {
		equipment.equip(item);
	}
	
	
	
	
}
