package src.main.java.structural.adapter;

/**
 * 
 * An interface which contains a general play method
 * 
 */
public interface MediaPlayer {
	/**
	 * This method will play a audio file
	 * 
	 * @param audioType
	 *            type of audio file
	 * @param fileName
	 *            name of audio file
	 */
	void play(final String audioType, final String fileName);
}
