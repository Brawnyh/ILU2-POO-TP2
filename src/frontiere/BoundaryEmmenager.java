package frontiere;

import controleur.ControlEmmenager;

public class BoundaryEmmenager {
	private ControlEmmenager controlEmmenager;

	public BoundaryEmmenager(ControlEmmenager controlEmmenager) {
		this.controlEmmenager = controlEmmenager;
	}

	public void emmenager(String nomVisiteur) {
		if (controlEmmenager.isHabitant(nomVisiteur)) {
			System.out.println(
					"Mais vous êtes déjà un habitant du village !");
		} else {
			StringBuilder question = new StringBuilder();
			question.append("Êtes-vous :\n");
			question.append("1 - un druide.\n");
			question.append("2 - un gaulois.\n");
			int choixUtilisateur = -1;
			do {
				choixUtilisateur = Clavier.entrerEntier(question.toString());
				switch (choixUtilisateur) {
				case 1:
					emmenagerDruide(nomVisiteur);
					
					System.out.println("Bienvenue Druide" + nomVisiteur+"\n");
					int forceD=Clavier.entrerEntier("Quelle est votre force? \n");
					int effetPoMax=-1;
					int effetPoMin=0;
					while(effetPoMax<effetPoMin) {
						effetPoMin=Clavier.entrerEntier("Quelle est la potion la plus faible que vous produisez");
						effetPoMax=Clavier.entrerEntier("Quelle est la potion la plus forte que vous produisez");
						
						if(effetPoMax<effetPoMin) {
							System.out.println("Attention druide vous vous etes trompé entre le minimum et le maximum");
						}
					}
					controlEmmenager.ajouterDruide(nomVisiteur, forceD, effetPoMin, effetPoMax);
					break;

				case 2:
					System.out.println("Bienvenue villageois" + nomVisiteur+"\n");
					
					int forceG=Clavier.entrerEntier("Quelle est votre force? \n");
					controlEmmenager.ajouterGaulois(nomVisiteur,forceG);
					break;

				default:
					System.out
							.println("Vous devez choisir le chiffre 1 ou 2 !");
					break;
				}
			} while (choixUtilisateur != 1 && choixUtilisateur != 2);
		}
	}

	private void emmenagerDruide(String nomVisiteur) {
		//TODO a completer
	}
}
