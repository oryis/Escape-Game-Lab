import java.util.HashMap;

public class Room {
	// OBJECT variables - usually private

	private String description; // room description to show players
	// object reference - set to null by default
	private HashMap<String, Item> items; // updating to hashmaps to store items
	private Room east; // reference to room to east
	private Room west; // reference to room west
	private Room north; // reference to room north
	private Room south; // reference to room south
	private Room up; // reference up
	private Room down;
	private boolean Locked;

	// constructor method - initialize room description
	public Room(String desc, String n) { // constructor method
		description = desc;
		items = new HashMap<>();
	}

	// object method

	// object methods

	public Room getExit(char d) { // get method, return description
		if (d == 'e')
			return east;
		else if (d == 'w')
			return west;
		else if (d == 'n')
			return north;
		else if (d == 's')
			return south;
		else if (d == 'u')
			return up;
		else if (d == 'd')
			return down;
		else
			return null; //
	}
	// updates one of the rooms variables
	// Character parameter identifies which variable
	// to update (example: 'e' means update the east

	public void addExit(Room c, char d) {
		if (d == 'e')
			east = c;
		else if (d == 'w')
			west = c;
		else if (d == 'n')
			north = c;
		else if (d == 's')
			south = c;
		else if (d == 'u')
			up = c;
		else if (d == 'd')
			down = c;
	}

	// Formats the objects data as a string.
	// returns the string.
	public String toString() {
		return description;
	}

	public Item getItem(String name) {
		return items.get(name);
	}

	public void putItem(Item i) {
		items.put(Item.getName(), i);

	}

	public boolean isLocked() {
		return Locked;
	}

	public void setLocked(boolean locked) {
		Locked = locked;
	}

	public void unlock() {
	}

	public String getName() {
		return getName();

	}

	public void setName(String name) {
	}

	public void addItem(Safe supplyCabinet) {

	}

	public void addItem(Combination combination) {

	}

}
