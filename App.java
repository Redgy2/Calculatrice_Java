import java.util.Scanner;

/**
 * Hello
 */
public class App
{
    public static void main(String a[])
    {
        int choix = 0; //choix taper par l'utilisateur
        int nbr = 0; //nombre 1 a utiliser
        int nbr2 = 0; //nombre 2 a utiliser
        boolean done = false; //boolean pour savoir si nombre1 est un int
        boolean done2 = false; //boolean pour savoir si nombre2 est un int
        boolean b = false; //boolean pour savoir si operation taper est bonne
        Scanner scan = new Scanner(System.in);  // Créer un scanner 
       
        while (!b) { 
                System.out.println("Choisir l'opération de la calculatrice : ");
                System.out.println("1.ADDITION");
                System.out.println("2.SOUSTRACTION");
                System.out.println("3.MULTIPLICATION");
                System.out.println("4.DIVISION");
                System.out.println("-------------------------------------------------");
                System.out.println("Opération : ");
                try {
                    choix = scan.nextInt(); //input du choix
                } catch (Exception e) {
                    scan.next();
                } 
                //si nombre est entre 1 et 4              
                if (choix > 1 && choix < 5) {
                    b = true;
                    //switch pour savoir si on choisit le nombre le type d'operation
                    switch (choix) {
                        case 1:
                            System.out.println("Nombre a additionner");
                            while (!done) {
                                try {
                                    System.out.println("Nombre 1 : ");
                                    nbr = scan.nextInt(); //input du nbr1
                                    done = true;
                                } catch (Exception e) {
                                    System.out.println("Erreur! Taper un chiffre");
                                    scan.next();
                                }                                    
                            }                                             
                            while (!done2) {
                                try {
                                    System.out.println("Nombre 2 : ");
                                    nbr2 = scan.nextInt();//input du nbr2
                                    done2 = true;
                                } catch (Exception e) {
                                    System.out.println("Erreur! Taper un chiffre");
                                    scan.next();
                                }
                            }    
                            System.out.println("Resultat : " + (nbr + nbr2));
                            System.out.println("-------------------------------------------------");
                            break;
                        case 2:
                            System.out.println("Nombre a soustraire");
                            while (!done) {
                                try {
                                    System.out.println("Nombre 1 : ");
                                    nbr = scan.nextInt(); //input du nbr1
                                    done = true;
                                } catch (Exception e) {
                                    System.out.println("Erreur! Taper un chiffre");
                                    scan.next();
                                }                      
                            }  
                            while (!done2) {
                                try {
                                    System.out.println("Nombre 2 : ");
                                    nbr2 = scan.nextInt(); //input du nbr2
                                    done2 = true;
                                } catch (Exception e) {
                                    System.out.println("Erreur! Taper un chiffre");
                                    scan.next();
                                }
                            }  
                            System.out.println("Resultat : " + (nbr - nbr2));
                            System.out.println("-------------------------------------------------");
                            break;
                        case 3:
                            System.out.println("Nombre a multiplier");
                            while (!done) {
                                try {
                                    System.out.println("Nombre 1 : ");
                                    nbr = scan.nextInt(); //input du nbr1
                                    done = true;
                                } catch (Exception e) {
                                    System.out.println("Erreur! Taper un chiffre");
                                    scan.next();
                                }                       
                            }  
                            while (!done2) {
                                try {
                                    System.out.println("Nombre 2 : ");
                                    nbr2 = scan.nextInt(); //input du nbr2
                                    done2 = true;
                                } catch (Exception e) {
                                    System.out.println("Erreur! Taper un chiffre");
                                    scan.next();
                                }
                            }  
                            System.out.println("Resultat : " + (nbr * nbr2));
                            System.out.println("-------------------------------------------------");
                            break;
                        case 4:
                            System.out.println("Nombre a divisioner");
                            while (!done) {
                                try {
                                    System.out.println("Nombre 1 : ");
                                    nbr = scan.nextInt(); //input du nbr1
                                    done = true;
                                } catch (Exception e) {
                                    System.out.println("Erreur! Taper un chiffre");
                                    scan.next();
                                }                       
                            }  
                            while (!done2) {
                                try {
                                    System.out.println("Nombre 2 : ");
                                    nbr2 = scan.nextInt(); //input du nbr2
                                    done2 = true;
                                } catch (Exception e) {
                                    System.out.println("Erreur! Taper un chiffre");
                                    scan.next();
                                }
                            }  
                            System.out.println("Resultat : " + (nbr / nbr2));
                            System.out.println("-------------------------------------------------");
                            break;
                    }  
                } 
                else
                    System.out.println("Erreur! Choisir un nombre entre 1 et 4");        
        }
    }
}
