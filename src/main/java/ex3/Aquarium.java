package ex3;

public class Aquarium extends AnimalEnclosure {

	@Override
	public double calculerKgsNourritureParJour(){
		return compterAnimaux() * 0.2;
	}
}
