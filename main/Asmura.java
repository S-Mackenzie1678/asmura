package main;

import java.util.concurrent.TimeUnit;

import rendering.*;

public class Asmura {
	
	private static int FRAMERATE = 30;
	
	public int time;
	
	public Asmura() {
		// The time since start
		time = 0;
		// Create an AFrame (window for the game)
		AFrame frame = new AFrame(this);
		// Repaint it forever
		while (true) {
			frame.repaint();
			// Wait a certain amount
			try {
				TimeUnit.MILLISECONDS.sleep(1000/FRAMERATE);
			} catch (InterruptedException exception) {
				// TODO: Add error handling
			}
			time++;
		}
	}
	
	public static void main(String[] args) {
		new Asmura();
	}

}
