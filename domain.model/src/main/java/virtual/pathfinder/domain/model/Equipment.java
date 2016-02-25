package virtual.pathfinder.domain.model;

import java.util.List;

import virtual.pathfinder.domain.model.items.Armor;
import virtual.pathfinder.domain.model.items.Belt;
import virtual.pathfinder.domain.model.items.Body;
import virtual.pathfinder.domain.model.items.Chest;
import virtual.pathfinder.domain.model.items.Eyes;
import virtual.pathfinder.domain.model.items.Feet;
import virtual.pathfinder.domain.model.items.Hands;
import virtual.pathfinder.domain.model.items.Head;
import virtual.pathfinder.domain.model.items.Headband;
import virtual.pathfinder.domain.model.items.Neck;
import virtual.pathfinder.domain.model.items.Ring;
import virtual.pathfinder.domain.model.items.Shoulders;
import virtual.pathfinder.domain.model.items.Slotless;
import virtual.pathfinder.domain.model.items.Wielded;
import virtual.pathfinder.domain.model.items.Wrists;


/**
 * @author Tomi
 * 
 * source for properties: http://www.d20pfsrd.com/magic-items#TOC-Size-and-Magic-Items
 *
 */
public class Equipment {

	
	Armor armor;
	Belt belt;
	Body body;
	Chest chest;
	Eyes eyes;
	Feet feet;
	Hands gloves;
	Head head;
	Headband headband;
	Neck amulet;
	Ring ring1;
	Ring ring2;
	Shoulders cloak;
	Wrists wrists;
	Wielded mainHand;
	Wielded offHand;
	List<Slotless> slotless; //example ioun stones
	
	List<Item> backpack;
	
	public void equip(Item item) {
		//TODO:
	}
	
	public void unequip(Item item) {
		//TODO:
	}
	
	public boolean checkEquipped(Item item) {
		//TODO:
		return false;
	}
	
	public void putInBackpack(Item item) {
		backpack.add(item);
	}
	public void removeFromBackpack(Item item) {
		backpack.remove(item);
	}
	
	public boolean checkInBackpack(Item item) {
		return backpack.contains(item);
	}
	
	
	
}
