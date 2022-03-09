import java.util.*;

class Routes {
	private char typeN = 'V';
	private Sommet som1;
    private Sommet som2;
	private int distance;
    public static int nbreInstances = 0;
    public static int nbreInstancesA = 0;
    public static int nbreInstancesD = 0;
    public static int nbreInstancesN = 0;


	public Routes (char typeN , Sommet som1, Sommet som2, int distance) {
        this.typeN = typeN;
        this.som1 = som1;
        this.som2 = som2;
        this.distance = distance;
        nbreInstances++;
        if (typeN == 'A'){ //compte le nb d'autoroute
            nbreInstancesA++;
        }
        if (typeN == 'D'){ //compte le nb de departementales
            nbreInstancesD++;
        }
        if (typeN == 'N'){ //compte le nb de nationales
            nbreInstancesN++;
        }
	}

    public char getTypeN() {
        return this.typeN;
    }
    public Sommet getSom1() {
        return this.som1;
    }
    public Sommet getSom2() {
        return this.som2;
    }
    public int getDistance() {
        return this.distance;
    }
    
    public int getNbreInstances() {
        return this.nbreInstances;
    }
    public int getNbreInstancesA() {
        return this.nbreInstancesA;
    }
    public int getNbreInstancesD() {
        return this.nbreInstancesD;
    }
    public int getNbreInstancesN() {
        return this.nbreInstancesN;
    }

    public void setTypeN(char typeN) {  
         this.typeN = typeN ;  
    }
    public void setsom1(Sommet som1) {  
         this.som1 = som1 ;  
    }
    public void setsom2(Sommet som2) {  
         this.som2 = som2 ;  
    }
    public  void setDistance(int distance) {  
         this.distance = distance ;  
    }

    public String toString() {
    	return " : Type : " + this.typeN +
        "\n : Sommet 1 : \n\t" + this.som1.getNom() +
        "\n : Sommet 2 : \n\t" + this.som2.getNom() +
        "\n : distance : " + this.distance;
	}
}