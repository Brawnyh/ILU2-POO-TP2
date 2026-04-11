package frontiere;

import controleur.ControlAcheterProduit;

public class BoundaryAcheterProduit {
	private ControlAcheterProduit controlAcheterProduit;

	public BoundaryAcheterProduit(ControlAcheterProduit controlAcheterProduit) {
		this.controlAcheterProduit = controlAcheterProduit;
	}

	public void acheterProduit(String nomAcheteur) {
	    String produit = Clavier.entrerChaine("Quel produit souhaitez-vous acheter ?");
	    String[] vendeurs = controlAcheterProduit.trouverVendeursProduit(produit);
	    if (vendeurs == null || vendeurs.length == 0) {
	        System.out.println("Désolé, personne ne vend ce produit au marché.");
	        return;
	    }
	    System.out.println("Les vendeurs proposant " + produit + " sont :");
	    for (int i = 0; i < vendeurs.length; i++) {
	        System.out.println((i + 1) + " - " + vendeurs[i]);
	    }
	    int choix = Clavier.entrerEntier("Choisissez un vendeur (numéro) :") - 1;
	    if (choix < 0 || choix >= vendeurs.length) {
	        System.out.println("Choix invalide.");
	        return;
	    }
	    int quantite = Clavier.entrerEntier("Combien souhaitez-vous en acheter ?");
	    int quantiteAchetee = controlAcheterProduit.acheterProduit(vendeurs[choix], quantite);
	    System.out.println("Vous avez acheté " + quantiteAchetee + " " + produit
	        + " chez " + vendeurs[choix] + ".");
	}
}
