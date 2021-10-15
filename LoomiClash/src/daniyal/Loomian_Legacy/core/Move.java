package daniyal.Loomian_Legacy.core;

import daniyal.Loomian_Legacy.battle.Effect;

public enum Move {
	
	SKIP("", MoveType.Typeless, 0, 0, 0, 0, false, null),
	
	
	POUNCE("Pounce", MoveType.Typeless, 40, 100, 15, 0, true, null);
	
	private String name;
	private MoveType type;
	
	private int power;
	private int accuracy;
	private int energyCost;
	
	private int priority;
	private boolean contact;
	
	private Effect[] effects;
	
	Move(String name, MoveType type, int power, int accuracy, int energyCost, int priority, boolean contact, Effect[] effects){
		this.name = name;
		this.type = type;
		
		this.power = power;
		this.accuracy = accuracy;
		this.energyCost = energyCost;
		
		this.priority = priority;
		this.contact = contact;
		
		this.effects = effects;
	}
	
	
	String getName() {
		return name;
	}
	
	MoveType type() {
		return type;
	}
	
	public int power() {
		return power;
	}
	
	int accuracy() {
		return accuracy;
	}
	
	public int energyCost() {
		return energyCost;
	}
	
	int priority() {
		return priority;
	}
	
	boolean contact() {
		return contact;
	}
	
	Effect[] effects() {
		return effects;
	}
	
	
	
}
