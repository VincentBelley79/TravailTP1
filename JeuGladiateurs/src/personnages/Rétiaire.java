/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personnages;

/**
 *
 * @author 202331873
 */
public class Rétiaire extends Personnage{

    public Rétiaire(String nom, int pvs, int attaqueMax, int defense, int ini) {
        super(nom, pvs, attaqueMax, defense, ini);
    }
    String classe = "Rétiaire";
    boolean filet = true;

    public boolean isFilet() {
        return filet;
    }

    public void setFilet(boolean filet) {
        this.filet = filet;
    }
    
    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
    @Override
    public void frapperPersonnage(Personnage personnageCible) {
        if(filet == true)
        {
            System.out.println("");
        }
        
    }
}
