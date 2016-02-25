package virtual.pathfinder.domain.model;

import java.util.List;

public class Equipment {

	
	Item head;
	Item headband;
	Item neck;
	Item shoulders;
	Item armor;
	Item hand1;
	Item hand2;
	Item gloves;
	Item bracers;
	Item chest;
	Item belt;
	Item legs;
	Item ring1;
	Item ring2;
	
	//did I forget something?
	
	//for ioun stones and such items that are active even in backpack
	List<Item> activeNonSlots;
	
	List<Item> inactive;
}
