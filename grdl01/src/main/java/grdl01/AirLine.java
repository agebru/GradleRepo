package grdl01;

import java.util.ArrayList;
import java.util.List;

public class AirLine {
	private String name;
	private List<String> partners;

	public AirLine(String[] airLinesArray) {
		name = airLinesArray[0];
		partners = new ArrayList<>();

		for (int i = 1; i < airLinesArray.length; i++) {
			partners.add(airLinesArray[i]);
		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getPartners() {
		 return partners.toArray(new String[partners.size()]);
	}

	public void setPartners(List<String> partners) {
		this.partners = partners;
	}
	
	 public String toString(){
         return name + "==> partners: " + partners;
     }
	
	
	
	
	

}
