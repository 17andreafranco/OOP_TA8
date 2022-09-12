package activity;

public class Show {

	private String title = "";
	private int numSeason = 3;
	private boolean delivered = false;
	private String genre = "";
	private String creator = "";

	public Show() {

	}

	public Show(String title, String creator) {
		this.title = title;
		this.creator = creator;

	}

	public Show(String title, int numSeason, String genre, String creator) {
		this.title = title;
		this.numSeason = numSeason;
		this.genre = genre;
		this.creator = creator;
	}

}
