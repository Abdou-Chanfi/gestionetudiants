/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.abdouchanfi.gestionetudiants.imp;

import java.util.ArrayList;
import java.util.List;
import sn.abdouchanfi.gestionetudiants.GestionGroupeEtudiants;
import sn.abdouchanfi.gestionetudiants.interfaceprincipale.Interfaceglobale;

/**
 *
 * @author EL REY LUCCHEZE
 */
public class groupeetudiantsImp implements Interfaceglobale<GestionGroupeEtudiants> {
  ArrayList<GestionGroupeEtudiants> grp = new ArrayList<>();

@Override
public void add(GestionGroupeEtudiants t) {
	// TODO Auto-generated method stub
	grp.add(t);
}

@Override
public void delete(GestionGroupeEtudiants t) {
	// TODO Auto-generated method stub
	grp.remove(t);
}

@Override
public void update(GestionGroupeEtudiants t) {
	// TODO Auto-generated method stub
	 for (GestionGroupeEtudiants gestiongroupeetudiants : grp)
     {
         if(gestiongroupeetudiants.getId() == t.getId())
         {
        	 gestiongroupeetudiants.setNomGroupe(t.getNomGroupe());
        	 gestiongroupeetudiants.setDate_creation(t.getDate_creation());
         }
     } 
	
}

@Override
public void edit(GestionGroupeEtudiants t) {
	// TODO Auto-generated method stub
	
}

@Override
public GestionGroupeEtudiants getById(int id) {
	// TODO Auto-generated method stub
	for (GestionGroupeEtudiants gestiongroupeetudiants : grp)
    {
        if(gestiongroupeetudiants.getId() == id)
        {
        	return gestiongroupeetudiants;
        }
    }
 
	
	return null;
}

@Override
public List<GestionGroupeEtudiants> getAll() {
	// TODO Auto-generated method stub
	return null;
}
            
   /*  @Override
    public void addGroupe(GestionGroupeEtudiants groupe) {
       this.grp.add(groupe);
    }
    
    @Override
    public void updateGroupe(GestionGroupeEtudiants groupe) {
        for (GestionGroupeEtudiants groupes2:this.grp)
       {
           if(groupes2.getId()==groupe.getId())
           {
               groupes2.setNomGroupe(groupe.getNomGroupe());
               groupes2.setDate_creation(groupe.getDate_creation());
           }
       } 
    }

    @Override
    public GestionGroupeEtudiants getGroupebyId(int i) {
        for(GestionGroupeEtudiants groupes:this.grp)
        {
            if(groupes.getId()==i)
            {
                return groupes;
            }
        }
        return null;
    }

    @Override
    public List<GestionGroupeEtudiants> getAllGroupe() {
       return this.grp;
    }

    @Override
    public void deleteGroupe(GestionGroupeEtudiants groupe) {
        this.grp.remove(groupe);
    }  */
}
