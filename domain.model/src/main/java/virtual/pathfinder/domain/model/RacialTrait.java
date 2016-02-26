package virtual.pathfinder.domain.model;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import virtual.pathfinder.domain.model.bonus.Bonus;

public class RacialTrait {
	
	private Race race;
	private String name;
	private List<Bonus> bonusList;
	private Set<RacialTrait> conflictingTraits;
	

	public Race getRace() {
		return race;
	}

	public RacialTrait setRace(Race race) {
		this.race = race;
		return this;
	}

	public String getName() {
		return name;
	}

	public RacialTrait setName(String name) {
		this.name = name;
		return this;
	}

	public List<Bonus> getBonusList() {
		return bonusList;
	}

	public RacialTrait setBonusList(Bonus... bonusList) {
		this.bonusList = Arrays.asList(bonusList);
		return this;
	}

	public Set<RacialTrait> getConflictingTraits() {
		return conflictingTraits;
	}

	public RacialTrait setConflictingTraits(RacialTrait... conflictingTraits) {
		this.conflictingTraits = new HashSet<RacialTrait>(Arrays.asList(conflictingTraits));
		return this;
	}

	
	
	
	
}
