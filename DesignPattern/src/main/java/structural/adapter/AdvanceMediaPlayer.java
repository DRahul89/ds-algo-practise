package src.main.java.structural.adapter;

/**
 * 
 * Interface for advance media player functionalities
 * 
 */
public interface AdvanceMediaPlayer {
	/**
	 * Played a vlc file
	 * 
	 * @param fileName
	 *            name of vlc file
	 */
	void playVLC(final String fileName);

	/**
	 * played a Mp4 file
	 * 
	 * @param fileName
	 *            name of mp4 file
	 */
	void playMP4(final String fileName);
}
