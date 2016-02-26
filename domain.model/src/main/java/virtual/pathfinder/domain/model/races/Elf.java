package virtual.pathfinder.domain.model.races;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import virtual.pathfinder.domain.model.CharacterAttributes.Attribute;
import virtual.pathfinder.domain.model.Race;
import virtual.pathfinder.domain.model.RacialTrait;
import virtual.pathfinder.domain.model.Skill;
import virtual.pathfinder.domain.model.bonus.DescriptiveBonus;
import virtual.pathfinder.domain.model.bonus.OvercomeSpellResistanceBonus;
import virtual.pathfinder.domain.model.bonus.SkillBonus;

public class Elf extends Race {

	@Override
	protected Map<Attribute, Integer> initializeAttributeModifiers() {
		Map<Attribute, Integer> map = new HashMap<Attribute, Integer>();
		map.put(Attribute.DEXTERITY, 2);
		map.put(Attribute.INTELLIGENCE, 2);
		map.put(Attribute.CONSTITUTION, -2);
		return map;
	}

	@Override
	protected Set<RacialTrait> defaultRacialTraits() {
		Set<RacialTrait> traits = new HashSet<RacialTrait>();
		
		RacialTrait racialTrait = new RacialTrait().setRace(this)
			.setName("Keen Senses")
			.setBonusList(new SkillBonus("Racial", Skill.Name.PERCEPTION, 2));
		traits.add(racialTrait);
		
		racialTrait = new RacialTrait().setRace(this)
			.setName("Elven Immunities")
			.setBonusList(new DescriptiveBonus("Racial", "Immunity to Sleep"),
						new DescriptiveBonus("Racial", "+2 saving throw vs enchantment"));
		traits.add(racialTrait);
			
		racialTrait = new RacialTrait().setRace(this)
			.setName("Elven Magic")
			.setBonusList(new OvercomeSpellResistanceBonus("Racial", 2),
						new DescriptiveBonus("Racial", "+2 bonus on spellcraft to identify"));
		traits.add(racialTrait);
		
		racialTrait = new RacialTrait().setRace(this)
			.setName("Weapon Familiarity")
			.setBonusList(new DescriptiveBonus("Racial", "Proficient with longbows, longsword, rapiers, shortbows"),
						new DescriptiveBonus("Racial", "Treat any elven weapon as martial "));
		traits.add(racialTrait);
		racialTrait = new RacialTrait().setRace(this)
			.setName("Low-Light Vision")
			.setBonusList(new DescriptiveBonus("Racial", "Elves can see twice as far as humans in conditions of dim light"));
		traits.add(racialTrait);
		
		
		return traits;
		
		
		
	}

	@Override
	protected Set<RacialTrait> alternateRacialTraits() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getBaseSpeed() {
		return 30;
	}


}
