
public class Principal {
	public static void main(String[] args) {
		//Instanciando o objeto "m1", do tipo MusicOrganizer
		MusicOrganizer m1 = new MusicOrganizer();
		Track t1 = new Track("Wow", "Post Malone", "2019");
		Track t2 = new Track("Rockstar", "Post Malone", "2017");
		Track t3 = new Track("Sunset Lover", "Petit Biscuit", "2015");
		Track t4 = new Track("Whatever it takes", "Imagine Dragons", "2017");
		//Adicionando as tracks ao m1.
		m1.addTrack(t1);
		m1.addTrack(t2);
		m1.addTrack(t3);
		m1.addTrack(t4);
		//Listando todas as músicas.
		m1.listAllTracks();
		//Tocando a música t4, que no Arraylist tem a posição número 3, já que a primeira posição do ArrayList é 0.
		m1.playTrack(3);
		}

}
