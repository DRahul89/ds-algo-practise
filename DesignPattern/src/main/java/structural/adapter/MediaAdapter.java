package src.main.java.structural.adapter;

/**
 * 
 * This class which work as adapter between old MediaPlayer and
 * AdvanceMediaPlayer implementations,so it will implement the MediaPlayer
 * functionality with help of advance media player functions
 * 
 */
public class MediaAdapter implements MediaPlayer {
	/**
	 * Contains the reference of AdvanceMediaPlayer implementation reference
	 */
	private AdvanceMediaPlayer advanceMediaPlayer;

	public MediaAdapter(final String audioType) {
		if (audioType.equalsIgnoreCase(AdapterConstants.VLC_FILE_NAME)) {
			advanceMediaPlayer = new VLCPlayer();
		} else if (audioType.equalsIgnoreCase(AdapterConstants.MP4_FILE_NAME)) {
			advanceMediaPlayer = new MP4Player();
		}
	}

	@Override
	public void play(final String audioType,final String fileName) {
		if (audioType.equalsIgnoreCase(AdapterConstants.VLC_FILE_NAME)) {
			advanceMediaPlayer.playVLC(fileName);
		} else if (audioType.equalsIgnoreCase(AdapterConstants.MP4_FILE_NAME)) {
			advanceMediaPlayer.playMP4(fileName);
		}

	}

}
