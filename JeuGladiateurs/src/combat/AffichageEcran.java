package combat;

import personnages.Personnage;

public class AffichageEcran {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Méthodes d'affichage">
    public void afficherDebutCombat() {
        System.out.println(""); 
        System.out.println("<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>"); 
        System.out.println(">>>>>>>> Que le combat commence! <<<<<<<<<"); 
        System.out.println("<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>"); 
        System.out.println(""); 
    }
    
    public void afficherSeparateurDeTour() {
        System.out.println(""); 
        System.out.println("**************************************"); 
    }

    public void afficherSeparateurInfosPerso() {
        System.out.println(""); 
        System.out.println("---------------------"); 
        System.out.println("  INFOS PERSONNAGES"); 
        System.out.println("---------------------"); 
    }

    public void afficheVictoire(Personnage personnage1, Personnage personnage2) {
        String gagnant = "personne";
        if(personnage1.getPvs() > 0)
        {
           gagnant = personnage1.getNom(); 
        }
        if(personnage2.getPvs() > 0)
        {
           gagnant = personnage2.getNom(); 
        }
        System.out.println(""); 
        System.out.println(gagnant + " gagne le combat !!!"); 
        System.out.println(""); 
    }
    // </editor-fold>
}
