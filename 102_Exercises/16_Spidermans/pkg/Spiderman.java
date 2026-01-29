package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spiderman {
	String actor;		// What's the actors name?
	int age;			// What's the age of the actor?
	String villain;		// Who's the arch nemesis of this Spiderman?

	// Create constructors for each combination of actor/age/villain. Use the defaults above if not an input parameter.
		public Spiderman()
		{
			actor = "";
			age = 0;
			villain = "";
		}
		public Spiderman(String act, int a, String v)
		{
			actor = act;
			age = a;
			villain = v;
		}
		public Spiderman(String act)
		{
			actor = act;
			age = 0;
			villain = "";
		}
		public Spiderman(int a)
		{
			actor = "";
			age = a;
			villain = "";
		}
		public Spiderman(String act, int a)
		{
			actor = act;
			age = a;
			villain = "";
		}
	// ---------------------------------------
	// Create accessor and mutator methods for actor, age, and villain (6 total methods)
	// Ex: getAge and setAge
		public String getActor()
		{
			return actor;
		}
		public void setActor(String act)
		{
			actor = act;
		}
		public int getAge()
		{
			return age;
		}
		public void setAge(int a)
		{
			age = a;
		}
		public String getVillain()
		{
			return villain;
		} 	
		public void setVillain(String v)
		{
			villain = v;
		}
		public void SpidermanToString()
		{
			System.out.println("Our heros' name is "+actor);
			System.out.println("His age is "+age);
			System.out.println("His enemy is the one and only "+villain);
			System.out.println("---------------------------------------");
		}


	// ---------------------------------------
	public void fight(){
		System.out.println("Spidey shoots his web at " + villain);
	}

	public void printArt(){				// Prints out Spidey!
	System.out.println("           :              ");  
    System.out.println("           ;              ");   
    System.out.println("          :               ");   
    System.out.println("          ;               ");   
    System.out.println("         /                ");   
    System.out.println("       o/                 ");   
    System.out.println("     ._/\\___,             ");    
    System.out.println("         \\                ");   
    System.out.println("         /    			  "); 
	}
}
