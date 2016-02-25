package virtual.pathfinder.domain.model;

import java.util.Set;


public abstract class Character {

	protected int strength;
	protected int dexterity;
	protected int constitution;
	protected int intelligence;
	protected int wisdom;
	protected int charisma;
	
	protected Race race;	
	
	protected int level;
	
	protected Feat feat;
	protected Alignment alignment;
	private Equipment equipment;
	
	
	//transient fields, calculated in constructor
	protected Save willSave;
	protected Save fortitudeSave;
	protected Save reflexSave;
	
	Set<Skill> skills;
	
	
	Set<Proficiency> proficiencies; //calculated from list feats, race, spells etc.
	
	protected Character() {	/*should never be used, it is here only for hibernate, characters should be created using constructors with properties*/}
	
	public Character(Race race, int level,  Alignment alignment, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
		this.race = race;
		this.level = level;
		this.strength = strength;
		this.dexterity = dexterity;
		this.constitution = constitution;
		this.intelligence = intelligence;
		this.wisdom = wisdom;
		this.charisma = charisma;
		this.alignment = alignment;
		createSaves();
		
		Set<Skill.Name> classSkills = getClassSkills();
		for(Skill.Name skillName : Skill.Name.values()) {
			Skill skill = new Skill(skillName, classSkills.contains(skillName));
			skills.add(skill);
		}
		
	}
	
	protected abstract void createSaves(); 
	
	protected abstract Set<Skill.Name> getClassSkills(); 
	
	
	public int getFortitudeSaveValue() {
		int value = fortitudeSave.getBaseValue(this);
		//TODO: calculate bonuses from spells, equipment abilites etc.
		return value;
	}
	
	public int getReflexSaveValue() {
		int value = reflexSave.getBaseValue(this);
		//TODO: calculate bonuses from spells, equipment abilites etc.
		return value;
	}
	
	public int getWillSaveValue() {
		int value = willSave.getBaseValue(this);
		//TODO: calculate bonuses from spells, equipment abilites etc.
		return value;
	}
	
	public int getLevel() {
		return level;
	}
	
	public int getAttributeValue(Attribute attribute) {
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
		//TODO: apply any racial, equipment, spell, feat or other bonuses
		return value;
	}
	
	public int getAttributeModifier(Attribute attribute) {
		return Attribute.getModifier(getAttributeValue(attribute));
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
		for (Skill skill : skills) {
			if (skill.getName().equals(name)) {
				return skill;
			}
		}
		Skill skill = new Skill(name, getClassSkills().contains(name));
		skills.add(skill);
		return skill;
	}
	
	public void equipItem(Item item) {
		equipment.equip(item);
	}
	
	
	
	
}
