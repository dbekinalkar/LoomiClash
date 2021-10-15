package daniyal.Loomian_Legacy.core;

import java.util.Arrays;

public class Species {
	int ID;
	private String name;
	
	private String type1;
	private String type2;
	
	private Stats baseStats;
	
	private String rAbility1;
	private String rAbility2;
	private String sAbility;
	
	private double height;
	private double weight;
	
	private String[] moveset;
	
	public Species(String[] info) {
			ID = Integer.parseInt(info[0]);
			name = info[1];
			
			type1 = info[2];
			type2 = info[3];
			
			baseStats = new Stats(Arrays.copyOfRange(info, 4, 11));
			
			rAbility1 = info[12];
			rAbility2 = info[13];
			sAbility = info[14];
			
			height = Double.parseDouble(info[17]);
			weight = Double.parseDouble(info[18]);
			
		}
	
	public String info() {
		return ID + "," + name + "," + type1 + "," + type2 + "," + baseStats.dataTest() + ","
				+ rAbility1 + "," + rAbility2 + "," + sAbility + "," + height + "," + weight;
	}

	public String name() {
		// TODO Auto-generated method stub
		return name;
	}
	
	public Stats baseStats() {
		return baseStats;
	}
	
}