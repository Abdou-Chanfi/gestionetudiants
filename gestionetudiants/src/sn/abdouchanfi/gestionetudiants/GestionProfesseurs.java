/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.abdouchanfi.gestionetudiants;

/**
 *
 * @author EL REY LUCCHEZE
 */
public class GestionProfesseurs extends Personne {
  private String salaire;
  

    public GestionProfesseurs(String salaire, int id, String nom, String prenom, String adresse, String tel, String login, String password) {
        super(id, nom, prenom, adresse, tel, login, password);
        this.salaire = salaire;
    }

    public String getSalaire() {
        return salaire;
    }

    public void setSalaire(String salaire) {
        this.salaire = salaire;
    }
  

  
}
