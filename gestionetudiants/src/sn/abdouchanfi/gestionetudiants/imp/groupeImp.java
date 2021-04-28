/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.abdouchanfi.gestionetudiants.imp;

import java.util.ArrayList;
import java.util.List;
import sn.abdouchanfi.gestionetudiants.Gestiongroupe;
import sn.abdouchanfi.gestionetudiants.interfaceprincipale.Interfaceglobale;

/**
 *
 * @author EL REY LUCCHEZE
 */
public class groupeImp implements Interfaceglobale<Gestiongroupe>{

   /* public static void addGestiongroupe(Gestiongroupe grp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void deleteGestiongroupe(Gestiongroupe grp2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static List<Gestiongroupe> getAllGestiongroupe() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
  ArrayList<Gestiongroupe> grp = new ArrayList<>();

@Override
public void add(Gestiongroupe t) {
	// TODO Auto-generated method stub
	grp.add(t);
}

@Override
public void delete(Gestiongroupe t) {
	// TODO Auto-generated method stub
	grp.remove(t);
	
}

@Override
public void update(Gestiongroupe t) {
	// TODO Auto-generated method stub
	for(Gestiongroupe gestiongroupe : grp) {
        if(gestiongroupe.getId() == t.getId()) {

               
                gestiongroupe.setNomGroupe(t.getNomGroupe());
                gestiongroupe.setDate_creation(t.getDate_creation());
                

        }
    }
	
}

@Override
public void edit(Gestiongroupe t) {
	// TODO Auto-generated method stub
	
}

@Override
public Gestiongroupe getById(int id) {
	// TODO Auto-generated method stub
	
	for(Gestiongroupe gestiongroupe : grp) {

        if(gestiongroupe.getId() == id) {
            return gestiongroupe;
        }

    }
	
	return null;
}

@Override
public List<Gestiongroupe> getAll() {
	// TODO Auto-generated method stub
	return grp;
}

   /*  @Override
    public void addGroupe(Gestiongroupe groupe) {
       this.grp.add(groupe);
    }
    
    @Override
    public void updateGroupe(Gestiongroupe groupe) {
        for (Gestiongroupe groupes2:this.grp)
       {
           if(groupes2.getId()==groupe.getId())
           {
               groupes2.setNomGroupe(groupe.getNomGroupe());
               groupes2.setDate_creation(groupe.getDate_creation());
           }
       } 
    }

    @Override
    public Gestiongroupe getGroupebyId(int i) {
        for(Gestiongroupe groupes:this.grp)
        {
            if(groupes.getId()==i)
            {
                return groupes;
            }
        }
        return null;
    }

    @Override
    public List<Gestiongroupe> getAllGroupe() {
       return this.grp;
    }

    @Override
    public void deleteGroupe(Gestiongroupe groupe) {
        this.grp.remove(groupe);
    }

    public Gestiongroupe getGestiongroupebyId(int IdMod) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateGestiongroupe(Gestiongroupe gr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
}
