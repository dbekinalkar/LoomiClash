package daniyal.Loomian_Legacy.core;

public enum MoveType {
	
	Typeless(new String[]{}, 									
			new String[]{"Metal"}, 								
			new String[]{}),
	Fire(	new String[]{"Plant", "Ice", "Dark", "Metal"}, 		
			new String[]{"Fire", "Water", "Light", "Ancient"}, 	
			new String[]{}),
	Water(	new String[]{"Fire", "Earth", "Electric"}, 			
			new String[]{"Water", "Plant", "Ancient"}, 			
			new String[]{}),
	Plant(	new String[]{"Water", "Earth"}, 					
			new String[]{"Fire", "Plant", "Toxic", "Ancient"}, 	
			new String[]{}),
	Earth(	new String[]{"Fire", "Electric", "Metal", "Toxic"}, 
			new String[]{"Plant", "Bug"}, 						
			new String[]{"Air"}),
	Electric(new String[]{"Water", "Metal", "Air"}, 			
			new String[]{"Plant", "Electric", "Ancient"}, 		
			new	String[]{"Earth"}),
	Ice(	new String[]{"Plant", "Earth", "Bug", "Air"}, 		
			new String[]{"Fire", "Water", "Ice", "Brawler"}, 	
			new String[]{}),
	Light(	new String[]{"Dark", "Spirit", "Ancient"}, 
			new String[]{"Plant", "Light", "Mind"}, 
			new String[]{}),
	Dark(	new String[]{"Plant", "Light", "Mind"}, 
			new String[]{"Dark", "Bug", "Spirit"}, 
			new String[]{}),
	Bug(	new String[]{"Plant", "Dark", "Mind"}, 
			new String[]{"Fire", "Metal", "Air", "Brawler"}, 
			new String[]{}),
	Metal(	new String[]{"Ice", "Light", "Ancient"}, 
			new String[]{"Fire", "Water", "Electric", "Metal"}, 
			new String[]{}),
	Air(	new String[]{"Fire", "Bug", "Brawler"}, 
			new String[]{"Electric", "Ice", "Metal"}, 
			new String[]{}),
	Toxic(	new String[]{"Water", "Plant"}, 
			new String[]{"Earth", "Toxic", "Spirit"}, 
			new String[]{}),
	Mind(	new String[]{"Typeless", "Toxic", "Brawler"}, 
			new String[]{"Dark", "Mind"}, 
			new String[]{}),
	Spirit(	new String[]{"Mind", "Spirit", "Brawler"}, 
			new String[]{"Dark", "Ancient"}, 
			new String[]{"Light"}),
	Brawler(new String[]{"Ice", "Bug"}, 
			new String[]{"Air", "Toxic"}, 
			new String[]{"Spirit"}),
	Ancient(new String[]{"Spirit", "Ancient"}, 
			new String[]{"Light", "Metal"},
			new String[]{});
	
	
	
	String[] SUPER_EFFECTIVE, NOT_EFFECTIVE, NO_EFFECT;
	
	MoveType(String[] Super, String[] Not, String[] No){
		SUPER_EFFECTIVE = Super;
		NOT_EFFECTIVE = Not;
		NO_EFFECT = No;
	}
	
	double getEffectiveness(String t) {
		for(String type : SUPER_EFFECTIVE) {
			if(t.equalsIgnoreCase(type)) return 2;
		}
		for(String type : NOT_EFFECTIVE) {
			if(t.equalsIgnoreCase(type)) return 0.5;
		}
		for(String type : NO_EFFECT) {
			if(t.equalsIgnoreCase(type)) return 0;
		}
		return 1;
	}
	
	
}
