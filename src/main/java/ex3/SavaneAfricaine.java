package ex3;

public class SavaneAfricaine extends AnimalEnclosure {

	@Override
	public double calculerKgsNourritureParJour(){
		return compterAnimaux() * 10.0;
	}
}
