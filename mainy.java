import java.util.*;
import java.io.*;

public class mainy {
  private static Scanner ent = new Scanner(System.in);
  private static Scanner nbch = new Scanner(System.in);
  public static void main(String[] args) {
    Sommet sommet1 = new Sommet('L',"ECOLE-DE-PARACHUTISME");
    Sommet sommet2 = new Sommet('L',"WALIBI");
    Sommet sommet3 = new Sommet('L',"PARC-AQUATIQUE ");
    Sommet sommet4 = new Sommet('L',"PARC-DINO-ZOO");
    Sommet sommet5 = new Sommet('L',"VULCANIA");
    Sommet sommet6 = new Sommet('L',"SKI");
    Sommet sommet7 = new Sommet('R',"La-Vague-d'Or");
    Sommet sommet8 = new Sommet('R',"Le-Petit-Nice");
    Sommet sommet9 = new Sommet('R',"Le-1947-au-Cheval-Blanc");
    Sommet sommet10 = new Sommet('R',"Pic");
    Sommet sommet11 = new Sommet('R',"Le-Neuvième-Art");
    Sommet sommet12 = new Sommet('R',"Guy-Savoy");
    Sommet sommet13 = new Sommet('V',"Lyon");
    Sommet sommet14= new Sommet('V',"Montelimar");
    Sommet sommet15 = new Sommet('V',"Valence");
    Sommet sommet16 = new Sommet('V',"Grenoble");
    Sommet sommet17 = new Sommet('V',"Saint-Etienne");
    Sommet sommet18 = new Sommet('V',"Chambéry");
    Sommet sommet19 = new Sommet('V',"Bourg-en-Bresse");
    Sommet sommet20 = new Sommet('V',"Bourgoin-Jailleu");
    Sommet sommet21 = new Sommet('V',"Annecy");
    Sommet sommet22 = new Sommet('V',"Clermont-Ferrand");
    Sommet sommet23 = new Sommet('V',"Montpellier");
    Sommet sommet24 = new Sommet('V',"Dijon");
    Sommet sommet25 = new Sommet('V',"Nice");
    Sommet sommet26 = new Sommet('V',"Gap");
    Sommet sommet27 = new Sommet('V',"Avignon");
    Sommet sommet28 = new Sommet('V',"Paris");
    Sommet sommet29 = new Sommet('V',"Toulouse");
    Sommet sommet30 = new Sommet('V',"Vienne");


    ArrayList<Sommet> listeSom = new ArrayList<Sommet>();

    listeSom.add(sommet1);
    listeSom.add(sommet2);
    listeSom.add(sommet3);
    listeSom.add(sommet4);
    listeSom.add(sommet5);
    listeSom.add(sommet6);
    listeSom.add(sommet7);
    listeSom.add(sommet8);
    listeSom.add(sommet9);
    listeSom.add(sommet10);
    listeSom.add(sommet11);
    listeSom.add(sommet12);
    listeSom.add(sommet13);
    listeSom.add(sommet14);
    listeSom.add(sommet15);
    listeSom.add(sommet16);
    listeSom.add(sommet17);
    listeSom.add(sommet18);
    listeSom.add(sommet19);
    listeSom.add(sommet20);
    listeSom.add(sommet21);
    listeSom.add(sommet22);
    listeSom.add(sommet23);
    listeSom.add(sommet24);
    listeSom.add(sommet25);
    listeSom.add(sommet26);
    listeSom.add(sommet27);
    listeSom.add(sommet28);
    listeSom.add(sommet29);
    listeSom.add(sommet30);


    Routes routes1 = new Routes('A',listeSom.get(0),sommet2,60);
    Routes routes2 = new Routes('D',listeSom.get(0),sommet3,10);
    Routes routes3 = new Routes('D',listeSom.get(0),sommet5,40);
    Routes routes4 = new Routes('A',listeSom.get(1),sommet1,10);
    Routes routes5 = new Routes('A',listeSom.get(1),sommet5,100);


    List<ArrayList<Routes>> listeSom1 = new ArrayList<ArrayList<Routes>>();
    ArrayList<Routes> list1 = new ArrayList<Routes>();
    list1.add(routes1);
    list1.add(routes2);
    list1.add(routes3);
    listeSom1.add(list1);
 
    ArrayList<Routes> list2 = new ArrayList<Routes>();
 
    list2.add(routes4);
    list2.add(routes5);
    listeSom1.add(list2);

    for (int j = 0; j < list1.size(); j++) {
      System.out.println(list1.get(j));
      System.out.println("\n");
    }
    int menuOption;
    int ch = 0 ;
    do {

          System.out.println("\n ********** MENU *********\n");
          System.out.println("1.liste Sommet");
          System.out.println("2.Voir voisin");
          System.out.println("3.Voir infos");
          System.out.println("4.vendu");
          System.out.println("5.tarif");
          System.out.println("6.impots");
          System.out.println("9.Quit");
          menuOption = ent.nextInt();
          ent.nextLine();

          switch (menuOption) {

          case 1:
            for (int j = 0; j < listeSom.size(); j++) {
              System.out.println(listeSom.get(j));
              System.out.println(j+"\n");
            }
            break;
          case 2:
          System.out.println("entrez le nb du sommet");
          ch = nbch.nextInt();
          nbch.nextLine();
            for (int j = 0; j < listeSom1.get(ch).size(); j++) {
              System.out.println(listeSom1.get(ch).get(j));
              System.out.println("\n");
            }
            break;
          case 3:
          System.out.println("\nSommet : " + sommet1.getNbreInstances());
          System.out.println("\n\tavec : " + sommet1.getNbreInstancesV() + " villes, " + sommet1.getNbreInstancesR() + " restos, " + sommet1.getNbreInstancesL() + " loisirs." );
          System.out.println("\nnb route : " + routes1.getNbreInstances());
          System.out.println("\n\tavec : " + routes1.getNbreInstancesA() + " autoroutes, " + routes1.getNbreInstancesN() + " nationales, " + routes1.getNbreInstancesD() + " departementales." );
          
          break;

        }
      } while (menuOption != 9);
    
  }
}