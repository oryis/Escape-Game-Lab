public class Combination extends Item {
	private String combinationCode;

	public Combination(String name, String description, String combinationCode) {
		super(name, description);
		this.combinationCode = combinationCode;
	}

	public String getCombinationCode() {
		return combinationCode;
	}

	@Override
	public void use() {
		Game.print("Use this combination to open a specific safe.");
	}
}


