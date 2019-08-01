
public class Track {
	private String title;
	private String autor;
	private String date;
	//Construtor
	public Track(String title, String autor, String date) {
		this.title = title;
		this.autor = autor;
		this.date = date;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDetails() {
		return "|  Title: " + title + "  | Artist: " + autor + "  | Date: " + date + " |";
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	

	
}
