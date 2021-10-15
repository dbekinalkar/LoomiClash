package daniyal.Loomian_Legacy.core;

public class Stats {	
	
	private int health;
	private int energy;
	private int mAtk;
	private int mDef;
	private int rAtk;
	private int rDef;
	private int speed;
	
	public Stats() {
		health = 0;
		energy = 0;
		mAtk = 0;
		mDef = 0;
		rAtk = 0;
		rDef = 0;
		speed = 0;
	}
	
	public Stats(int[] array) {
		health = array[0];
		energy = array[1];
		mAtk = array[2];
		mDef = array[3];
		rAtk = array[4];
		rDef = array[5];
		speed = array[6];
	}
	
	public Stats(String[] array) {
		int[] intArray = new int[array.length];
		for(int i = 0; i < array.length; i++) {
			intArray[i] = Integer.parseInt(array[i]);
		}
		
		health = intArray[0];
		energy = intArray[1];
		mAtk = intArray[2];
		mDef = intArray[3];
		rAtk = intArray[4];
		rDef = intArray[5];
		speed = intArray[6];
	}
	
	public String dataTest() {//test, can be deleted/commented out after
		return getHealth() + "," + getEnergy() + "," + mAtk + "," + mDef + "," + rAtk + "," + rDef + "," + speed;
	}

	public int getHealth() {
		return health;
	}

	public int getEnergy() {
		return energy;
	}
	
	public int get(String name) {
		switch(name) {
		case "health":
			return health;
		case "energy":
			return energy;
		case "mAtk":
			return mAtk;
		case "mDef":
			return mDef;
		case "rAtk":
			return rAtk;
		case "rDef":
			return rDef;
		case "speed":
			return speed;
		}
		return -1;
	}
	
	
	
}
