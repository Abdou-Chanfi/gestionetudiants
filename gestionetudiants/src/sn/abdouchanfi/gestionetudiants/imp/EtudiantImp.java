/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.abdouchanfi.gestionetudiants.imp;

import java.util.ArrayList;
import java.util.List;
import sn.abdouchanfi.gestionetudiants.Etudiant;
import sn.abdouchanfi.gestionetudiants.interfaceprincipale.Interfaceglobale;

/**
 *
 * @author EL REY LUCCHEZE
 */
public class EtudiantImp implements Interfaceglobale<Etudiant>{
    
	private List<Etudiant> etudiants = new ArrayList<>();

	@Override
	public void add(Etudiant t) {
		// TODO Auto-generated method stub
		
		etudiants.add(t);
		
	}

	@Override
	public void delete(Etudiant t) {
		// TODO Auto-generated method stub
		
		etudiants.remove(t);
		
	}

	@Override
	public void update(Etudiant t) {
		// TODO Auto-generated method stub
		
		for(Etudiant etudiant : etudiants) {
            if(t.getId() == etudiant.getId()) {

                    t.setIdentifiant_etudiant(etudiant.getIdentifiant_etudiant());
                    t.setNom(etudiant.getNom());
                    t.setLogin(etudiant.getLogin());
                    t.setPassword(etudiant.getPassword());
                    t.setPrenom(etudiant.getPrenom());

            }
        }
		
	}

	@Override
	public void edit(Etudiant t) {
		// TODO Auto-generated method stub
	
		
	}

	@Override
	public Etudiant getById(int id) {
		// TODO Auto-generated method stub
		
		for(Etudiant etudiant : etudiants) {

            if(etudiant.getId() == id) {
                return etudiant;
            }

        }
		
		return null;
	}

	@Override
	public List<Etudiant> getAll() {
		// TODO Auto-generated method stub
		return etudiants;
	}
	
    /*@Override
    public void addetudiant(Etudiant etudiant) {
        etu.add(etudiant);
    }

    @Override
    public void deleteetudiant(Etudiant etudiant) {
        etu.remove(etudiant);
    }

    @Override
    public void editetudiant(Etudiant etudiant) {
         for (Etudiant etudiants2:etu)
       {
           if(etudiants2.getId()==etudiant.getId())
           {
               etudiants2.setAdresse(etudiant.getAdresse());
               etudiants2.setIdentifiant_etudiant(etudiant.getIdentifiant_etudiant());
               etudiants2.setNom(etudiant.getNom());
               etudiants2.setLogin(etudiant.getLogin());
               etudiants2.setPassword(etudiant.getPassword());
               etudiants2.setPrenom(etudiant.getPrenom());
           }
       }}

    @Override
    public Etudiant getbyId(int i) {
        for(Etudiant etudiants:etu)
        {
            if(etudiants.getId()==i)
            {
                return etudiants;
            }
        }
        return null;}

    @Override
    public List<Etudiant> affichertousetudiant() {
        return etu;}

    public Gestiongroupe getGestiongroupebyId(int IdSup) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateGestiongroupe(Gestiongroupe grp3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void addEtudiant(Etudiant etudiant) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Etudiant getEtudiantbyId(int IdMod) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateEtudiant(Etudiant gestEt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void removeEtudiant(Etudiant etudiant2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Etudiant> getAllEtudiant() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

   
   /* @Override
    public void add(Etudiant t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      
    }

    @Override
    public void delete(Etudiant t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        remove = etudiants.remove(t);
    }

    @Override
    public void update(Etudiant t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        for(Etudiant etudiant : etudiants) {
            if(t.getId() == etudiants) {

                    t.setIdentifiant_etudiant(etudiant.getIdentifiant_etudiant());
                    t.setNom(etudiant.getNom());
                    t.setLogin(etudiant.getLogin());
                    t.setPassword(etudiant.getPassword());
                    t.setPrenom(etudiant.getPrenom());

            }
        }
    }

    @Override
    public void edit(Etudiant t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Optional<Etudiant> getById(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        for(Etudiant etudiant : etudiants) {

            if(etudiant.getId() == id) {
                return etudiant;
            }

        }


    }

    @Override
    public List<Etudiant> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        return t;

    }*/
    
}
