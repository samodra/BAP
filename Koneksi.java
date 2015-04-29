# BAP
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainstream;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author L855-S5309
 */
public class Koneksi {
         String db = "jdbc:mysql://localhost/bap";
	String user = "root";
	String pass = "";
        private ResultSet rs = null;

    java.sql.Statement stm = null;
	public Connection co = null;


	public Koneksi(){}

	public java.sql.Statement sambung(){

		try {
			Class.forName("org.gjt.mm.mysql.Driver");
            }
        catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		try {
			co = DriverManager.getConnection(db,user,pass);
            }
        catch (SQLException e) {

			e.printStackTrace();
		}

		try {
			stm = co.createStatement();
                        
                  
            }
        catch (SQLException e) {

			e.printStackTrace();
		}

		return stm;
	}
        
        public void query(String sql){
            try {
                stm.executeUpdate(sql);
            } catch (SQLException ex) {
                Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        public ResultSet getData(String sql){
            try {
                rs = stm.executeQuery(sql);
            } catch (SQLException ex) {
                Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
            }
            return rs;
        }
}
