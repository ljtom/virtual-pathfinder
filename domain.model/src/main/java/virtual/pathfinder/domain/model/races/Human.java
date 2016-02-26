package virtual.pathfinder.domain.model.races;

import java.util.Map;
import java.util.Set;

import virtual.pathfinder.domain.model.CharacterAttributes.Attribute;
import virtual.pathfinder.domain.model.Race;
import virtual.pathfinder.domain.model.RacialTrait;

public class Human extends Race {


	
	@Override
	protected Map<Attribute, Integer> initializeAttributeModifiers() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	protected Set<RacialTrait> defaultRacialTraits() {
		// TODO Auto-generated method stub
		return null;
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
