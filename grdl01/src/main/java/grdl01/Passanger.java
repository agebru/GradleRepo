package grdl01;
import java.util.Date;

public class Passanger {
	private int passangerid;
	private String passangerName;

	
	
	public Passanger() {
		
	}
	
	public Passanger(int passangerid, String passangerName) {	
		this.passangerid = passangerid;
		this.passangerName = passangerName;
	}

	public int getPassangerid() {
		return passangerid;		
	}

	public void setPassangerid(int passangerid) {
		this.passangerid = passangerid;
	}

	public String getPassangerName() {
		return passangerName;
	}

	// CTRL+ALT+H ==> to know where these method was called from
	// CTRL+SHIFT+P==> to go to end/start of a block
	public void setPassangerName(String passangerName) {
		this.passangerName = passangerName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((passangerName == null) ? 0 : passangerName.hashCode());
		result = prime * result + passangerid;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Passanger other = (Passanger) obj;
		if (passangerName == null) {
			if (other.passangerName != null)
				return false;
		} else if (!passangerName.equals(other.passangerName))
			return false;
		if (passangerid != other.passangerid)
			return false;
		return true;
	}
	
	public Passanger[] getPassangers() {
		//Passanger[] passangers=new Passanger[5];
		Passanger[] passangers= {
				new Passanger(201,"Jack"),
				new Passanger(203,"Doi"),
				new Passanger(204,"Diana"),
				new Passanger(205,"Selam"),
				new Passanger(206,"Dagem"),
				
				
		};
		
		
		return passangers;
	}
	
	

	@Override
	public String toString() {
		System.out.println(new Date().toString());
		return "Passanger [passangerid=" + passangerid + ", passangerName=" + passangerName + "]";
	}
	
}






