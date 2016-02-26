package virtual.pathfinder.domain.model.bonus;

public class DescriptiveBonus extends Bonus {

	private String description;
	
	

	public DescriptiveBonus(String source, String description) {
		super(source);
		this.description = description;
	}



	public String getDescription() {
		return description;
	}

	
	
}
