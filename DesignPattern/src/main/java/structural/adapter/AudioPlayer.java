package src.main.java.structural.adapter;

/**
 * 
 * AudioPlayer class implements the advance player functionality by using the
 * adapter MediaAdapter
 * 
 */
public class AudioPlayer implements MediaPlayer {
	/**
	 * Contains the reference of media adapter
	 */
	private MediaAdapter mediaAdapter;

	@Override
	public void play(final String audioType,final String fileName) {
		if (audioType.equalsIgnoreCase(AdapterConstants.MP3_FILE_NAME)) {
			System.out.println(new StringBuilder(AdapterConstants.MP3_PLAY_DESC
					+ fileName));
		} else if (audioType.equalsIgnoreCase(AdapterConstants.VLC_FILE_NAME)
				|| audioType.equalsIgnoreCase(AdapterConstants.MP4_FILE_NAME)) {
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);

		} else {
			System.out.println(new StringBuilder(
					AdapterConstants.INVALID_FILE_CONSTANT + audioType
							+ AdapterConstants.INVALID_FORMAT_CONSTANT));
		}

	}

}
