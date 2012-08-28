package awesomeFisher;

import org.powerbot.concurrent.strategy.Strategy;
import org.powerbot.game.api.methods.tab.Inventory;

import container.Constants;
import container.Methods;



public class BankDrop extends Strategy implements Runnable {

	@Override
	public void run() {
		if (!Constants.bankFish) {
			while (Inventory.getCount(Constants.fishID) > 0) {
				Methods.dropItems(Constants.fishID);
			}
		}
	}

	@Override
	public boolean validate() {
		return Inventory.isFull();
	}

}
