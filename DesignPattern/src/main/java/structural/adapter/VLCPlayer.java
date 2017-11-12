package src.main.java.structural.adapter;

/**
 * 
 * This class will play the VLC media files
 * 
 */
public class VLCPlayer implements AdvanceMediaPlayer {

	@Override
	public void playVLC(final String fileName) {
		System.out.println(new StringBuilder(AdapterConstants.VLC_PLAY_DESC + fileName));

	}

	@Override
	public void playMP4(final String fileName) {

	}

}
