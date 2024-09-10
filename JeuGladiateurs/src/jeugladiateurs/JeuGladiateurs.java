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
    Personnage Bob = new Personnage("Bob le malchanceux", 70,15,15,15);
    Personnage Igor = new Personnage("Igor l'empaleur", 100, 25, 5 , 30);
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Affichage pr�-combat">
    // TODO : Afficher les infos de chaque personnage
    // TODO : Afficher le message du d�but du combat
    // </editor-fold>
   Bob.afficherInfosPersonnage();
   Igor.afficherInfosPersonnage();
   affichage.afficherDebutCombat();
   
   
    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="M�canique de combat">
    // TODO : La boucle contenant les �tapes du combat
    // TODO : Apr�s la boucle, afficher le r�sultat du combat
    // </editor-fold>
    }

}
