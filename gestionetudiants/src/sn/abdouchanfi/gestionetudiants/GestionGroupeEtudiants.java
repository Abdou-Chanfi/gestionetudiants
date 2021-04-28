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
public class GestionGroupeEtudiants {
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
        return "Groupe{" + "id=" + id + ", nomGroupe=" + nomGroupeEtuiants + ", date_creation=" + date_creation + '}';
     //To change body of generated methods, choose Tools | Templates.
    }

    
}
