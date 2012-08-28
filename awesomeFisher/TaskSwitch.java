package awesomeFisher;

import org.powerbot.concurrent.strategy.Strategy;

import container.Constants;
import container.Methods;



public class TaskSwitch extends Strategy implements Runnable {

	@Override
	public void run() {
		String taskString = Methods.fishTaskString();
		if (taskString.equalsIgnoreCase("crayfish")) {
			Constants.fishingSpotID = Constants.crayfishSpotID;
			Constants.fishingAction = Constants.crayfishAction;
			Constants.fishingArea = Constants.crayfishArea;
		}
	}

	@Override
	public boolean validate() {
		return Constants.checkTask;
	}

}
