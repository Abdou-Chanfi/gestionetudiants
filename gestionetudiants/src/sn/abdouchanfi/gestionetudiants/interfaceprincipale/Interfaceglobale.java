/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.abdouchanfi.gestionetudiants.interfaceprincipale;

import java.util.List;

/**
 *
 * @author EL REY LUCCHEZE
 */
public interface Interfaceglobale<T> {
    
 void add(T t);
 void delete(T t);
 void update(T t);
 public void edit(T t);
 T getById(int id);
  List<T> getAll();
 
}


