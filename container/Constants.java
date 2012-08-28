package container;

import org.powerbot.game.api.wrappers.Area;
import org.powerbot.game.api.wrappers.Tile;

public class Constants {

	public static final int crayfishSpotID = 14882, feathersID = 1,
			coinsID = 1;
	public static int fishingSpotID, fishingLevel = 1;
	public static int[] fishID, crayfishID = { 1 }, troutID = { 1, 2 },
			lobsterID = { 377 }, swordfishID = { 359, 371 };
	
	public static boolean bankFish = false, checkTask = true;

	public static final String crayfishAction = "Cage";
	public static String fishingAction;

	public static final Area crayfishArea = new Area(new Tile[] {
			new Tile(3255, 3207, 0), new Tile(3258, 3207, 0),
			new Tile(3258, 3203, 0), new Tile(3255, 3203, 0) }),
			lumbridgeArea = new Area(new Tile[] { new Tile(3217, 3228, 0),
					new Tile(3225, 3228, 0), new Tile(3225, 3208, 0),
					new Tile(3217, 3208, 0) });
	public static Area fishingArea;

	public static final Tile[] lumbridgeToCrayfish = new Tile[] {
			new Tile(3223, 3218, 0), new Tile(3228, 3218, 0),
			new Tile(3233, 3218, 0), new Tile(3238, 3217, 0),
			new Tile(3241, 3216, 0), new Tile(3246, 3216, 0),
			new Tile(3249, 3212, 0), new Tile(3253, 3209, 0),
			new Tile(3256, 3205, 0), new Tile(3257, 3204, 0) };

}
