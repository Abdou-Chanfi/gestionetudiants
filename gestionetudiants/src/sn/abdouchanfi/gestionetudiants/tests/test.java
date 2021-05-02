/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.abdouchanfi.gestionetudiants.tests;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import sn.abdouchanfi.gestionetudiants.Etudiant;
import sn.abdouchanfi.gestionetudiants.GestionGroupeEtudiants;
import sn.abdouchanfi.gestionetudiants.GestionProfesseurs;
import sn.abdouchanfi.gestionetudiants.Gestiongroupe;
import sn.abdouchanfi.gestionetudiants.imp.EtudiantImp;
import sn.abdouchanfi.gestionetudiants.imp.groupeImp;
import sn.abdouchanfi.gestionetudiants.imp.groupeetudiantsImp;
import sn.abdouchanfi.gestionetudiants.imp.professeurImp;
/**
 *
 * @author EL REY LUCCHEZE
 */
public class test {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
        groupeImp gestGrpImp = new groupeImp();
        EtudiantImp etuImp = new EtudiantImp();
        professeurImp profImp = new professeurImp();
        groupeetudiantsImp gestGrpEtuImp = new groupeetudiantsImp();
        boolean variable = true ;
        while (variable) { 
        // TODO code application logic here
        System.out.println("------------gestion Etudiants------------");
        
        System.out.println("Menu Principal");
        System.out.println("1- Gestion Groupe");
        System.out.println("2- Gestion etudiant");
        System.out.println("3- Gestion Professeur");
        System.out.println("4- Gestion Groupe Etudiant");
        System.out.println("5- Quitter");
        
        System.out.println("Choix :");
        
        Scanner scanner=new Scanner(System.in);
        
        int choix=scanner.nextInt();
        
        switch (choix){
        
            case 1:
                boolean variable1 = true ;
                while (variable1){
                System.out.println("------------gestion Groupe------------");
                
                System.out.println("1- Creer un Groupe");
                System.out.println("2- Modifier un groupe");
                System.out.println("3- Voir les details d'un groupe");
                System.out.println("4- Suprimer un groupe");
                System.out.println("5- Afficher tous les groupes");
                System.out.println("6- Quitter");
                
                System.out.println("choix : ");
                int choixCreerGroupe=scanner.nextInt();
                switch (choixCreerGroupe)
                {
                   case 1:
                       
                       
                       System.out.println("Ajouter Groupe");
                       
                       System.out.println(" ID DU GROUPE:");
                       
                       int id = scanner.nextInt();
                       
                       System.out.println(" NOM GROUPE :");
                       
                       String nomGroupe = scanner.next();
                       
                       System.out.println(" DATE CREATION :");
                       
                       String date_creation = scanner.next();
                      
                     Gestiongroupe grp = new Gestiongroupe(id, nomGroupe, date_creation);
                     gestGrpImp.add(grp);
                       
                       System.out.println(" Groupe ajouter avec succés");
                   break;
                   
                    
                case 2:
                       System.out.println("Modifier groupe");
                       
                       System.out.println(" ID :");
                       
                       int IdMod = scanner.nextInt();
                       Gestiongroupe gestGrp = gestGrpImp.getById(IdMod);
                       
                       System.out.println("Nom du groupe :");
                       String NomGr = scanner.next();
                       gestGrp.setNomGroupe(NomGr);
                       
                       System.out.println("Date : :");
                       String DateGr = scanner.next();
                       gestGrp.setDate_creation(DateGr);
  
                       Gestiongroupe gr = gestGrpImp.getById(IdMod);
                       gestGrpImp.update(gr);
                       System.out.println("Modification reussis");
                  
                   break;

                    
                    
                case 3:
                    System.out.println("3- Voir les details d'un Groupe");
                    
                    System.out.println(" ID :");
                    
                    int IdShow = scanner.nextInt();
                    Gestiongroupe grpShow = gestGrpImp.getById(IdShow);
                    
                    System.out.println(grpShow.toString());
                    
                    break;
                
                case 4:
                    System.out.println("4- Supprimer un Groupe");
                    System.out.println("Supprimer Groupe ");
                       
                       System.out.println(" ID :");
                       
                       int IdSup = scanner.nextInt();
                       Gestiongroupe grou2 = gestGrpImp.getById(IdSup);
                       gestGrpImp.delete(grou2);
                       System.out.println("Suppression reussis");
                  
                    break;
                
                case 5:
                    System.out.println("5- Afficher tous les Groupe");
                     System.out.println("Afficher Groupe");
                       
                      List<Gestiongroupe> grou = gestGrpImp.getAll();
                      for(Gestiongroupe gro3:grou) {
                          System.out.println("ID: "+gro3.getId()+" Prenom: "+gro3.getNomGroupe()+","+
                                  " Date Creation: "+gro3.getDate_creation());
                    };
                    break;

                
                case 6:
                    System.out.println("6- Quitter");
                    variable1 = false ;
                    variable= true ;
                    break;
                default:
                System.out.println("Le choix est invalide");
                break;
                }
                }
                break;
                
            
            case 2:
               boolean variable2 = true ;
                while(variable2){
                System.out.println("------------gestion Etudiant------------"); 
                System.out.println("1- Creer un Etudiant");
                System.out.println("2- Modifier un Etudiant");
                System.out.println("3- Voir les details d'un Etudiant");
                System.out.println("4- Suprimer un Etudiant");
                System.out.println("5- Afficher tous les Etudiant");
                System.out.println("6- Quitter"); 
                 System.out.println("choix : ");
       
               int choixEtudiant  = scanner.nextInt();
               switch(choixEtudiant)
               {
                   case 1:
                       
                       
                       System.out.println("Ajouter etudiants");
                       
                       System.out.println(" ID :");
                       
                       int id = scanner.nextInt();
                       
                       System.out.println(" NOM :");
                       
                       String nom = scanner.next();
                       
                       System.out.println(" PRENOM :");
                       
                       String prenom = scanner.next();
                       
                       System.out.println(" ADRESSE :");
                       
                       String adresse = scanner.next();

                       System.out.println(" TELEPHONE :");
                       
                       String tel = scanner.next();
                       
                       System.out.println(" LOGIN :");
                       
                       String login = scanner.next();
                       
                       System.out.println(" PASSWORD :");
                       
                       String password = scanner.next();
                       
                       Etudiant etudiant = new Etudiant(nom, id, nom, prenom, adresse, tel, login, password);
                       
                       etuImp.add(etudiant);
                       System.out.println(" Etudiant ajouter avec succés");
                   break;
                   case 2:
                       System.out.println("Modifier etudiant");
                       
                       System.out.println(" ID :");
                       
                       int IdMod = scanner.nextInt();
                       Etudiant gestEt = etuImp.getById(IdMod);
                       
                       System.out.println("Nom :");
                       String NomE = scanner.next();
                       gestEt.setNom(NomE);
                       
                        System.out.println("Prenom :");
                       String PrenomE = scanner.next();
                       gestEt.setPrenom(PrenomE);
                       
                        System.out.println("adresse :");
                       String adresseE = scanner.next();
                       gestEt.setAdresse(adresseE);
                       
                        System.out.println("telephone :");
                       String telephoneE = scanner.next();
                       gestEt.setTel(telephoneE);
                       
                        System.out.println("login :");
                       String loginE = scanner.next();
                       gestEt.setLogin(loginE);
                       
                        System.out.println("password :");
                       String passwordE = scanner.next();
                       gestEt.setPassword(passwordE);
                       
                       etuImp.update(gestEt);
                       System.out.println("Modification reussie");
                   break;
               case 3:
                         System.out.println("Afficher les details d un etudiant "); 
                         
                         System.out.println(" ID :");
                         
                         int IdShow =scanner.nextInt();
                         Etudiant gestEtShow = etuImp.getById(IdShow);
                         System.out.println(gestEtShow.toString());
                         
               break;
               case 4:
                         System.out.println("Supprimer etudiant ");
                       
                       System.out.println(" ID :");
                       
                       int IdSup = scanner.nextInt();
                       Etudiant etudiant2 = etuImp.getById(IdSup);
                       etuImp.delete(etudiant2);
                       System.out.println("Suppression reussie");

                      
                   break;
                    case 5:
                         System.out.println("Afficher les  etudiant ");   
                        
                       
                       List<Etudiant> etude = etuImp.getAll();
                       for(Etudiant etudiants4:etude) {
                           System.out.println(etudiants4.getId()+","+etudiants4.getNom()+","+
                                   etudiants4.getPrenom()+","+etudiants4.getAdresse()+","+
                                   etudiants4.getTel()+","+etudiants4.getLogin()+","+
                                   etudiants4.getPassword());
                    };
               break;

                    case 6:
                    System.out.println("6- Quitter");
                    variable2 = false ;
                    variable= true ;
                    break;
                default:
                System.out.println("Le choix est invalide");
                break;
               }
                }
                break;
                   
            case 3:
                boolean variable3 = true;
                while (variable3){
                
                System.out.println("------------gestion Professeur------------");
                System.out.println("1- Creer un Professeur");
                System.out.println("2- Modifier un Professeur");
                System.out.println("3- Voir les details d'un Professeur");
                System.out.println("4- Suprimer un Professeur");
                System.out.println("5- Afficher tous les Professeur");
                System.out.println("6- Quitter");
             
                
                 System.out.println("choix : ");
       
               int choixProfesseur  = scanner.nextInt();
               switch(choixProfesseur)
               {
                   case 1:
                       
                       
                       System.out.println("Ajouter Professeur");
                       
                       System.out.println(" ID :");
                       
                       int id = scanner.nextInt();
                       
                       System.out.println(" NOM :");
                       
                       String nom = scanner.next();
                       
                       System.out.println(" PRENOM :");
                       
                       String prenom = scanner.next();
                       
                       System.out.println(" ADRESSE :");
                       
                       String adresse = scanner.next();

                       System.out.println(" TELEPHONE :");
                       
                       String tel = scanner.next();
                       
                       System.out.println(" LOGIN :");
                       
                       String login = scanner.next();
                       
                       System.out.println(" PASSWORD :");
                       
                       String password = scanner.next();
                       
                       GestionProfesseurs prof = new GestionProfesseurs(password, id, nom, prenom, adresse, tel, login, password);
                       
                       profImp.add(prof);
                       System.out.println(" Professeur ajouter avec succés");
                   break;
                   case 2 :
                       System.out.println("Modifier professeur");
                       
                       System.out.println(" ID :");
                       
                       int IdMod = scanner.nextInt();
                       GestionProfesseurs prof3 = profImp.getById(IdMod);
                       
                        System.out.println("Nom :");
                       String NomP = scanner.next();
                       prof3.setNom(NomP);
                       
                       System.out.println("prenom :");
                       String prenomP = scanner.next();
                       prof3.setPrenom(prenomP);
                       
                       System.out.println("adresse :");
                       String adresseP = scanner.next();
                       prof3.setAdresse(adresseP);
                       
                       System.out.println("telephone :");
                       String telephoneP = scanner.next();
                       prof3.setTel(telephoneP);
                       
                       System.out.println("loggin :");
                       String loginP = scanner.next();
                       prof3.setLogin(loginP);
                       
                       System.out.println("password :");
                       String passwordP = scanner.next();
                       prof3.setPassword(passwordP);
                     
                       System.out.println("Modification reussis");
                   break;
                    case 3 :
                       System.out.println("voir les détails professeur");
                       
                       System.out.println(" ID :");
                       int IdShow =scanner.nextInt();
                       GestionProfesseurs gestProShow = profImp.getById(IdShow);
                       System.out.println(gestProShow.toString());
                   break;
                    case 4 :
                        System.out.println("supprimer professeur");
                         System.out.println(" ID :");
                       
                       int IdSup = scanner.nextInt();
                       GestionProfesseurs prof2 = profImp.getById(IdSup);
                       profImp.delete(prof2);
                       System.out.println("Suppression reussie");
                   break;
                    case 5 :
                      System.out.println("afficher tous les professeur");
                       List<GestionProfesseurs> profe = profImp.getAll();
                       for(GestionProfesseurs Gestprof4:profe) {
                           System.out.println(Gestprof4.getId()+","+Gestprof4.getNom()+","+
                                   Gestprof4.getPrenom()+","+Gestprof4.getAdresse()+","+
                                   Gestprof4.getTel()+","+Gestprof4.getLogin()+","+
                                   Gestprof4.getPassword());
                    };
                   break;

                    case 6 :
                       System.out.println(" 6-Sortie");
                       variable3= false;
                       variable= true ;
                       
                   break;
               }
               }
               break;
            case 4:
            	
            	boolean variable4 = true;
                while (variable4){
                System.out.println("------------Gestion Groupe-Etudiant------------");
                
                System.out.println("1-Modifier les groupes d'etudiants ");
                System.out.println("2-Voir les les groupes d'etudiants ");
                System.out.println("3-Suprimer les groupes d'etudiants ");
                System.out.println("4-Afficher tous les groupes d'etudiants ");
                System.out.println("5-Quitter ");
                
             
                
                 System.out.println("choix : ");
       
               int choixGestionGroupeEtudiants  = scanner.nextInt();
               switch(choixGestionGroupeEtudiants)
               {
               
               case 1:
                   System.out.println("Modifier groupe");
                   
                   System.out.println(" ID :");
                   
                   int IdMod = scanner.nextInt();
                   GestionGroupeEtudiants gestGrp = gestGrpEtuImp.getById(IdMod);
                   
                   System.out.println("Nom du groupe :");
                   String NomGr = scanner.next();
                   gestGrp.setNomGroupe(NomGr);
                   
                   System.out.println("Date : :");
                   String DateGr = scanner.next();
                   gestGrp.setDate_creation(DateGr);

                   GestionGroupeEtudiants gr = gestGrpEtuImp.getById(IdMod);
                   gestGrpEtuImp.update(gr);
                   System.out.println("Modification reussis");
              
               break;

                
                
            case 2:
                System.out.println("3- Voir les details d'un Groupe");
                
                System.out.println(" ID :");
                
                int IdShow = scanner.nextInt();
                GestionGroupeEtudiants grpShow = gestGrpEtuImp.getById(IdShow);
                
                System.out.println(grpShow.toString());
                
                break;
            
            case 3:
                System.out.println("4- Supprimer un Groupe");
                System.out.println("Supprimer Groupe ");
                   
                   System.out.println(" ID :");
                   
                   int IdSup = scanner.nextInt();
                   GestionGroupeEtudiants grou2 = gestGrpEtuImp.getById(IdSup);
                   gestGrpEtuImp.delete(grou2);
                   System.out.println("Suppression reussis");
              
                break;
            
            case 4:
                System.out.println("5- Afficher tous les Groupe");
                 System.out.println("Afficher Groupe");
                   
                  List<GestionGroupeEtudiants> grou = gestGrpEtuImp.getAll();
                  for(GestionGroupeEtudiants gro3:grou) {
                      System.out.println("ID: "+gro3.getId()+" Prenom: "+gro3.getNomGroupe()+","+
                              " Date Creation: "+gro3.getDate_creation());
                };
                break;

            
            case 5:
                System.out.println("6- Quitter");
                variable1 = false ;
                variable= true ;
                break;
            default:
            System.out.println("Le choix est invalide");
            break;
            }
            }
            break;
               
               
                
            case 5:
                System.out.println("------------Quitter------------");
                 
               System.out.println("*****************AU REVOIR***********************"); 
               System.exit(0);
               
                break;  
                
            default:
                    System.out.println("Choix invalide");
                break;
                
        }
        
        
      
    }
    
    }
}
