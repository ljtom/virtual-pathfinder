package virtual.pathfinder.domain.model.classes;

import virtual.pathfinder.domain.model.Character;
import virtual.pathfinder.domain.model.Save;
import virtual.pathfinder.domain.model.Save.Name;
import virtual.pathfinder.domain.model.Save.Progression;

public class Wizard extends Character{

	@Override
	protected void createSaves() {
		super.willSave = new Save(Save.Name.WILL, Save.Progression.FAST);
		super.reflexSave = new Save(Save.Name.REFLEX, Save.Progression.SLOW);
		super.fortitudeSave = new Save(Save.Name.FORTITUDE, Save.Progression.SLOW);
	}
}
