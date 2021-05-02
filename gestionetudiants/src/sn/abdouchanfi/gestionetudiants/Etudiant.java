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
public class Etudiant extends Personne {
    
  private String identifiant_etudiant;

    public Etudiant(String identifiant_etudiant, int id, String nom, String prenom, String adresse, String tel, String login, String password) {
        super(id, nom, prenom, adresse, tel, login, password);
        this.identifiant_etudiant = identifiant_etudiant;
    }

   /* public Etudiant(int id, String nom, String prenom, String adresse, String tel, String login, String password) {

    }*/

    public String getIdentifiant_etudiant() {
        return identifiant_etudiant;
    }

    public void setIdentifiant_etudiant(String identifiant_etudiant) {
        this.identifiant_etudiant = identifiant_etudiant;
    }

    public void add(Etudiant etudiant) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void remove(Etudiant etudiant) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getIdentifiant_etudiant(String identifiant_etudiant) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

	@Override
	public String toString() {
		return "Etudiant [identifiant_etudiant=" + identifiant_etudiant + ", getIdentifiant_etudiant()="
				+ getIdentifiant_etudiant() + ", getId()=" + getId() + ", getNom()=" + getNom() + ", getPrenom()="
				+ getPrenom() + ", getAdresse()=" + getAdresse() + ", getTel()=" + getTel() + ", getLogin()="
				+ getLogin() + ", getPassword()=" + getPassword() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

   
    
    
}
