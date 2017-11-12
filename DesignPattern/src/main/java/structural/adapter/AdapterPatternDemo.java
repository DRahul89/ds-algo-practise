package src.main.java.structural.adapter;

/**
 * 
 * A demo class for Adapter pattern
 * 
 */
public class AdapterPatternDemo {
	/**
	 * Contains the type of file needs to play
	 */
	private static String audioType = null;
	/**
	 * contains the name of file needs to play
	 */
	private static String fileName = null;

	public static void main(String[] args) {

		final AudioPlayer audioPlayer = new AudioPlayer();
		audioType = AdapterConstants.MP3_FILE_NAME;
		fileName = "beyond the horizon.mp3"; // Not in constant file bcz it is a
												// dummy data client will send
												// it on run time
		audioPlayer.play(audioType, fileName);
		audioType = AdapterConstants.MP4_FILE_NAME;
		fileName = "alone.mp4";
		audioPlayer.play(audioType, fileName);
		audioType = AdapterConstants.VLC_FILE_NAME;
		fileName = "far far away.vlc";
		audioPlayer.play(audioType, fileName);
		audioType = AdapterConstants.AVI_FILE_NAME;
		fileName = "mind me.avi";
		audioPlayer.play(audioType, fileName);
	}
}