//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package extra;
import java.net.URI;
import javax.swing.JOptionPane;
public class SoundtrackToLife {
	public static void main(String[] args) {
		// 1. Adjust this pop-up to find out what mood the user is in.
		int userMood = JOptionPane.showOptionDialog(null, "What is your current mood?", "Your Mood", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Happy", "Sad", "Stressed", "Deppresed"}, null);
		// 2. Their answer is stored in the userMood variable. Print it out.
        System.out.println(userMood);
		// 3. If they are in a stressed mood, use the playVideo method to play a calming song from YouTube.
		if (userMood==0) {
		playVideo("https://www.youtube.com/watch?v=y6Sxv-sUYtM");
		}
        if (userMood==1) {
        playVideo("https://www.youtube.com/watch?v=hLQl3WQQoQ0");
        }
		if (userMood==2) {
		playVideo("https://www.youtube.com/watch?v=hTWKbfoikeg");
		}
		// 4. Play different songs for other moods.
		if (userMood==3) {
		playVideo("https://www.youtube.com/watch?v=NTdFEZhjiko");
		}
/**
* If you can’t think of any, here are some you can use...
*	http://bit.ly/video-for-happy
*	http://bit.ly/video-for-sad
*	http://bit.ly/video-for-angry
**/
		// If you are seeing ads at the beginning of your videos, install Adblock.
	}
	static void playVideo(String youTubeLink) {
		try {
			URI uri = new URI(youTubeLink);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}