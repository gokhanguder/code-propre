package ex3;

import java.util.ArrayList;
import java.util.List;

public abstract class AnimalEnclosure {

    protected List<String> types = new ArrayList<>();
    protected List<String> noms = new ArrayList<>();
    protected List<String> comportements = new ArrayList<>();

    public void addAnimal(String typeAnimal, String nomAnimal, String comportement) {
        types.add(typeAnimal);
        noms.add(nomAnimal);
        comportements.add(comportement);
    }

    public void afficherListeAnimaux(){
        for (String nom: noms){
            System.out.println(nom);
        }
    }

    public int compterAnimaux(){
        return noms.size();
    }

    public abstract double calculerKgsNourritureParJour();
}
