package com.krista.pets.models;

public class Animal implements Pet{
	private String name;
	private String breed;
	private String weight;
	
	public Animal(){
	}

	public Animal(String name, String breed, String weight){
		this.name = name;
		this.breed = breed;
		this.weight = weight;
		
	}

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getBreed() {
		return breed;
	}


	public void setBreed(String breed) {
		this.breed = breed;
	}


	public String getWeight() {
		return weight;
	}


	public void setWeight(String weight) {
		this.weight = weight;
	}
	
	public String showAffection(){
			
		int weight = Integer.parseInt(getWeight()); 
		String animal = getBreed();
		String action = "test";
				
		if( animal.equals("cat") || animal.equals("Cat")){
			action = "Your cat looked lovingly at you";
			return action;
		}
		else if(animal.equals("dog") ||animal.equals("Dog")){
			if(weight < 30){
				action = "Your dog hopped into your lap";
				return action;
			}
			else{
				action = "Your dog curled up next to you";
				return action;
			}
		}
		return action;
	}
}

