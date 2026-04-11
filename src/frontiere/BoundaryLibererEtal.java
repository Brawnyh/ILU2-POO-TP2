package frontiere;

import controleur.ControlLibererEtal;

public class BoundaryLibererEtal {
	private ControlLibererEtal controlLibererEtal;

	public BoundaryLibererEtal(ControlLibererEtal controlLibererEtal) {
		this.controlLibererEtal = controlLibererEtal;
	}

	public void libererEtal(String nomVendeur) {
	    String[] donneesEtal = controlLibererEtal.libererEtal(nomVendeur);
	    if (donneesEtal == null) {
	        System.out.println("Désolé " + nomVendeur + ", vous n'avez pas d'étal occupé.");
	    } else {
	        System.out.println("L'étal de " + donneesEtal[1] + " vendant " + donneesEtal[2]
	            + " a été libéré.");
	        System.out.println("Vous avez vendu " + donneesEtal[4] + " sur "
	            + donneesEtal[3] + " " + donneesEtal[2] + ".");
	    }
	}
}
