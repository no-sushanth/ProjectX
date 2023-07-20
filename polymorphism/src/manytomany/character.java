package manytomany;

public class character {
	
	private String name;
	private String anime;
	private String race;
	private int powerlvl;
	private villains[] villain;
	
	
	
	
	public character(String name, String anime, String race, int powerlvl, villains[] villain) {
		super();
		this.name = name;
		this.anime = anime;
		this.race = race;
		this.powerlvl = powerlvl;
		this.villain = villain;
	}




	public void display() 
	{
		System.out.println("************CHARACTER***********");
		
		System.out.println("Name :: "+name);
		System.out.println("Anime :: "+anime);
		System.out.println("Race :: "+race);
		System.out.println("Power reading :: "+powerlvl);
		System.out.println();
		System.out.println("************VILLAINS FOUGHT************");
		
		for (villains villains : villain) {
			System.out.println("Name :: "+villains.getName());
			System.out.println("Power Reading :: "+villains.getPowerlvl());
			System.out.println("Fighting style :: "+villains.getStyle());
			System.out.println("-------------------------------");
	
		}
		System.out.println();
		
	}
	

}
