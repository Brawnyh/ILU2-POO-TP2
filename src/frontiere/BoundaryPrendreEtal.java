package frontiere;

import controleur.ControlPrendreEtal;

public class BoundaryPrendreEtal {
	private ControlPrendreEtal controlPrendreEtal;

	public BoundaryPrendreEtal(ControlPrendreEtal controlChercherEtal) {
		this.controlPrendreEtal = controlChercherEtal;
	}

	public void prendreEtal(String nomVendeur) {
		//TODO a completer
		boolean nomVendeurConnu=controlPrendreEtal.verifierIdentite(nomVendeur);
		if (!nomVendeurConnu){
			System.out.println("Je suis désolée "+nomVendeur+" mais il faut êtr eun habitant de notre village pour commercer ici");
			
		}else {
			System.out.println("Bonjour "+nomVendeur+ " je vaiss regarder si je peux vous trouver une étale");
			boolean etalDisponible=controlPrendreEtal.resteEtals();
			if (!etalDisponible) {
				System.out.println("Désolée "+nomVendeur+" je n'ai plus d'étal qui ne soit pas deja occupé");
				
			}else {
				
				StringBuilder question = new StringBuilder();
				
				question.append("c'est parfait il me reste une étal pour vous! \n");
				question.append("il me faudrait quelques renseignements : \n");
				
				String produit=Clavier.entrerChaine("Quel produit souhaiteé vous vendre?\n");
				int nbProduit= Clavier.entrerEntier("Combien souhaitez-vous en vendre?\n");
				
				installerVendeur(nomVendeur);
				controlPrendreEtal.prendreEtal(nomVendeur,produit, nbProduit);
				
				
			}
		}
	}

	private void installerVendeur(String nomVendeur) {
		
	}
}
