
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class consultasPreparadas {

    
    public static void main(String[] args) {
        try {
           
        
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pildoras", "root", "");
            System.out.println("Conexión realizada con éxito.");
            String sentencia="SELECT NOMBREARTICULO,SECCION,PRECIO,PAISORIGEN FROMPRODUCTOS" + " WHERE SECCION=? AND PAISORIGEN=?";          
            PreparedStatement miPSt=con.prepareStatement(sentencia);
            miPSt.setString(1,"Confección");
            miPSt.setString(2,"España");
            
            ResultSet miRs=miPSt.executeQuery();
            while(miRs.next()){
                System.out.println(miRs.getString(1) +" " + miRs.getString(2) +" " +  miRs.getString(3)+ " "+  miRs.getString(4));
              }
            miRs.close();
           
            con.close();
            
            System.out.println("Conexión cerrada.");
        } catch (SQLException ex) {
            System.out.println("Ha ocurrido algún error inesperado.");
        }
    }
    
}
