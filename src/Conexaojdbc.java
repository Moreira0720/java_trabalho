/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conexaojdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CAMARGO
 */
public class Conexaojdbc {
    static String url = "jdbc:mysql://localhost:3306/Restaurante";

        static String usuario = "root";

        static String senha = "";
        
        static Connection conn = null; 
        
        public static Connection getconnection(){
        try {
            conn= DriverManager.getConnection(url,usuario,senha);
        } catch (SQLException ex) {
            Logger.getLogger(Conexaojdbc.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.print("conexão com sucesso");
        return conn;
        }
        

}

