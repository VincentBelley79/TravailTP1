package personnages;

public class Personnage {

   
    private String nom;
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

    public String getNom() {
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

    public void setNom(String nom) {
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
    // <editor-fold defaultstate="collapsed" desc="MÃ©canique de jeu">
    public void afficherInfosPersonnage() {
        System.out.println("");
        System.out.println(nom);
        System.out.println("      Attaque : " + attaqueMax);
        System.out.println("      Défense : " + defense);
        System.out.println("      Points de vie : " + pvs);
        System.out.println("      Initiative :" + ini);
        if(pvs > 0)
        {
           System.out.println("      Statut : Vivant"); 
        }
        else{
           System.out.println("      Statut : Mort"); 
        }
        
        
    }

    private int attaqueCalcul() {
        int attaque = (int)(Math.random() * attaqueMax);
        return attaque;
    }

    public void frapperPersonnage(Personnage personnageCible) {
        int forceDeFrappe = attaqueCalcul();
        int valeurDefense = personnageCible.defense;
        int dommages = forceDeFrappe - valeurDefense;
        if(dommages < 0) dommages = 0;
        personnageCible.pvs -= dommages;
        if(personnageCible.pvs < 0) personnageCible.pvs = 0;
        System.out.println("");
        System.out.println(nom + " attaque avec une puissance de : " + forceDeFrappe);
        System.out.println(personnageCible.nom + " a une défense de : " + valeurDefense);
        System.out.println("Les dommages sont donc de : " + dommages);
    }

    public void setNewInitiativeRandom() {
        ini = (int)(Math.random() * 100);
    }
    // </editor-fold>
}
