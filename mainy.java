import java.util.*;
import java.io.*;

public class mainy {

  private static Scanner ent = new Scanner(System.in);
  private static Scanner nbch = new Scanner(System.in);


  public static void main(String[] args) {
    Sommet sommet1 = new Sommet('L', "ECOLE-DE-PARACHUTISME");
    Sommet sommet2 = new Sommet('L', "WALIBI");
    Sommet sommet3 = new Sommet('L', "PARC-AQUATIQUE ");
    Sommet sommet4 = new Sommet('L', "PARC-DINO-ZOO");
    Sommet sommet5 = new Sommet('L', "VULCANIA");
    Sommet sommet6 = new Sommet('L', "SKI");
    Sommet sommet7 = new Sommet('R', "La-Vague-d'Or");
    Sommet sommet8 = new Sommet('R', "Le-Petit-Nice");
    Sommet sommet9 = new Sommet('R', "Le-1947-au-Cheval-Blanc");
    Sommet sommet10 = new Sommet('R', "Pic");
    Sommet sommet11 = new Sommet('R', "Le-Neuvième-Art");
    Sommet sommet12 = new Sommet('R', "Guy-Savoy");
    Sommet sommet13 = new Sommet('V', "Lyon");
    Sommet sommet14 = new Sommet('V', "Montelimar");
    Sommet sommet15 = new Sommet('V', "Valence");
    Sommet sommet16 = new Sommet('V', "Grenoble");
    Sommet sommet17 = new Sommet('V', "Saint-Etienne");
    Sommet sommet18 = new Sommet('V', "Chambéry");
    Sommet sommet19 = new Sommet('V', "Bourg-en-Bresse");
    Sommet sommet20 = new Sommet('V', "Bourgoin-Jailleu");
    Sommet sommet21 = new Sommet('V', "Annecy");
    Sommet sommet22 = new Sommet('V', "Clermont-Ferrand");
    Sommet sommet23 = new Sommet('V', "Montpellier");
    Sommet sommet24 = new Sommet('V', "Dijon");
    Sommet sommet25 = new Sommet('V', "Nice");
    Sommet sommet26 = new Sommet('V', "Gap");
    Sommet sommet27 = new Sommet('V', "Avignon");
    Sommet sommet28 = new Sommet('V', "Paris");
    Sommet sommet29 = new Sommet('V', "Toulouse");
    Sommet sommet30 = new Sommet('V', "Vienne");

    ArrayList < Sommet > listeSom = new ArrayList < Sommet > ();

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

    Routes routes1 = new Routes('A', sommet1, sommet2, 60);
    Routes routes2 = new Routes('D', sommet1, sommet3, 10);
    Routes routes3 = new Routes('D', sommet1, sommet4, 40);
    Routes routes4 = new Routes('A', sommet2, sommet4, 10);
    Routes routes5 = new Routes('A', sommet2, sommet5, 100);
    Routes routes6 = new Routes('A', sommet2, sommet3, 100);
    Routes routes7 = new Routes('A', sommet2, sommet6, 100);

    List < ArrayList < Routes >> listeSom1 = new ArrayList < ArrayList < Routes >> ();
    ArrayList < Routes > list1 = new ArrayList < Routes > ();
    list1.add(routes1);
    list1.add(routes2);
    list1.add(routes3);
    listeSom1.add(list1);

    ArrayList < Routes > list2 = new ArrayList < Routes > ();

    list2.add(routes4);
    list2.add(routes5);
    list2.add(routes6);
    list2.add(routes7);
    listeSom1.add(list2);

    
    int menuOption;
    int ch = 0;
    int ch2 = 0;
    Sommet x = sommet1;
    Sommet y = sommet1;
    Sommet z = sommet1;
    Sommet w = sommet1;
    boolean a = false;
    do {

      System.out.println("\n ********** MENU *********\n");
      
      System.out.println("1.liste Sommet");
      System.out.println("2.Voir voisin");
      System.out.println("3.Voir infos");
      System.out.println("4.voir Routes");
      System.out.println("5.qui relie quoi");
      System.out.println("6.2 DISTANCE ?");
      System.out.println("7.Compare");
      System.out.println("9.Quit");
      menuOption = ent.nextInt();
      ent.nextLine();

      switch (menuOption) {

      case 1:
        for (int j = 0; j < listeSom.size(); j++) {
          System.out.println(listeSom.get(j));
          System.out.println(j + "\n");
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
        System.out.println("\n\tavec : " + sommet1.getNbreInstancesV() + " villes, " + sommet1.getNbreInstancesR() + " restos, " + sommet1.getNbreInstancesL() + " loisirs.");
        System.out.println("\nnb route : " + routes1.getNbreInstances());
        System.out.println("\n\tavec : " + routes1.getNbreInstancesA() + " autoroutes, " + routes1.getNbreInstancesN() + " nationales, " + routes1.getNbreInstancesD() + " departementales.");

        break;
      case 4:
        for (int j = 0; j < listeSom1.size(); j++) {
          for (int o = 0; o < listeSom1.size(); o++) {
            System.out.println(listeSom1.get(j).get(o));
            System.out.println("\n");
          }
          System.out.println("-------------------------------------");
        }
        break;
      case 5:
        System.out.println("entrez le nb de la route");
        ch = nbch.nextInt();
        nbch.nextLine();
        System.out.println("entrez le nb de la route");
        ch2 = nbch.nextInt();
        nbch.nextLine();
        System.out.println(listeSom1.get(ch).get(ch2));
        System.out.println("\n");
        break;
      case 6:
        

        System.out.println("\n");
        if (dist(listeSom1,sommet1) == true) {
          System.out.println("OUI 2 DISTANCE");
        } else {
          System.out.println("non");
        }
        break;
      case 7:
      int b=0;
        System.out.println("entrez le nb du lieu");
        ch = nbch.nextInt();
        nbch.nextLine();
        System.out.println("entrez le nb du lieu");
        ch2 = nbch.nextInt();
        nbch.nextLine();
        
        System.out.println(intdist(listeSom1,sommet1,ch));
      break;

      }
    } while (menuOption != 9);

  }







































  static boolean dist(List<ArrayList<Routes>> listeSom1, Sommet defaut) {
    int ch;
    int ch2;
    Sommet x = defaut;
    Sommet y = defaut;
    Sommet z = defaut;
    Sommet w = defaut;
    boolean a = false;
    System.out.println("entrez le nb du premier site");
    ch = nbch.nextInt();
    nbch.nextLine();
    System.out.println("entrez le nb du deuxieme site");
    ch2 = nbch.nextInt();
    nbch.nextLine();

    for (int i = 0; i < listeSom1.get(ch).size(); i++) {
      x = listeSom1.get(ch).get(i).getSom1();
      z = listeSom1.get(ch).get(i).getSom2();
      for (int j = 0; j < listeSom1.get(ch2).size(); j++) {
        y = listeSom1.get(ch2).get(j).getSom1();
        w = listeSom1.get(ch2).get(j).getSom2();
      }
      if (w == x || w == z || y == z || y == x) {
        a = true;
      }

    }
    if (a == false){
      return false;
    }
    else {
      return true;
    }
  }
  static int intdist(List<ArrayList<Routes>> listeSom1, Sommet defaut, int ch){
        Sommet somm = null;
        for (int j = 0; j < listeSom1.get(ch).size(); j++) {
          System.out.println(listeSom1.get(ch).get(j).getSom2());


        }
        return 0;
      }



}
  