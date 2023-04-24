package com.code;

public class Orange extends Fruit {

	
	public Orange(String color , double weight , String name )
	{
		super(color,weight,name);
		
	}
	public void juice() {

		System.out.println(super.toString());
		System.out.println(
				"Orange juice is a liquid extract of the orange\n"
				+"tree fruit, produced by squeezing or reaming oranges\n"
				+"It comes in several different varieties");
	}
	
	
	
	
	public String taste()
	{
		return "Test : "+"Sour ";
	}
	
	
	public String toString()
	{
		return super.toString();
	}
	
	
	
}
