package virtual.pathfinder.domain.model;

import java.util.Map;
import java.util.Set;

import virtual.pathfinder.domain.model.CharacterAttributes.Attribute;

public abstract class Race {
	
	private Map<Attribute, Integer> attributeModifiers = initializeAttributeModifiers();
	private Set<RacialTrait> traits = defaultRacialTraits();
	
	protected abstract Map<Attribute, Integer> initializeAttributeModifiers();

	protected abstract Set<RacialTrait> defaultRacialTraits();
	
	protected abstract Set<RacialTrait> alternateRacialTraits();

	public int getRacialBonus(Attribute attribute) {
		Integer racialMod = attributeModifiers.get(attribute);
		return racialMod == null ? 0 : racialMod;
	}
	
	//default value, override per need
	public CreatureSize getSize() {
		return CreatureSize.MEDIUM;
	}
	
	public abstract int getBaseSpeed();

}
