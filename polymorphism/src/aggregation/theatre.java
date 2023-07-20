package aggregation;

public class theatre {
	
	private String theatreName;
	private int screenCount;
	private String branch;
	
	public theatre(String theatreName, int screenCount, String branch) {
		;
		this.theatreName = theatreName;
		this.screenCount = screenCount;
		this.branch = branch;
	}

	public String getTheatreName() {
		return theatreName;
	}

	public int getScreenCount() {
		return screenCount;
	}

	public String getBranch() {
		return branch;
	}
	
	

}
