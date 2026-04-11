package controleur;

import personnages.Gaulois;
import villagegaulois.Etal;
import villagegaulois.Village;

public class ControlAcheterProduit {
	private Village village;
	private ControlTrouverEtalVendeur controlTrouverEtalVendeur;
	private ControlVerifierIdentite controlVerifierIdentite;

	public ControlAcheterProduit(ControlVerifierIdentite controlVerifierIdentite,
			ControlTrouverEtalVendeur controlTrouverEtalVendeur,
			Village village) {
		this.village = village;
		this.controlVerifierIdentite = controlVerifierIdentite;
		this.controlTrouverEtalVendeur = controlTrouverEtalVendeur;
	}

	public boolean verifierIdentite(String nomAcheteur) {
	    return controlVerifierIdentite.verifierIdentite(nomAcheteur);
	}

	public String[] trouverVendeursProduit(String produit) {
	    Gaulois[] vendeurs = village.rechercherVendeursProduit(produit);
	    if (vendeurs == null) return null;
	    String[] noms = new String[vendeurs.length];
	    for (int i = 0; i < vendeurs.length; i++) {
	        noms[i] = vendeurs[i].getNom();
	    }
	    return noms;
	}

	public int acheterProduit(String nomVendeur, int quantite) {
	    Etal etal = controlTrouverEtalVendeur.trouverEtalVendeur(nomVendeur);
	    if (etal == null) return 0;
	    return etal.acheterProduit(quantite);
	}
}
