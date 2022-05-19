package org.aguzman.java.jdbc;

import java.sql.*;

public class EjemploJdbc {
    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@(DESCRIPTION =(ADDRESS=(PROTOCOL = TCP)(HOST = epec1-scan5.ar1.ocm.s7353120.oraclecloudatcustomer.com)(PORT = 1521))(CONNECT_DATA =(SERVER = DEDICATED)(SERVICE_NAME = DESB_DES.ar1.ocm.s7353120.oraclecloudatcustomer.com)(FAILOVER_MODE =(TYPE = select)(METHOD = basic))))";
        String username = "xxsire";
        String password = "xxsire";

        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();
            ResultSet resultado = stmt.executeQuery("select * from emple where c_repar = 15");
            while (resultado.next()){
                System.out.println(resultado.getString("ap_y_nom"));

            }
            resultado.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
