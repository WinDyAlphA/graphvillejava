import java.util.*;

class Sommet {
	private char typeN = 'V';
    private String nom = "default";
    public static int nbreInstances = 0;
    public static int nbreInstancesV = 0;
    public static int nbreInstancesL = 0;
    public static int nbreInstancesR = 0;
    public int compteur;
    public ArrayList < Routes > voisin = new ArrayList < Routes > ();

	public Sommet (char typeN , String nom) {
        this.typeN = typeN;
        this.nom = nom;
        if (typeN == 'V'){ //compte le nb de ville 
            nbreInstancesV++;
        }
        if (typeN == 'L'){ //compte le nb de loisirs
            nbreInstancesL++;
        }
        if (typeN == 'R'){ //compte le nb de resteaurants
            nbreInstancesR++;
        }
        this.compteur = nbreInstances;
        nbreInstances++;
	}

    public char getTypeN() {
        return this.typeN;
    }
    public String getNom() {
        return this.nom;
    }
    public int getCompteur(){
        return this.compteur;
    }
    public int getNbreInstances() {
        return this.nbreInstances;
    }
    public int getNbreInstancesV() {
        return this.nbreInstancesV;
    }
    public int getNbreInstancesR() {
        return this.nbreInstancesR;
    }
    public int getNbreInstancesL() {
        return this.nbreInstancesL;
    }

    public void setTypeN(char typeN) {  
         this.typeN = typeN ;  
    }
    public void setNom(String nom) {  
         this.nom = nom ;  
    }

    public String toString() {
    	return " : Type : " + this.typeN +
        "\n : nom : " + this.nom;
	}

}