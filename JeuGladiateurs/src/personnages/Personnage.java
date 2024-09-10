package personnages;

public class Personnage {

   
    private string nom;
    private int pvs;
    private int attaqueMax;
    private int ini;
    private int defense;

    
    public Personnage(String nom, int pvs, int attaqueMax ,int defense, int ini) {
        this.nom = nom;
        this.attaqueMax = attaqueMax;
        this.defense = defense;
        this.ini = ini;
        this.pvs = pvs;
    }

    public Personnage() {
        nom = "";
        attaqueMax = 0;
        defense = 0;
        ini = 0;
        pvs = 0;
    }

    public string getNom() {
        return nom;
    }

    public int getPvs() {
        return pvs;
    }

    public int getAttaqueMax() {
        return attaqueMax;
    }

    public int getIni() {
        return ini;
    }

    public int getDefense() {
        return defense;
    }

    public void setNom(string nom) {
        this.nom = nom;
    }

    public void setPvs(int pvs) {
        this.pvs = pvs;
    }

    public void setAttaqueMax(int attaqueMax) {
        this.attaqueMax = attaqueMax;
    }

    public void setIni(int ini) {
        this.ini = ini;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
    

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Mécanique de jeu">
    public void afficherInfosPersonnage() {
        // TODO : Afficher les infos du personnage, tel que montré dans l'énoncé
    }

    private int attaqueCalcul() {
        // TODO : Retourner la valeur de l'attaque du personnage.
        // Cette valeur est trouvée aléatoirement et doit se situer entre ZÉRO et valeurMaxAttaque.
        return 0;
    }

    public void frapperPersonnage(Personnage personnageCible) {
        // TODO : Récupérer la valeur d'attaque pour ce tour, calculer les dégats,
        //modifier les points de vie du personnage cible, afficher les détails
        // sur l'attaque, tel que montré dans l'énoncé.
    }

    public void setNewInitiativeRandom() {
        // TODO : Modifier de façon aléatoire la valeur INI du personnage.
    }
    // </editor-fold>
}
