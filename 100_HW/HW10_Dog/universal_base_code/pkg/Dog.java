package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
		int age;
		String name;
		String breed;
		boolean sleep;
		double SleepChance;
	public Dog() {
		age = 1;
		name = "Clifford";
		breed = "Big red dog";
		
	}
	public Dog(int a, String n, String b){
		age = a;
		name = n;
		breed = b;
		
	}
	public void name(String n)
	{
		name = n;
		age = 1;
		breed = "dog dog";
	}
	public void NameBreed(String n, String b)
	{
		name = n;
		age = 1;
		breed = b;
	}
	public void NameAge(String n, int a)
	{
		name = n;
		age = a;
		breed = "dog dog";
	}
	public void setName(String n)
	{
		name = n;
	}
	public String getName()
	{
		return name;
	}
	public void setAge(int a)
	{
		age = a;
	}
	public int getAge()
	{
		return age;
	}
	public void setBreed(String b)
	{
		breed = b;
	}
	public String getBreed()
	{
		return breed;
	}
	public boolean isSleeping()
	{
		int SleepChance = (int)((Math.random()*100));
		if (SleepChance >=50)
		{
			return sleep = true;
		}
		else if (SleepChance <= 49)
		{
			return sleep = false;
		}
		else 
		{
			return false;
		}
	}
	public void bark(String n)
	{
		name = n;
		System.out.println(name+" barks! Woof Woof!");
	}
	public void DogToString()
	{
		System.out.println(name+" is "+age+" years old, and is a "+breed);
	}
}
