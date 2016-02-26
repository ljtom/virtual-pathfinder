package virtual.pathfinder.domain.model;

import virtual.pathfinder.domain.model.CharacterAttributes.Attribute;

public class Skill {
	
	public enum Name {
		ACROBATICS(true, true, Attribute.DEXTERITY),
		APPRAISE(true, false, Attribute.INTELLIGENCE),
		BLUFF(true, false, Attribute.CHARISMA),
		CLIMB(true, true, Attribute.STRENGTH),
		CRAFT(true, false, Attribute.INTELLIGENCE),
		DIPLOMACY(true, false, Attribute.CHARISMA),
		DISABLE_DEVICE(false, true, Attribute.DEXTERITY),
		DISGUISE(true, false, Attribute.CHARISMA),
		ESCAPE_ARTIST(true, true, Attribute.DEXTERITY),
		FLY(true, true, Attribute.DEXTERITY),
		HANDLE_ANIMAL(false, false, Attribute.CHARISMA),
		HEAL(true, false, Attribute.WISDOM),
		INTIMIDATE(true, false, Attribute.CHARISMA),
		KNOWLEDGE_ARCANA(false, false, Attribute.INTELLIGENCE),
		KNOWLEDGE_DUNGEONEERING(false, false, Attribute.INTELLIGENCE),
		KNOWLEDGE_ENGINEERING(false, false, Attribute.INTELLIGENCE),
		KNOWLEDGE_GEOGRAPHY(false, false, Attribute.INTELLIGENCE),
		KNOWLEDGE_HISTORY(false, false, Attribute.INTELLIGENCE),
		KNOWLEDGE_LOCAL(false, false, Attribute.INTELLIGENCE),
		KNOWLEDGE_NATURE(false, false, Attribute.INTELLIGENCE),
		KNOWLEDGE_NOBILITY(false, false, Attribute.INTELLIGENCE),
		KNOWLEDGE_PLANES(false, false, Attribute.INTELLIGENCE),
		KNOWLEDGE_RELIGION(false, false, Attribute.INTELLIGENCE),
		LINGUISTICS(false, false, Attribute.INTELLIGENCE),
		PERCEPTION(true, false, Attribute.WISDOM),
		PEFORM(true, false, Attribute.CHARISMA),
		PROFESSION(false, false, Attribute.WISDOM),
		RIDE(true, true, Attribute.DEXTERITY),
		SENSE_MOTIVE(true, false,Attribute.WISDOM),
		SLEIGHT_OF_HAND(false, true, Attribute.DEXTERITY),
		SPELLCRAFT(false, false, Attribute.INTELLIGENCE),
		STEALTH(true, true, Attribute.DEXTERITY),
		SURVIVAL(true, false, Attribute.WISDOM),
		SWIM(true, true, Attribute.STRENGTH),
		USE_MAGIC_DEVICE(false, false, Attribute.CHARISMA);
		
		
		private Name(boolean canBeUsedUntrained, boolean armorCheckApplies,
				Attribute keyAttribute) {
			this.canBeUsedUntrained = canBeUsedUntrained;
			this.armorCheckApplies = armorCheckApplies;
			this.keyAttribute = keyAttribute;
		}
		
		private boolean canBeUsedUntrained;
		private boolean armorCheckApplies;
		private Attribute keyAttribute;
	}
	
	private Name name;
	private boolean isClassSkill;
	private int ranks;
	
	public Skill(Name name, boolean isClassSkill) {
		this.name = name;
		this.isClassSkill = isClassSkill;
	}



	public Name getName() {
		return name;
	}


	public boolean isClassSkill() {
		return isClassSkill;
	}
	
	public int getRanks() {
		return ranks;
	}
	
	public void increaseRanks(int byValue) {
		ranks += byValue;
	}
	
	public boolean isCanBeUsedUntrained() {
		return name.canBeUsedUntrained;
	}
	
	public boolean isArmorCheckApplies() {
		return name.armorCheckApplies;
	}
	
	public Attribute getKeyAttribute() {
		return name.keyAttribute;
	}


	
}
