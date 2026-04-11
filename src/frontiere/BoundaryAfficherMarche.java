package frontiere;

import controleur.ControlAfficherMarche;

public class BoundaryAfficherMarche {
	private ControlAfficherMarche controlAfficherMarche;

	public BoundaryAfficherMarche(ControlAfficherMarche controlAfficherMarche) {
		this.controlAfficherMarche = controlAfficherMarche;
	}

	public void afficherMarche(String nomAcheteur) {
	    String[] etat = controlAfficherMarche.donnerEtatMarche();
	    if (etat == null || etat.length == 0) {
	        System.out.println("Le marché est vide, aucun étal n'est occupé.");
	        return;
	    }
	    System.out.println("Voici les étals disponibles au marché :");
	    for (int i = 0; i < etat.length; i += 3) {
	        System.out.println("- " + etat[i] + " vend " + etat[i+2]
	            + " (" + etat[i+1] + " restants)");
	    }
	}
}
