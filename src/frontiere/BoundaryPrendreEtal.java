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
			if (!etalDisponible)
		}
	}

	private void installerVendeur(String nomVendeur) {
		//TODO a completer
	}
}
