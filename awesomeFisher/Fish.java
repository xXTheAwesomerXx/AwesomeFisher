package awesomeFisher;

import org.powerbot.concurrent.strategy.Strategy;
import org.powerbot.game.api.methods.Walking;
import org.powerbot.game.api.methods.node.SceneEntities;
import org.powerbot.game.api.methods.tab.Inventory;
import org.powerbot.game.api.wrappers.node.SceneObject;

import container.Constants;
import container.Methods;



public class Fish extends Strategy implements Runnable {

	@Override
	public void run() {
		SceneObject spotID = SceneEntities.getNearest(Constants.fishingSpotID);
		if (Methods.isInArea(Constants.fishingArea)) {
			if (spotID != null && spotID.isOnScreen())
				spotID.interact(Constants.fishingAction);
		} else {
			if (Methods.fishTaskString().equalsIgnoreCase("crayfish")) {
				Walking.findPath(Constants.fishingArea.getNearest())
						.getTilePath().traverse();
			}
		}
	}

	@Override
	public boolean validate() {
		return !Inventory.isFull();
	}

}
