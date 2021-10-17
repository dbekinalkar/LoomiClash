package daniyal.Loomian_Legacy.core;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class LoomianDB {
	private static LoomianDB obj;
	
	private LoomianDB() {instantiate();};
	
	public static LoomianDB loomipedia() {
		if(obj == null) {
			obj = new LoomianDB();
		}
		return obj;
	}
	
	private void instantiate() {
		
		Loomipedia = new ArrayList<Species>();
		
		File db = new File("Loomian Full Info Chart.txt");
		
		Scanner file;
		
		try {
			file = new Scanner(db);
			file.nextLine();
			while(file.hasNextLine()) {
				Loomipedia.add( new Species(file.nextLine().split(",")));
			}
			
			file.close();
		}
		catch(Exception e) {
			System.out.print(e);
		}
		
		
	}
	
	private ArrayList<Species> Loomipedia;
	
	public Species search(String name){
		for(int i = 0; i < Loomipedia.size(); i++) {
			if(Loomipedia.get(i).name().equalsIgnoreCase(name)) {
				return Loomipedia.get(i);
			}
		}
		
		return null;
	}
	
	public void dataTest() { //Test code, can be deleted
		for(int i = 0; i < Loomipedia.size(); i++) {
			System.out.println(Loomipedia.get(i).info());
		}
	}
	
}
