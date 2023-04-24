package com.code;

public class Mango extends Fruit {

	
	
	
	public Mango(String color , double weight , String name )
	{
		super(color,weight,name);
		
	}
	
	public void pulp() {

		System.out.println(super.toString());
		System.out.println(
				"Our mango pulp is derived from fresh mangoes\n"
				+"It can be used to prepare delectable syrups \n"
				+"juice and other items."
				+"The mango pulp we export has a sweet taste ..");
	}
	
	
	public String taste()
	{
		return "Test : "+"Sweeat";
	}
	
	
	public String toString()
	{
		return super.toString();
	}
	
	
}
