package grdl01;

import java.util.ArrayList;
import java.util.List;

public class PassangerRepository {
	private static List<Passanger> passangers;

	static {
		passangers = new ArrayList<>();

		Passanger p1 = new Passanger(12, "Jackson");
		Passanger p2 = new Passanger(13, "Doe");
		Passanger p3 = new Passanger(14, "Merry");
		Passanger p4 = new Passanger(15, "Selam");
		Passanger p5 = new Passanger(21, "Emebet");

		passangers.add(p1);
		passangers.add(p2);
		passangers.add(p3);
		passangers.add(p4);
		passangers.add(p5);
	}

	public static List<Passanger> getPassangers() {
		return passangers;
	}

	public static void addPassanger(Passanger p) {
		passangers.add(p);

		printPassangers();
	}

	private static void printPassangers() {
		passangers.stream().forEach(System.out::println);

	}

	public static Passanger findPassanger(int passId)  {

		return passangers.stream()				
				.filter(ps -> ps.getPassangerid() == passId).findFirst().get();
	}

	public static void deletePassanger(int passId) {
		passangers.removeIf(ps -> ps.getPassangerid() == passId);
		printPassangers();
	}

}
