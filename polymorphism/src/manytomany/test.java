package manytomany;

public class test {

	public static void main(String[] args) {
		
		villains king = new villains("King", 20000, "Swords, fire, haki");	
		villains two = new villains("MR.two", 7000, "Swords and devil fruit");
		villains ryuma = new villains("ryuma", 12000, "sword : cursed sword");
		villains frieza = new villains("frieza", 12000, "Ki, Martial arts");	
		villains cell = new villains("cell", 20000, "Ki, Martial arts and copy arts");
		villains buu = new villains("buu", 40000, "Ki, absorption, gay strats");
		villains killerbee = new villains("Killer Bee", 15000, "tailed beast, ninjutsu and taijutsu");
		villains deidara = new villains("deidara", 4000, "Explosions, ninjutsu and taijutsu");
		villains danzo = new villains("danzo", 15000, "sharingan, izanagi and taijutsu");
		
		villains[] villainzoro = new villains[3];
		villainzoro[0] = king;
		villainzoro[1] = two;
		villainzoro[2] = ryuma;
		
		villains[] villainvegeta = new villains[3];
		villainvegeta[0] = frieza;
		villainvegeta[1] = cell;
		villainvegeta[2] = buu;
				
		villains[] villainsasuke = new villains[3];
		villainsasuke[0] = deidara;
		villainsasuke[1] = killerbee;
		villainsasuke[2] = danzo;
		
		character zoro =new character("Zoro", "One piece", "Human",  30000, villainzoro);
		character sasuke =new character("Sasuke", "Naruto", "Uchiha",  35000, villainsasuke);
		character vegeta =new character("Vegeta", "DBZ", "Saiyen",  40000, villainvegeta);
		zoro.display();
		sasuke.display();
		vegeta.display();
		

	}

}
