package container;

import org.powerbot.game.api.methods.Walking;
import org.powerbot.game.api.methods.interactive.Players;
import org.powerbot.game.api.methods.tab.Inventory;
import org.powerbot.game.api.wrappers.Area;
import org.powerbot.game.api.wrappers.Tile;
import org.powerbot.game.api.wrappers.node.Item;

public class Methods {

	public static boolean isInArea(Area area) {
		return area.contains(Players.getLocal().getLocation());
	}

	public static void dropItems(int[] items) {
		for (Item i : Inventory.getItems()) {
			for (int x = 0; x < items.length; x++) {
				if (i.getId() == items[x]) {
					i.getWidgetChild().interact("Drop");
				}
			}
		}
	}

	public boolean travsersePath(Tile[] tiles) {
		return Walking.newTilePath(tiles).traverse();
	}

	public static String fishTaskString() {
		int fishingLevel = 10;// AwesomeFisher.fishingLevel;
		if (fishingLevel < 20) {
			return "Crayfish";
		} else if (fishingLevel < 35) {
			return "Trout/Salmon";
		} else {
			return "Lobster";
		}
	}

}
