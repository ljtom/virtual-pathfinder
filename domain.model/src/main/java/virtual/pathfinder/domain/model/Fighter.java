package virtual.pathfinder.domain.model;

public class Fighter extends Character {

	@Override
	protected void createSaves() {
		super.willSave = new Save(Save.Name.WILL, Save.Progression.SLOW);
		super.reflexSave = new Save(Save.Name.REFLEX, Save.Progression.SLOW);
		super.fortitudeSave = new Save(Save.Name.FORTITUDE, Save.Progression.FAST);
	}


}
