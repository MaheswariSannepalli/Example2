package JavaConceptsEmp2;

import java.util.Random;

public class JavaConceptsExmp2 {

	//Parent class
	public static class Spotify{
		
		public void songs()
		{
			System.out.print("songs added to your spotify ");
		}
		public void songs(String song) {}
	}
	
	//Child Class inheriting Spotify Class
	public static class SleepMusic extends Spotify{
		
		//Initializing string buffer
		StringBuffer songList = new StringBuffer("Yours , Ephipany , Travel with me ");
		
		//Method Overloading by RunTime Polymorphism
		public void songs()
		{
			//Calling parent class method using super keyword
			super.songs();
			System.out.println("SleepMusic playlist are : "+songList);
		}
		//Method Overriding by compile time polymorphism
		public void songs(String song)
		{
			//Appending value to String buffer
			songList.append(" , "+song);
			super.songs();
			System.out.println("SleepMusic playlist are : "+songList);
		}	
	}
	public static class PartyMusic extends Spotify{
		
		StringBuffer songList = new StringBuffer("Dope , Jump , GoGo ");
		
		public void songs()
		{
			super.songs();
			System.out.println("PartyMusic playlist are : "+songList);
		}
		public void songs(String song)
		{
			songList.append(" , "+song);
			super.songs();
			System.out.println("PartyMusic playlist are : "+songList);
		}
	}
    public static class StudyMusic extends Spotify{
		
		StringBuffer songList = new StringBuffer("SpringDay , Awake , Mono ");
		
		public void songs()
		{
			super.songs();
			System.out.println("StudyMusic  playlist are : "+songList);
		}
		public void songs(String song)
		{
			songList.append(" , "+song);
			super.songs();
			System.out.println("StudyMusic  playlist are : "+songList);
		}
	}
	//Enum data type declaration of default songs
	enum DefaultSongs{
		Idol,
		TruthUntold,
		Euphoria,
		Dynamite,
		Home;
	}
	
	public static class RandomSongs extends Spotify{
		public void songs() 
		{
			//Loading enum values to array
			DefaultSongs arr[] = DefaultSongs.values();
			//generating random number
			Random rand = new Random();
			super.songs();
			System.out.print("Random Songs generated are : ");
			for(int i=0;i<=10;i++)
			{
				System.out.print( arr[ rand.nextInt(arr.length) ] + " , ");
			}
		}
	}
	
	public static void main(String[] args)
	{
		Spotify s1= new SleepMusic();
		
		//Calling child class method using run time polymorphism
		s1.songs();
		//Appending song to String buffer
		s1.songs(" Still with you");
		
		Spotify s2= new PartyMusic();
		s2.songs();
		s2.songs(" Butter");
		
		Spotify s4= new StudyMusic();
		s4.songs();
		s4.songs(" Christmas Tree");
		
		Spotify s3= new RandomSongs();
		s3.songs();
	}

}
