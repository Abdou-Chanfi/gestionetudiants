/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.abdouchanfi.gestionetudiants.imp;
import java.util.ArrayList;
import java.util.List;
import sn.abdouchanfi.gestionetudiants.GestionProfesseurs;
import sn.abdouchanfi.gestionetudiants.interfaceprincipale.Interfaceglobale;
/**
 *
 * @author EL REY LUCCHEZE
 */
public class professeurImp implements Interfaceglobale<GestionProfesseurs>{
   ArrayList<GestionProfesseurs> pro = new ArrayList<>();

@Override
public void add(GestionProfesseurs t) {
	// TODO Auto-generated method stub
	pro.add(t);
	
}

@Override
public void delete(GestionProfesseurs t) {
	// TODO Auto-generated method stub
	pro.remove(t);
	
}

@Override
public void update(GestionProfesseurs t) {
	// TODO Auto-generated method stub
	 for (GestionProfesseurs prof : pro)
     {
         if(prof.getId()== t.getId())
         {
             prof.setAdresse(t.getAdresse());
             prof.setSalaire(t.getSalaire());
             prof.setNom(t.getNom());
             prof.setLogin(t.getLogin());
             prof.setPassword(t.getPassword());
             prof.setPrenom(t.getPrenom());
         }
     } 
	
}

@Override
public void edit(GestionProfesseurs t) {
	// TODO Auto-generated method stub
	
}

@Override
public GestionProfesseurs getById(int id) {
	// TODO Auto-generated method stub
	for(GestionProfesseurs prof : pro)
    {
        if(prof.getId()  == id )
        {
            return prof;
        }
    }
	return null;
}

@Override
public List<GestionProfesseurs> getAll() {
	// TODO Auto-generated method stub
	return pro;
}
   
     
   /* public void addProfesseur(GestionProfesseurs prof) {
       pro.add(prof);
    }

    public void deleteProfesseur(GestionProfesseurs prof) {
        pro.remove(prof);
    }

    public void updateProfesseur(GestionProfesseurs prof) {
        for (GestionProfesseurs professeur2:pro)
       {
           if(professeur2.getId()==prof.getId())
           {
               professeur2.setAdresse(prof.getAdresse());
               professeur2.setSalaire(prof.getSalaire());
               professeur2.setNom(prof.getNom());
               professeur2.setLogin(prof.getLogin());
               professeur2.setPassword(prof.getPassword());
               professeur2.setPrenom(prof.getPrenom());
           }
       } 
    }

    public GestionProfesseurs getProfesseurbyId(int i) {
        for(GestionProfesseurs prof:pro)
        {
            if(prof.getId()==i)
            {
                return prof;
            }
        }
        return null;
    }

    public List<GestionProfesseurs> getAllprofesseur() {
       return pro;
    } 

    public void addGestionProfesseurs(GestionProfesseurs prof) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public GestionProfesseurs getGestionProfesseursbyId(int IdMod) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void deleteGestionProfesseurs(GestionProfesseurs prof2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<GestionProfesseurs> getAllGestionProfesseurs() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    } */
}
