package jeugladiateurs;

import personnages.Personnage;
import combat.CompteurDeTour;
import combat.AffichageEcran;

public class JeuGladiateurs {

    public static void main(String[] args) {

        // **************************************************************************
        // **************************************************************************
        // **************************************************************************
        // <editor-fold defaultstate="expanded" desc="Instanciation des objets">
        CompteurDeTour tour = new CompteurDeTour();
        AffichageEcran affichage = new AffichageEcran();
        Personnage Bob = new Personnage("Bob le malchanceux", 70, 15, 15, 15);
        Personnage Igor = new Personnage("Igor l'empaleur", 100, 25, 5, 30);
        // </editor-fold>

        // **************************************************************************
        // **************************************************************************
        // **************************************************************************
        // <editor-fold defaultstate="collapsed" desc="Affichage pr�-combat">
        // TODO : Afficher les infos de chaque personnage
        // TODO : Afficher le message du d�but du combat
        affichage.afficherDebutCombat();
        // </editor-fold>

        // **************************************************************************
        // **************************************************************************
        // **************************************************************************
        // <editor-fold defaultstate="collapsed" desc="M�canique de combat">
        // TODO : La boucle contenant les �tapes du combat
        do {
            tour.afficheTour();

            affichage.afficherDebutCombat();

            for (int i = 0; i <= 100; i++) {
                if (i == Bob.getIni()) {
                    Bob.frapperPersonnage(Igor);
                }
                if (i == Igor.getIni()) {
                    Igor.frapperPersonnage(Bob);
                }
            }
            affichage.afficherSeparateurInfosPerso();

            Bob.afficherInfosPersonnage();
            Igor.afficherInfosPersonnage();

            Bob.setNewInitiativeRandom();
            Igor.setNewInitiativeRandom();

            tour.augmenteTour();

            affichage.afficherSeparateurDeTour();
        } while (Bob.getPvs() > 0 && Igor.getPvs() > 0);
        affichage.afficheVictoire(Igor, Bob);
        // TODO : Apr�s la boucle, afficher le r�sultat du combat
        // </editor-fold>
    }

}
