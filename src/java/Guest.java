
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Guest {

    String user_id;
    String password;
    String fname;
    String lname;
    String gender;
    String dob;
    String email;
   

    Guest(String u_id, String pwd, String fn, String ln, String g, String dob, String mail_id) {
        this.user_id = u_id;
        this.password = pwd;
        this.fname = fn;
        this.lname = ln;
        this.gender = g;
        this.dob = dob;
        this.email = mail_id;
    }

    void insert() {
        String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        String DB_URL = "jdbc:mysql://localhost:3306/speak_up";
        String un = "root";
        String pwd = "password";
        Boolean flag = false;
        Connection conn = null;
        Statement stmt = null;
        try {
            try {
                Class.forName(JDBC_DRIVER);
            } catch (Exception e) {
                System.out.println(e);
            }
            conn = DriverManager.getConnection(DB_URL, un, pwd);
            stmt = conn.createStatement();
            String sql = "insert into usermaster values('" + this.user_id + "','" + this.password + "','" + this.fname + "','" + this.lname + "'," + this.gender + ",'" + this.dob + "','" + this.email + "',null,0,0,0)";
            int v = stmt.executeUpdate(sql);
            conn.commit();
            if (v != 0) {
                flag = true;
            }

        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            //finally block used to close resources
            try {
                if (stmt != null) {
                    conn.close();

                }
            } catch (SQLException se) {

                se.printStackTrace();
            }// do nothing
            try {
                if (conn != null) {
                    conn.close();

                }
            } catch (SQLException se) {

                se.printStackTrace();
            }//end finally try
        }

    }

}
