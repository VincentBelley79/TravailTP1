/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personnages;

/**
 *
 * @author 202331873
 */
public class Mirmillon extends Personnage{

    public Mirmillon(String nom, int pvs, int attaqueMax, int defense, int ini) {
        super(nom, pvs, attaqueMax, defense, ini);
    }
    String classe = "Mirmillon";

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
    @Override
    public void setNewInitiativeRandom() {
        setIni((int) (Math.random() * 30));
    }
    @Override
    public void frapperPersonnage(Personnage personnageCible) {
    super.frapperPersonnage(personnageCible);
    if(personnageCible.getPvs() <= 0 )
    {
        System.out.println( getNom() + " décapite " + personnageCible.getNom() );
    }
    else
    {
        super.frapperPersonnage(personnageCible);
    }
    }
}
