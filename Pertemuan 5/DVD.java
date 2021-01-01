public class DVD extends Item {
	private String director;

	public DVD(String theTitle, int time, String director) {
		super(theTitle, time);
		this.director = director;
	}

	public String getDirector
	{
		return director;
	}
}
