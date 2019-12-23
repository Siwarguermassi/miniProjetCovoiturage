/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Beans.offreCov;
import Utilitaire.Singleton;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author safeee
 */
public class DAO_offre implements IDAO_offre{

    @Override
    public void ajouterOffre(offreCov o){
            try{
            Connection c=Singleton.getCon();
            ResultSet rs;
            Statement st = c.createStatement();
                System.out.println(o.getNomPersonne());
            String mat="select matricule from personne where prenomPersonne='"+o.getNomPersonne()+"'";
            rs=st.executeQuery(mat);
            if(rs.next())
            mat=rs.getString(1);
            String query ="INSERT INTO offrecov VALUES('"+o.getIdOffreCov()+"','"+o.getPointDepart()+
                "','"+o.getPointArrivé()+"','"+o.getDheureDepart()+"','"+o.getDheureArrivée()+
                "','"+o.getTypeTrajet()+"','"+o.getNomPersonne()+"','"+mat+"');";
            st.executeUpdate(query);
              }catch (SQLException e)        {
            System.err.println("Error executing query: " + e.getMessage());
        }
    }

    @Override
    public void modifierOffre(offreCov o) {
     /*try{
       Connection c= Singleton.getCon();
        Statement st = c.createStatement();
       String query ="UPDATE offrecov set idOffreCov='"+o.getIdOffreCov()+"',pointDepart='"+o.getPointDepart()+"',pointArrivé='"+
                o.getPointArrivé()+"',DheureDepart='"+o.getDheureDepart()+"',DheureArrivée='"+
                o.getDheureArrivée()+"',typeTrajet='"+o.getTypeTrajet()+"',nomPersonne='"+
                o.getNomPersonne()+"',matricule='"+
                o.getMatricule()+"' WHERE idOffreCov ='"+idOffreCov+"';";
        st.executeQuery(query);
        
       }catch(SQLException e ){
       System.out.print(e.getMessage());
    } */
     Connection c=Singleton.getCon();
        try {
            Statement st=c.createStatement();
            String sql="UPDATE offrecov set idOffreCov='"+o.getIdOffreCov()+"',pointDepart='"+o.getPointDepart()+"',pointArrivé='"+
              o.getPointArrivé()+"',DheureDepart='"+o.getDheureDepart()+"',DheureArrivée='"+
              o.getDheureArrivée()+"',typeTrajet='"+o.getTypeTrajet()+"',nomPersonne='null',matricule='null' WHERE idOffreCov ='"+o.getIdOffreCov()+"';";
            int Rset=st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DAO_offre.class.getName()).log(Level.SEVERE, null, ex);
        }}

    @Override
    public void supprimerOffre(String idOffreCov) {
   Connection c=Singleton.getCon();
       
        try {
            Statement st=c.createStatement();
            String sql="delete from offrecov where idOffreCov='"+ idOffreCov+"';";
      int Rset=st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DAO_offre.class.getName()).log(Level.SEVERE, null, ex);/* try{
        Connection c=Singleton.getCon();
        Statement st = c.createStatement();
        String query ="DELETE FROM offrecov WHERE idOffreCov ='"+o.getIdOffreCov()+"';";
        st.executeQuery(query);
        } catch (Exception e) {
        e.printStackTrace(); 
        }   */  }
    }

    @Override
    public ArrayList<offreCov> getAllOffre() {
    ArrayList<offreCov>l=new ArrayList<offreCov>();
        try{
            Statement s=Singleton.getCon().createStatement();
            String query ="select * from offrecov";
            ResultSet rs=s.executeQuery(query);                                 
            while(rs.next())                                                    
            {                                                                   
                l.add(new offreCov(rs.getString("idOffreCov"),                  
                        rs.getString("DheureArrivée"),                          
                        rs.getString("DheureDepart"),                           
                        rs.getString("pointArrivé"),                            
                        rs.getString("pointDepart"),                            
                        rs.getString("typeTrajet"),rs.getString("nomPersonne"),rs.getString("matricule")));
            }
        }catch(SQLException e1){
            e1.printStackTrace();}
    return l;
    }
    @Override
    public offreCov getOffre(String idOffreCov) {
try{
       Connection c=Singleton.getCon();
        Statement st = c.createStatement();    
           String query="SELECT * FROM offrecov WHERE idOffreCov='"+idOffreCov+"';";
           ResultSet RS = st.executeQuery(query);
            while(RS.next()) {
                String idOffre=RS.getString("idOffreCov");
                String DheureArrivée=RS.getString("DheureArrivée");
                String DheureDepart=RS.getString("DheureDepart");
                String pointArrivé=RS.getString("pointArrivé");
                String pointDepart=RS.getString("pointDepart");
                String typeTrajet=RS.getString("typeTrajet");
                 offreCov o1=new offreCov(idOffre,DheureArrivée,DheureDepart,pointArrivé,pointDepart,typeTrajet);
              return o1;
            }
           }catch(SQLException e ){
       System.out.print(e.getMessage());
       return null;
        }return null;    }
}
