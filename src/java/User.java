
//import java.sql.Date;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.*;

/**
 *
 * @author sai
 */
public class User {

    String user_id;
    String password;
    String fname;
    String lname;
    String gender;
    String dob;
    String email;
    int searches , comments , suggestions;

    User() {

    }

    User(String u_id, String pwd, String fn, String ln, String g, String dob, String mail_id) {
        this.user_id = u_id;
        this.password = pwd;
        this.fname = fn;
        this.lname = ln;
        this.gender = g;
        this.dob = dob;
        this.email = mail_id;
    }

    User(String u_id, String pwd) {
        this.user_id = u_id;
        this.password = pwd;
    }

   
    Boolean login() {
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
            String sql = "select * from usermaster where user_id='" + this.user_id + "'";
            String password = null;
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                password = rs.getString("password");
                if (password.equals(this.password)) {
                    this.fname = rs.getString("fname");
                    this.lname = rs.getString("lname");
                    this.email = rs.getString("email");
                    this.searches = rs.getInt("searches");
                    this.comments = rs.getInt("comments");
                    this.suggestions = rs.getInt("suggestions");
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }

        } catch (SQLException e) {
            return false;
            //e.printStackTrace();

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

    void update(String uname, String new_fname, String new_lname, String new_email, String new_password, InputStream is) throws FileNotFoundException {
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
            String sql = null;
            if (new_password.equals("")) {
                sql = "update usermaster set fname='" + new_fname + "',lname='" + new_lname + "',email='" + new_email + "' where user_id ='" + uname + "'";
            } else {
                sql = "update usermaster set fname='" + new_fname + "',lname='" + new_lname + "',email='" + new_email + "',password='" + new_password + "'where user_id ='" + uname + "'";
            }
            stmt.executeUpdate(sql);

            if (is != null) {
                // fetches input stream of the upload file for the blob column
                sql = "update usermaster set image = ? where user_id = ?";
                PreparedStatement statement = conn.prepareStatement(sql);
                statement.setBlob(1, is);
                statement.setString(2, uname);
                statement.executeUpdate();

            }


        } catch (SQLException e) {

            //e.printStackTrace();
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

                //se.printStackTrace();
            }//end finally try
        }

    }

}
