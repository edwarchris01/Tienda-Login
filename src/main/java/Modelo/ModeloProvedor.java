
package Modelo;

import Controlador.Conectar;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;


public class ModeloProvedor {
        
              private int doc, Tipo,sex;
    private String nom, tele,cedu,correo, dire ;

    public String getCedu() {
        return cedu;
    }

    public void setCedu(String cedu) {
        this.cedu = cedu;
    }

    public int getTipo() {
        return Tipo;
    }

    public void setTipo(int Tipo) {
        this.Tipo = Tipo;
    }

  
    private Date fec;

    public int getDoc() {
        return doc;
    }

    public void setDoc(int doc) {
        this.doc = doc;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDire() {
        return dire;
    }

    public void setDire(String dire) {
        this.dire = dire;
    }

    public Date getFec() {
        return fec;
    }

    public void setFec(Date fec) {
        this.fec = fec;
    }

    
      public Map<String, Integer> llenarCombo(String valor) {
        Conectar conex = new Conectar();
        Connection co = conex.conex();
        String sql = "Select * from mostrar_" + valor;

        Map<String, Integer> llenar_Combo = new HashMap<>();

        try {
            Statement sc = co.createStatement();
            ResultSet rs = sc.executeQuery(sql);

            while (rs.next()) {
                llenar_Combo.put(rs.getString(2), rs.getInt(1));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return llenar_Combo;
    }
    
    public void Insertar_Provedor() {

        Conectar conex = new Conectar();
        Connection co = conex.conex();

        String sql = "Call usuario (?,?,?,?,?,?,?,?,?,?)";//colsulta a la base de datos 

        try {
            PreparedStatement ps = co.prepareStatement(sql);
            ps.setInt(1, getDoc());
            ps.setString(2, getCedu());
            ps.setInt(3, getTipo());
            ps.setString(4, getNom());
            ps.setString(5, getTele());
            ps.setString(6, getCorreo());
            ps.setString(7, getDire());
            ps.setInt(8, getSex());
            ps.setDate(9, getFec());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro guardado");
            co.close();
        } catch (SQLException ex) {
            JOptionPane.showInternalMessageDialog(null, "error al guardar", "error", JOptionPane.ERROR_MESSAGE);
        }

    }

   
}

 