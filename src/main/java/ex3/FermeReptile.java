package ex3;

public class FermeReptile extends AnimalEnclosure {

	@Override
	public double calculerKgsNourritureParJour(){
		return compterAnimaux() * 0.1;
	}
}
