
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sergi
 */
public class actualizaTabla {

    private static String AR45;
    private static String CAMISA;
     public static void main(String[] args) {
      

      

        try {
           
        
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pildoras", "root", "");
            //System.out.println("Conexión realizada con éxito.");

            Statement miSt=con.createStatement();
           

            String inSQL="INSERT INTO PRODUCTOS ('CODIGOARTICULO') VALUES ('AR45')";
           

            miSt.executeUpdate(inSQL);
           
              
           // miRs.close();
            System.out.println("registro insertado");
            con.close();
            
            //System.out.println("Conexión cerrada.");
        } catch (SQLException ex) {
            System.out.println("Ha ocurrido algún error.");
        }
    }
}
