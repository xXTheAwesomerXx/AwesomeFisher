package awesomeFisher;

import java.awt.Graphics;

import org.powerbot.game.api.ActiveScript;
import org.powerbot.game.api.Manifest;
import org.powerbot.game.api.methods.Walking;
import org.powerbot.game.api.wrappers.Tile;
import org.powerbot.game.bot.event.listener.PaintListener;

@Manifest(authors = { "xXTheAwesomerXx" }, name = "AwesomeFisher", description = "BETA", version = 1.0)
public class AwesomeFisher extends ActiveScript implements PaintListener {

	public AwesomeFisher() {
		provide(new TaskSwitch());
		provide(new Fish());
		provide(new BankDrop());
	}

	@Override
	public void onRepaint(Graphics g) {

	}

	@Override
	protected void setup() {

	}

}
