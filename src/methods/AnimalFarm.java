package methods;

import java.applet.AudioClip;

//Copyright (c) The League of Amazing Programmers 2013-2017

//Level 0

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class AnimalFarm {

	AnimalFarm() {
		/*
		 * 1. Ask the user which animal they want, then play the sound of that animal.\
		 * 
		 */

		for (int i = 0; i < 100; i++) {
			String edd = JOptionPane.showInputDialog(null, "What animals noise would you like to have me make?");
			if (edd.equalsIgnoreCase("Cow")) {
				playMoo();
			}
			if (edd.equalsIgnoreCase("Dog")) {
				playWoof();
			}
			if (edd.equalsIgnoreCase("Duck")) {
				playQuack();
			}
			if (edd.equalsIgnoreCase("Cat")) {
				playmeow();
			}
			if (edd.equalsIgnoreCase("Llama")) {
				playllama();
			}
		}
	}

	void playMoo() {
		playNoise(mooFile);
	}

	void playQuack() {
		playNoise(quackFile);
	}

	void playWoof() {
		playNoise(woofFile);
	}

	void playmeow() {
		playNoise(meowFile);
	}

	void playllama() {
		playNoise(llamaFile);
	}

	String quackFile = "quack.wav";
	String mooFile = "moo.wav";
	String woofFile = "woof.wav";
	String meowFile = "meow.wav";
	String llamaFile = "llama.wav";
	private String edd;

	/* Ignore this stuff */

	public void playNoise(String soundFile) {
		try {
			AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
			sound.play();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new AnimalFarm();
	}

}