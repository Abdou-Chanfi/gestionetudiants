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
public class GestionGroupeEtudiants extends Gestiongroupe {
  

public GestionGroupeEtudiants(int id, String nomGroupe, String date_creation) {
		super(id, nomGroupe, date_creation);
		// TODO Auto-generated constructor stub
	}

private int id;
    private String nomGroupeEtuiants;
    private String date_creation;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomGroupe() {
        return nomGroupeEtuiants;
    }

    public void setNomGroupe(String nomGroupe) {
        this.nomGroupeEtuiants = nomGroupe;
    }

    public String getDate_creation() {
        return date_creation;
    }

    public void setDate_creation(String date_creation) {
        this.date_creation = date_creation;
    }

	@Override
	public String toString() {
		return "GestionGroupeEtudiants [id=" + id + ", nomGroupeEtuiants=" + nomGroupeEtuiants + ", date_creation="
				+ date_creation + ", getId()=" + getId() + ", getNomGroupe()=" + getNomGroupe()
				+ ", getDate_creation()=" + getDate_creation() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

    

    
}
