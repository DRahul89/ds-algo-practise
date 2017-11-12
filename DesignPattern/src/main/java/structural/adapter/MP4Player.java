package src.main.java.structural.adapter;

/**
 * 
 * This class will play the MP4 media  files
 * 
 */
public class MP4Player implements AdvanceMediaPlayer {

	@Override
	public void playVLC(final String fileName) {

	}

	@Override
	public void playMP4(final String fileName) {
		System.out.println( new StringBuilder(AdapterConstants.MP4_PLAY_DESC + fileName));

	}

}
