package daniyal.Loomian_Legacy.core;

import java.util.Arrays;

public class Loomian {
	private Species loomian;
	
	String nickName;
	
	private Move[] moves;
	
	int level;
	
	Stats UP;
	Stats TP;
	
	
	Stats total;
	
	public int cHealth;
	public int cEnergy;
	String status;
	public boolean fainted;
	
	
	public Loomian(String data) {
		String[] newLoomian = data.split("\n");
		loomian = LoomianDB.loomipedia().search(newLoomian[0]);
		
		nickName = loomian.name();
		
		moves = new Move[] {Move.valueOf(newLoomian[1].toUpperCase())};
		
		level = 100;
		
		UP = new Stats();
		TP = new Stats();
		
		total = new Stats(new int[]{healthCalc(), energyCalc(), statCalc("mAtk"), statCalc("mDef"), statCalc("rAtk"), statCalc("rDef"), statCalc("speed")});
		
		cHealth = getTotal().getHealth();
		cEnergy = getTotal().getEnergy();
		status = "";
		fainted = false;
		
	}
	
	
	public Species loomian(){
		return loomian;
	}
	
	public Move[] getMoves() {
		return Arrays.copyOf(moves, moves.length);
	}
	
	public int healthCalc() {
		return ((2*loomian.baseStats().getHealth() + UP.getHealth() + (TP.getHealth()/4)) * getLevel()/100) + getLevel() + 10;
	}
	
	public int energyCalc() {
		return ((2*loomian.baseStats().getEnergy() + UP.getEnergy() + (TP.getEnergy()/4)) * getLevel()/65) + 80;
	}
	
	public int statCalc(String statName) {
		return ((2*loomian.baseStats().get(statName) + UP.get(statName) + (TP.get(statName)/4)) * getLevel()/100) + 5;
	}


	public int getLevel() {
		return level;
	}


	public Stats getTotal() {
		return total;
	}


	public String getNickName() {
		return nickName;
	}
	
	
}
