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
public class Gestiongroupe {
  private int id;
    private String nomGroupe;
    private String date_creation;

    public Gestiongroupe(int id, String nomGroupe, String date_creation) {
        this.id = id;
        this.nomGroupe = nomGroupe;
        this.date_creation = date_creation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomGroupe() {
        return nomGroupe;
    }

    public void setNomGroupe(String nomGroupe) {
        this.nomGroupe = nomGroupe;
    }

    public String getDate_creation() {
        return date_creation;
    }

    public void setDate_creation(String date_creation) {
        this.date_creation = date_creation;
    }

    @Override
    public String toString() {
        return "Groupe{" + "id=" + id + ", nomGroupe=" + nomGroupe + ", date_creation=" + date_creation + '}';
    }  
}
