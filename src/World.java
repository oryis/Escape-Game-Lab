public class World {

	public static Room buildWorld() {
	    Room lobby = new Room("lobby", "You are in the Lobby.");
	    Room treatmentRoom = new Room("treatmentRoom", "You are in the Treatment Room.");
	    Room nursestation = new Room("nursestation", "You are in the Nurse Station. ");
	    Room restRoom = new Room("restRoom", "You are in the Rest Room.");
	    Room surgeryRoom = new Room("surgeryRoom", "You are in the Surgery Room.");
	    Room suite = new Room("suite", "You are in the Patient Suite");
	    Room hallway = new Room("Hallway", "You are in the Hallway");

		lobby.addExit(suite, 'e'); // lobby connects to patient suite
		Item cabinet = new Item("Cabinet", "A big Brown Cabinet");
		suite.addExit(lobby, 'w'); // suites connects to lobby

		restRoom.addExit(suite, 's'); // restRoom connects to suite
		Item brightlight = new Item("Light", "Bright light");
		suite.addExit(restRoom, 'n'); // suite connects to restroom
		Item notebook = new Item("notebook", "A small notebook");

		lobby.addExit(treatmentRoom, 'w'); // lobby connects to treatment
		treatmentRoom.addExit(lobby, 'e');// treatment connects to lobby

		treatmentRoom.addExit(nursestation, 'n'); // TREATMENT connects to nurse
		Item key = new Item("key", "blue metal key"); // adding items to rooms
		treatmentRoom.setLocked(true);

		nursestation.addExit(treatmentRoom, 's'); // nurse to treatment
		Item lockpick = new Item("lockpick", "A lockpick for one of the doors");

		Safe supplyCabinet = new Safe("Supply Cabinet", "A locked cabinet filled with medical supplies.", "");
		nursestation.addItem(supplyCabinet);

		Combination combination = new Combination("Combination", "A mysterious combination", "1234");
		nursestation.addItem(combination);

		surgeryRoom.addExit(hallway, 'e'); // surgery connects to hallway
		Item map = new Item("map", "A Map of the Hosiptal");
		hallway.addExit(surgeryRoom, 'w'); // hallway connects to surgery
		Item meds = new Item("meds", "unknown meds");

		treatmentRoom.addExit(nursestation, 'n'); // TREATMENT connects to nurse
		treatmentRoom.setLocked(true);

		lobby.addExit(hallway, 'u'); // lobby connects to hallway if u go up
		hallway.addExit(lobby, 'd'); // hallway connects to lobby going down

		treatmentRoom.putItem(key);
		surgeryRoom.putItem(meds);
		restRoom.putItem(brightlight);
		nursestation.putItem(lockpick);
		suite.putItem(notebook);
		hallway.putItem(map);
		lobby.putItem(cabinet);

		return lobby;
	}

}
