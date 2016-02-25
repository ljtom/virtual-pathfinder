package virtual.pathfinder.domain.model;

import java.util.Set;

public abstract class Character {

	protected Attribute strength;
	protected Attribute dexterity;
	protected Attribute constitution;
	protected Attribute intelligence;
	protected Attribute wisdom;
	protected Attribute charisma;
	protected Race race;
	protected Feat feat;
	protected Alignment alignment;
	private Equipment equipment;	
	
	//transient fields, calculated in constructor
	protected Save willSave;
	protected Save fortitudeSave;
	protected Save reflexSave;
	
	
	Set<Proficiency> proficiencies;
	
	protected Character() {	/*should never be used, it is here only for hibernate, characters should be created using constructors with properties*/}
	
	public Character(Race race, Alignment alignment, Attribute strength, Attribute dexterity, Attribute constitution, Attribute intelligence, Attribute wisdom, Attribute charisma) {
		this.race = race;
		this.strength = strength;
		this.dexterity = dexterity;
		this.constitution = constitution;
		this.intelligence = intelligence;
		this.wisdom = wisdom;
		this.charisma = charisma;
		this.alignment = alignment;
		
	}
	
	protected abstract void createSaves(); 
	
	
	public int getFortitudeSaveValue() {
		return fortitudeSave.getBaseValue(this);
	}
	
	public int getReflexSaveValue() {
		return reflexSave.getBaseValue(this);
	}
	
	public int getWillSaveValue() {
		return willSave.getBaseValue(this);
	}
}
