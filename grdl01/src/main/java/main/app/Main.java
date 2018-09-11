package main.app;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import grdl01.Passanger;

public class Main {
	
	private static List<String> names=new ArrayList<>();
	static {
		names.add("Abebe");
		names.add("Belay");
		names.add("Amete");
		names.add("Hagos");
	}

	public static void main(String[] args) {
		//testing Optional in Java 8
		
		//find names that start with K
		List<String>  knames=names.stream().filter(nm->nm.startsWith("A")).collect(Collectors.toList());
		
		// find someOne named: Berihu
		
		Optional<String> berihu=names.stream().filter(nm->nm.equals("Berihu")).findFirst();
		
		if(berihu.isPresent()) {
			System.out.println(berihu.get().toUpperCase());
		}
		else{
			System.out.println("Berihu doesn't Exist");
		}
		
		/*String berihu2=names.stream().filter(nm->nm.equals("Berihu")).findFirst().get();
		System.out.println(berihu2.getBytes());*/
		
		
		
		System.out.print(knames.size());		
		
	       for(String s:knames){	    	   	    	   
	    	   System.out.println(s.toUpperCase());
	       }
		
	       
	       // comparing Passanger Objects
	       
	       
	       System.out.println("Comparing Two passangers.....");
	       Passanger psgr1=new Passanger(201,"Jack");
	       Passanger psgr2=new Passanger(201,"Jack");
	       
	       
	       System.out.println(psgr1.equals(psgr2));
	       System.out.println(psgr1==psgr2);//false bcz every new() is a reference to a new memory address
	       
	       System.out.println("Passanger1: "+psgr1.hashCode());
	       System.out.println("Passanger2: "+psgr2.hashCode());
	       
	       Set<Passanger> passangerSet=new HashSet<>();		
	       passangerSet.add(psgr1);
	       passangerSet.add(psgr2);
	       System.out.println(passangerSet.size());
	       
	       for(Passanger p:passangerSet) {
	    	   if(p!=null) {
	    		   System.out.println(p);
	    	   }
	       }
	       
		
		
		
		

	}

}
