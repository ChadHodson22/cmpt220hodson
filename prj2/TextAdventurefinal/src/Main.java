import java.util.Scanner; 
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int health = 100;
		int snakeHealth = 100;
		int inventoryItems = 0;
		final int inventorySize = 5;
		
				String beach = " A nice wide open sandy area, you can see the smoke from the sunken ship behind you"
				+ " and nothing but trees infrom of you ";
		String debrisSite = " An area on the beach where lots of random items have washed up...mayber there"
				+ " is something useful there ";
		String jungle = " The amount of trees makes it difficult to see but there seem to be small trails to"
				+ " follow. Maybe they were created by someone who was previously on the island? ";
		String mountains = " There are weird carvings on the rocks ";
		String cave = " it is too dark to see what is inside the cave. If only there was a way to light up"
				+ " the area. ";
		String abandonedBuilding = " The place is completely distroyed maybe you can scavage some supplies"
				+ " from it. ";
		String waterfall = " A beautiful and peaceful area that seems to untouched by anyone. ";
		String abandonedHut = " Someone used to live here. But where did they go? All of their belongings "
				+ "are still there but not much is useful";
		String underwaterCave = " There is a hidden cave behind thr waterfall ";
		String snakeDen = "You stumbled upon a snake den";
		String constructionSite = "A contruction area. It looks like it was going to be turned into an landing strip so planes "
				+ "could come here";

		String locations[] =  {beach, debrisSite, jungle, mountains, cave, abandonedBuilding, waterfall, 
				abandonedHut, underwaterCave, snakeDen, constructionSite};  

		String currentLocation = locations[0];
		
		String flashlight = "You found a flashlight!";
		String flareGun = "You found a flare gun!";
		String machete = "you found a machete!";
		String bandage = "You healed yourself od your wounds!";
		String radio = "You found a radio! It seems to be missing some wires but maybe there are some around the island. ";
		String radioWires = "Maybe you can find a use for these.";
		String snorkel = "You found a snorkle! They help you breahe while swimming!";
		String workingRadio = "There's a faint signal coming from the radio"; 
		
		 
		
		
		String map ="            Contruction Site                                           \n "
		        + "                        |                                                \n "
		        + "Mountains---Abandoned Building---Cave---?????                            \n "
				+ "       |                |            |                                   \n "
				+ "     Abandoned Hut---Jungle-------Waterfall---Underwater Cave            \n "
				+ "            |           |                                                \n "
				+ "        Debris Site---Beach                                              \n ";

		String items[] = { flashlight, flareGun, machete, map, bandage, radio, radioWires, snorkel, workingRadio };
		boolean hasItems[] = {false, false, false, false, false, false, false, false, false};
		boolean found[] = {false, false};  
		

		


		System.out.println(" Enter your name: ");
		String name = input.next(); 

		System.out.println(name + " You have just floated to shore on an island after your boat had "
				+ " been hit by a torpedo. You are now alone and must find a way to get off the island. Type"
				+ "north, south, east, or west to move directions. Type examine to get a better description "
				+ "of the location. Type take to pick up items, and drop to drop items.");

		System.out.println("You are on the beach");
		System.out.println("");
		
		while  (health > 0) {
			
			System.out.println("Enter a direction or a task you want to perform");
			String cmd = input.next();
			if (cmd.equals("north") || cmd.equals("up")) {
				if (currentLocation == locations[0]) {
					currentLocation = locations[2];
					System.out.print(jungle); //jungle
				}
	 //beach, debrisSite, jungle, mountains, cave, abandonedBuilding, waterfall, abandonedHut, underwaterCave  
				else if (currentLocation == locations[1]){
					currentLocation = locations[7];
					System.out.println(abandonedHut); //abandonedHunt
				}
				else if (currentLocation == locations[2]){
					currentLocation = locations[5];
					System.out.println(abandonedBuilding); //abandonedBuilding
				}
				else if (currentLocation == locations[3]){
					System.out.println("You cannot go this direction ");
				}
				else if (currentLocation == locations[4]){
					System.out.println("You cannot go this direction ");
				}
				else if (currentLocation == locations[5]){
					System.out.println(" You cannot go this direction ");
				}
				else if (currentLocation == locations[6]){
					currentLocation = locations[4];
					System.out.print(cave); //cave
				}
				else if (currentLocation == locations[7]){
					currentLocation = locations[3];
					System.out.print(mountains); //mountains
				}
				else if (currentLocation == locations[8]){
					System.out.println(" You cannot go this direction ");
				}
			}
			else if (cmd.equals("east") || cmd.equals("right")) {
				if (currentLocation == locations[0]) {
					System.out.println(" You cannot go this direction ");
				}
				else if (currentLocation == locations[1]){
					currentLocation = locations[0];
					System.out.println(beach); //beach
				}
				else if (currentLocation == locations[2]){
					currentLocation = locations[6];
					System.out.println(waterfall); //waterfall
				}
				else if (currentLocation == locations[3]){
					currentLocation = locations[5];
					System.out.println(abandonedBuilding); //abandonedBuilding
				}
				else if (currentLocation == locations[4]){
					if (hasItems[0] == false) {
						System.out.println("It's too dark to go any further ");
					}
					else if (hasItems[0] == true) {
						currentLocation = locations[9];
						System.out.println(snakeDen);
						System.out.print("Do you want to attack or run?");
					}
				}
				else if (currentLocation == locations[5]){
					currentLocation = locations[4];
					if (hasItems[0] == false) {
						System.out.println(cave);
					}
					else if (hasItems[0] == true) {
						System.out.println("You shine the flashlight to reveal whats inside the cave. Maybe there is something useful ");
					}
				}
				else if (currentLocation == locations[6]){
						if (hasItems[7] == true) {
							currentLocation = locations[8];
							System.out.print(underwaterCave); //underwaterCave
						}
						else if (hasItems[7] == false) {
							System.out.println("You tried to wim through it but couldn't hold your breath");
						}
				}
				else if (currentLocation == locations[7]){
					currentLocation = locations[2];
					System.out.print(jungle); //jungle
				}
				else if (currentLocation == locations[8]){
					System.out.println(" You cannot go this direction ");
				}
			}
			else if (cmd.equals("south") || cmd.equals("down")) {
				if (currentLocation == locations[0]) {
				System.out.print(" You cannot go this direction ");
				}
				else if (currentLocation == locations[1]){
					System.out.println(" You cannot go this direction ");
				}
				else if (currentLocation == locations[2]){
					currentLocation = locations[0];
					System.out.println(beach); //beach
				}
				else if (currentLocation == locations[3]){
					currentLocation = locations[5];
					System.out.println(abandonedHut); //abandonedHut
				}
				else if (currentLocation == locations[4]){
					currentLocation = locations[6];
					System.out.println(waterfall); //waterfall
				}
				else if (currentLocation == locations[5]){
					currentLocation = locations[2];
					System.out.println(jungle); //jungle
				}
				else if (currentLocation == locations[6]){
					System.out.print(" You cannot go this direction ");
				}
				else if (currentLocation == locations[7]){
					currentLocation = locations[1];
					System.out.print(debrisSite); 
				}
				else if (currentLocation == locations[8]){
					System.out.println(" You cannot go this direction ");
				}
			}
			else if (cmd.equals("west") || cmd.equals("left")) { //{ beach, debrisSite, jungle, mountains, cave, abandonedBuilding, waterfall, abandonedHut, underwaterCave};  
				if (currentLocation == locations[0]){
					currentLocation = locations[1];
					System.out.println(debrisSite);
				}
				else if (currentLocation == locations[1]){
					System.out.println(" You cannot go this direction ");
				}
				else if (currentLocation == locations[2]){
					currentLocation = locations[7];
					System.out.println(abandonedHut);
				}
				else if (currentLocation == locations[3]){
					currentLocation = locations[7];
					System.out.println(abandonedHut);
				}
				else if (currentLocation == locations[4]){
					currentLocation = locations[5];
					System.out.println(abandonedBuilding);
				}
				else if (currentLocation == locations[5]){
					currentLocation = locations[3];
					System.out.println(mountains);
				}
				else if (currentLocation == locations[6]){
					currentLocation = locations[2];
					System.out.print(jungle);
				}
				else if (currentLocation == locations[7]){
					System.out.println("You cannot go this direction ");
				}
				else if (currentLocation == locations[8]){
					currentLocation = locations[6];
					System.out.println(waterfall);
				}
			}
			else if (cmd.equals("examine")){
				if (currentLocation == locations[0]){
					System.out.println("You found a map! Unlike other items this can be used at any time");
					hasItems[3] = true;
				}
				else if (currentLocation == locations[1]) {
					System.out.println(radioWires);
					hasItems[6] = true;
				}
				else if (currentLocation == locations[2]) {
					System.out.println(flashlight);
					hasItems[0] = true;
				}
				else if (currentLocation == locations[3]) {
					System.out.println("There are numbers carved into this wall. 5-3-1-7");
				}
				else if (currentLocation == locations[4]) {
					System.out.println("You found bandages! Type bandage or bandages to heal yourself");
					hasItems[4] = true;
				}
				else if (currentLocation == locations[5]) {
					System.out.println("There is a safe hidden in a cabinet. There is a number pin");
					if (cmd.equals("5-3-1-7") || cmd.equals("5317")){
						System.out.println(flareGun);
						hasItems[1] = true;
					}
				}
				else if (currentLocation == locations[6]) {
					System.out.println("Nothing here ");
				}
				else if (currentLocation == locations[7]) {
					System.out.println(snorkel);
					hasItems[7] = true;
				}
				else if (currentLocation == locations[8]) {
					System.out.println(machete);
					hasItems[2] = true;
				}
				else if (currentLocation == locations[9]) {
					System.out.println(radio);
					hasItems[5] = true;
				}
			}
			if (cmd.equals("take")) {
				if (inventoryItems >= inventorySize ){
					System.out.println("You do not have enough inventory space. Drops items to clear up space");
				}
				else if (currentLocation == locations[0]) {
					if (hasItems[3] = true) {
						System.out.println("You already have this item");
					}
					else if (hasItems[3] = false) {
						System.out.println("You picked up the map");
						hasItems[3] = true;
						inventoryItems = inventoryItems + 1;
					}	
				}
				else if (currentLocation == locations[1]) {
					if (hasItems[6] = true) {
						System.out.println("You already have this item");
					}
					else if (hasItems[6] = false) {
						System.out.println("You picked up the radio wires");
						hasItems[6] = true;
						inventoryItems = inventoryItems + 1;
					}
				}
				else if (currentLocation == locations[2]) {
					if (hasItems[0] = true) {
						System.out.println("You already have this item");
					}
					else if (hasItems[0] = false) {
					System.out.println("You picked up the flashlight");
					hasItems[0] = true;
					inventoryItems = inventoryItems + 1;
					}
				}
				else if (currentLocation == locations[3]) {
					System.out.println("Nothing here to take");
				}
				else if (currentLocation == locations[4]) {
					if (hasItems[4] = true) {
						System.out.println("You already have this item");
					}
					else if (hasItems[4] = false) {
					System.out.println("You picked up the bandages");
					hasItems[4] = true;
					inventoryItems = inventoryItems + 1;
					}
				}
				else if (currentLocation == locations[5]) {
					if (hasItems[1] = true) {
						System.out.println("You already have this item");
					}
					else if (hasItems[1] = false) {
					System.out.println("You picked up the flare gun");
					hasItems[1] = true;
					inventoryItems = inventoryItems + 1;
					}
				}
				else if (currentLocation == locations[6]) {
					System.out.println("Nothing here to take");
				}
				else if (currentLocation == locations[7]) {
					if (hasItems[7] = true) {
						System.out.println("You already have this item");
					}
					else if (hasItems[7] = false) {
					System.out.println("You picked up the snorkel");
					hasItems[7] = true;
					inventoryItems = inventoryItems + 1;
					}
				}
				else if (currentLocation == locations[8]) {
					if (hasItems[2] = true) {
						System.out.println("You already have this item");
					}
					else if (hasItems[2] = false) {
					System.out.println("You picked up the machete");
					hasItems[2] = true;
					inventoryItems = inventoryItems + 1;
					}
				}
				else if (currentLocation == locations[9]) {
					if (hasItems[5] = true) {
						System.out.println("You already have this item");
					}
					else if (hasItems[5] = false) {
					System.out.println("You picked up the radio");
					hasItems[5] = true;
					inventoryItems = inventoryItems + 1;
					}
				}
			}
			else if (cmd.equals("drop")) {
				System.out.println("Enter what items you would like to drop");
				String itemDrop = input.next();
				if(inventoryItems <= 0) {
					System.out.println("You do not have any items to drop" );
				}
				else if (itemDrop.equals("flashlight")) {  //flashlight, flareGun, machete, map, bandage, radio, radioWires, snorkel, workingRadio
					System.out.println("You dropped the flashlight");
					hasItems[0] = false;
				}
				else if (itemDrop.equals("flare gun")) {
					System.out.println("You dropped the flare gun");
					hasItems[1] = false;
					inventoryItems = inventoryItems - 1;
				}
				else if (itemDrop.equals("machete")) {
					System.out.println("You dropped the machete");
					hasItems[2] = false;
					inventoryItems = inventoryItems - 1;
				}
				else if (itemDrop.equals("map")) {
					System.out.println("You dropped the map");
					hasItems[3] = false;
					inventoryItems = inventoryItems - 1;
				}
				else if (itemDrop.equals("bandage")) {
					System.out.println("You dropped the bandage");
					hasItems[4] = false;
					inventoryItems = inventoryItems - 1;
				}
				else if (itemDrop.equals("radio")) {
					System.out.println("You dropped the radio");
					hasItems[5] = false;
					inventoryItems = inventoryItems - 1;
				}
				else if (itemDrop.equals("radio wires")) {
					System.out.println("You dropped the radio wires");
					hasItems[6] = false;
					inventoryItems = inventoryItems - 1;
				}
				else if (itemDrop.equals("snorkel")) {
					System.out.println("You dropped the snorkel");
					hasItems[7] = false;
					inventoryItems = inventoryItems - 1;
				}
			}
			else if (cmd.equals("map")){
				if (hasItems[3] == false) {
					System.out.println("You do not have this item ");	
				}
				else if (hasItems[3] == true) {
					System.out.println(map);
				}
			}
			else if (cmd.equals("bandage") || cmd.equals("bandages")) {
				if (hasItems[4] == true){
					System.out.println(bandage);
					health = health + 20;
				}
				else if (hasItems[4] == false) {
					System.out.println("You do not have this item ");	
				}
			}
			if (cmd.equals("attack")) {
				if (hasItems[2] == true) {
					if (currentLocation == locations[9]) {
						System.out.println("You hit the snake and killed it"  );
						
					}
					else if (currentLocation != locations[9]) {
					}
				
				}
				else if (hasItems[2] == false) {
					health = health - 30;
					System.out.println("The snake bit you at took away 30 health! You have " + health + " health left!");
				}
			}
			else if (cmd.equals("run")) {
					System.out.println("Enter a direction or a task you want to perform");
			}
			if (hasItems[5] == true && hasItems[6] == true) {
				System.out.println("You now have a working radio");
				hasItems[5] = false;
				hasItems[6] = false;
			    hasItems[8] = true;
						
			}
			if (cmd.equals("help")) {
				System.out.println("You must find a away off the island. Type north, south, east, west to move directions. You can also use"
						+ "examine to look at specific area in more detail, take to pick up items, and drop to drop items. Certain areas require certain items ");
			}
			if (cmd.equals("quit")) {
				System.out.println("Goodbye");
				System.exit(0);
			}
			if (cmd.equals("escape")) {
				if (hasItems[9] == false) {
					System.out.println("You have no way of cantacting anyone for help");
				}
				else if (hasItems[9] == true && hasItems[1]== false) {
				System.out.println("You signal for help through the radio to a helicopter is flying near by the island. They search and"
						+ "search but cannot find your exact location. Eventually they give up and leave you.");
				}
				else if (hasItems[9] == true && hasItems[1]== true) {
					System.out.println("You signal for help through the radio to a helicopter is flying near by the island. As they "
							+ "get close to you you shoot off the flare gun to let them know your location. It's only a matter of"
							+ " time before they resue you");
					break;
				}
			}
		}
		
		RealCombat rc = new RealCombat();
		rc.main();
	}
}

//String map = "Mountains3---Abandoned Building(FG1)5---Cave(B4)4---?????(R5)9                         \n "
//		+ "       |                |            |                                   \n "
//		+ "     Abandoned Hut(S7)7---Jungle(F0)2-------Waterfall6---Underwater Cave(M2)8            \n "
//		+ "            |                    |                                                \n "
//		+ "       (RW6)Debris Site1---Beach(Map3)0                                              \n ";	


			