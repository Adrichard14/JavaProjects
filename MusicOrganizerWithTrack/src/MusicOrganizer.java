import java.util.ArrayList;

public class MusicOrganizer
	{
	private ArrayList<Track> tracks;
	//private MusicPlayer player;
	//private TrackReader reader;
	
	public int getNumberOfTracks() {
		int lenght;
		lenght = tracks.size();
		return lenght;
		
	}
	public MusicOrganizer()
	{
		tracks = new ArrayList<Track>();
		//player = new MusicPlayer();
		//reader = new TrackReader();
		//readLibrary("audio");
		System.out.println("Music library loaded. " +
		getNumberOfTracks() + " tracks.");
		System.out.println();
	}
	public void addTrack(Track track){
		tracks.add(track);
	}
	
	public void listAllTracks(){
		System.out.println("Track listing: ");
		for(Track track : tracks) {
			System.out.println(track.getDetails());
		}
		System.out.println();
	}
	public boolean indexValid(int index) {
		if (this.getNumberOfTracks() > index && index >= 0) {
			return true;
		}else {
			return false;
		}
		
	}
	public void playTrack(int index){
			if(indexValid(index)) {
			Track track = tracks.get(index);
			//player.startPlaying(track.getFilename());
			System.out.println("|> Now playing: " + track.getAutor() +
			" - " + track.getTitle());
			}	
	}
	
	
}