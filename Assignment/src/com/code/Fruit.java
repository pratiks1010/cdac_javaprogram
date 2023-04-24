package com.code;

public class Fruit {

	private String color;
	private double weight;
	private String name;
	
	public Fruit(String name , double weight , String color)
	{
		this.color=color;
		this.weight=weight;
		this.name=name;
		
	}
	
//	public String taste()
//	{
//		return
//	}
//	
	
	public String toString()
	{
		return "Name : "+" "+this.name+"\n"+"Weight :"+" "+this.weight+" g" +"\n"+"Color :"+" "+this.color;
	}
	
}
