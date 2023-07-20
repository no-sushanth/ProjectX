package aggregation;

public class movies {
	
	private String moviename;
	private int duration;
	private int screennumber;
	
	private theatre theatre;

	public movies(String moviename, int duration, int screennumber, theatre theatre) {
		
		this.moviename = moviename;
		this.duration = duration;
		this.screennumber = screennumber;
		this.theatre = theatre;
	}
	
	public void display() 
	{
		System.out.println("*********Movie deets*********");
		System.out.println("Movie name ::"+moviename);
		System.out.println("Duration :: "+duration+ " minutes");
		System.out.println("Screen Number :: "+screennumber);
		
		System.out.println("********THEATRE DEETS**********");
		System.out.println("Theatre Name :: "+theatre.getTheatreName());
		System.out.println("Screens :: "+theatre.getScreenCount());
		System.out.println("Branch :: "+theatre.getBranch());
	}

}
