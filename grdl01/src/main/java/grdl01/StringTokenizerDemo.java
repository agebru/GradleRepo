package grdl01;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		String message="Hello Every Body. How are you Today";
		StringTokenizer str1=new StringTokenizer(message," ");
		
		while(str1.hasMoreTokens()) {
			System.out.print(str1.nextToken()+" ");
		}
	       System.out.println("Total Tokens:"+	str1.countTokens());
	       
	       
	       
	       char ch='Q';
	       
	       List<Passanger[]> passangersArray=new ArrayList<>();
	       passangersArray.add(new Passanger[] {new Passanger(300,"Belay"),new Passanger(301,"Dori")});
	       passangersArray.add(new Passanger[] {new Passanger(400,"Hagos"),new Passanger(401,"Melaku")});
	       passangersArray.add(new Passanger().getPassangers());
	       
	       List<Passanger> passangers=new ArrayList<>();
	          List<String>names=new ArrayList<>();
	       
	       for(Passanger[] psgrs:passangersArray) {
	    	   for(Passanger p:psgrs) {
	    		   passangers.add(p)  ; 
	    		   names.add(p.getPassangerName());
	    	   }
	    	   
	       }
	       
	       System.out.println(passangers.toString());
	    // passangers.stream().forEach(System.out::println);
	      
	      names.stream().forEach(System.out::println);
	       
	       
	  
	}
	
	

}
