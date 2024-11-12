public class Safe extends Combination {

	private boolean isOpen;
	private String combination;

	public Safe(String name, String description, String combination) {
		super(name, description, combination);
		this.combination = combination;
		isOpen = false;
	}

	@Override
	public void open() {
		if (!isOpen) {
			Item combinationItem = getInventory("combination");
			if (getCombinationCode() != null) {
				Combination combinationCode = (Combination) combinationItem;
				if (combinationCode.getCombinationCode().equals(this.combination)) {
					isOpen = true;
					System.out.println("YAYY CONGRATS! you find the sparkling diamond inside! and picked it up.");
					getInventory(combination).put("diamond", new Item("diamond", "A sparkling diamond"));
				} else {
					System.out.println("The combination is incorrect.");
				}
			} else {
				System.out.println("You don't have the combination.");
			}
		} else {
			System.out.println("The safe is already open.");
		}
	}

	private Item getInventory(String string) {
		
		return null;
	}
}
