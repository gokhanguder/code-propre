package ex3;

public class ZoneCarnivore extends AnimalEnclosure {

	@Override
	public double calculerKgsNourritureParJour(){
		return compterAnimaux() * 10.0;
	}
}
