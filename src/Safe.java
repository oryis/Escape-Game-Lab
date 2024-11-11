public class Safe extends Item {
    
	private boolean isOpen;
    private String combination;

    public Safe(String name, String description,String combination) {
        super(name, description);
        this.combination = combination;
        isOpen = false;
    }

    @Override
    public void open() {
        if (!isOpen) {
            Item combinationItem = Game.getItemFromInventory("combination");
            if (combinationItem != null) {
                Combination combinationItemCast = (Combination) combinationItem;
                if (combinationItemCast.getCombinationCode().equals(this.combination)) {
                    isOpen = true;
                    Game.print("Using the combination, you open the safe and find a diamond inside! Naturally, you pocket the diamond.");
                    Game.getInventory().put("diamond", new Item("diamond", "A sparkling diamond"));
                } else {
                    Game.print("The combination is incorrect.");
                }
            } else {
                Game.print("You don't have the combination.");
            }
        } else {
            Game.print("The safe is already open.");
        }
    }
}

