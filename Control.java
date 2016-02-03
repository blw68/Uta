package Control;

import java.util.ArrayList;

import Song.Song;

public class Control {

	/**
	 * add newSong in correct spot in songList
	 * @param songList list of songs, should always be in abc order
	 * @param newSong Song instance that is about to be added into songList
	 */
	public static void addInAbcOrder(ArrayList<Song> songList, Song newSong) {
		if (songList.isEmpty() == true) {
			// no songs, add songName here
			songList.add(newSong);
			return;
		}
		
		if (songList.get(0).songName.compareTo(newSong.songName) > 0) {
			// songName is even smaller than first element, add at very beginning
			songList.add(0, newSong);
			return;
		}
		
		if (songList.get(songList.size() - 1).songName.compareTo(newSong.songName) < 0) {
			// songName is even bigger than last element, add at very end
			songList.add(newSong);
			return;
		}
		
		for (int i = 0; i < songList.size(); i++) {
			// search for correct location
			if (songList.get(i).songName.equals(newSong.songName) && songList.get(i).artist.equals(newSong.artist)) {
				// duplicate, not allowed
				System.out.println(newSong.songName + " by " + newSong.artist + " is a duplicate");
				return;
			}
			if (songList.get(i).songName.equals(newSong.songName)) {
				// songName is already in list, but artist is different, so ok, add here
				songList.add(i, newSong);
				return;
			}
			if (songList.get(i).songName.compareTo(newSong.songName) > 0) {
				// insert in index i
				songList.add(i, newSong);
				return;
			}
		}
	}
	
	/**
	 * prints out each song in songList, only used for testing purposes
	 * @param songList list of songs, should always be in abc order
	 */
	public static void printList(ArrayList songList) {
		for (int i = 0; i < songList.size(); i++) {
			System.out.println(i + " " + songList.get(i).toString());
		}
	}

}


