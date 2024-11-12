public class World {

	public static Room buildWorld() {
		Room lobby = new Room("lobby", "You are in the Lobby.");
		Room treatmentRoom = new Room("treatmentRoom", "You are in the Treatment Room.");
		Room nursestation = new Room("nursestation", "You are in the Nurse Station. ");
		Room restRoom = new Room("restRoom", "You are in the Rest Room.");
		Room surgeryRoom = new Room("surgeryRoom", "You are in the Surgery Room.");
		Room suite = new Room("suite", "You are in the Patient Suite");
		Room hallway = new Room("Hallway", "You are in the Hallway");
		Room xRay = new Room("xRay", "You are in the X-Ray Room");
		Room icu = new Room("icu", "You are in the ICU");
		Room pediatric = new Room("pediatric", "You are in the Pediatric Room");
		Room recovery = new Room("recovery", "You are in the Recovery Room");
		Room emergency = new Room("emergency", "You are in the X-Ray Room");
		Room isolation = new Room("isolation", "You are in the Isolation Room");

		// set items and description
		Item cabinet = new Item("Cabinet", "A big Brown Cabinet");
		Item diamond = new Item("diamond", "A sparkling diamond");
		Item brightlight = new Item("Light", "Bright light");
		Item notebook = new Item("notebook", "A small notebook");
		Item key = new Item("key", "blue metal key"); // adding items to rooms
		Item lockpick = new Item("lockpick", "A lockpick for one of the doors");
		Item map = new Item("map", "A Map of the Hosiptal");
		Item meds = new Item("meds", "unknown meds");

		// item and it's room
		treatmentRoom.putItem(key);
		surgeryRoom.putItem(meds);
		restRoom.putItem(brightlight);
		nursestation.putItem(lockpick);
		suite.putItem(notebook);
		hallway.putItem(map);
		lobby.putItem(cabinet);

		lobby.putItem(diamond);

		// my safe and combination
		Safe supplyCabinet = new Safe("Supply Cabinet", "A locked cabinet filled with medical supplies.", "");
		Combination combination = new Combination("Combination", "A mysterious combination", "4509"); // did this wrong x.x

		// safe and combination room
		nursestation.addItem(supplyCabinet);
		nursestation.addItem(combination);

		lobby.addExit(suite, 'e'); // lobby connects to patient suite
		emergency.addExit(lobby, 'd'); // lobby connects to emergency down??

		restRoom.addExit(suite, 's'); // restRoom connects to suite
		suite.addExit(restRoom, 'n'); // suite connects to restroom

		lobby.addExit(treatmentRoom, 'w'); // lobby connects to treatment
		treatmentRoom.addExit(lobby, 'e');// treatment connects to lobby

		treatmentRoom.addExit(nursestation, 'n'); // TREATMENT connects to nurse
		treatmentRoom.setLocked(true);

		nursestation.addExit(treatmentRoom, 's'); // nurse to treatment

		surgeryRoom.addExit(hallway, 'e'); // surgery connects to hallway
		hallway.addExit(surgeryRoom, 'w'); // hallway connects to surgery

		treatmentRoom.addExit(nursestation, 'n'); // TREATMENT connects to nurse
		treatmentRoom.setLocked(true);

		lobby.addExit(hallway, 'u'); // lobby connects to hallway if u go up
		hallway.addExit(lobby, 'd'); // hallway connects to lobby going down

		return lobby;
	}

}
