
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class QueryProcessor {
    
    String emotion;
    String tag;
    String result;
    QueryProcessor(String e , String t)
    {
        this.emotion=e;
        this.tag=t;
    }
    String[] search() throws ClassNotFoundException, SQLException
    {
        String connectionURL = "jdbc:mysql://localhost:3306/speak_up";
        Connection con;
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(connectionURL, "root", "password");
        Statement st=con.createStatement();
        String sql;
        if(this.tag==null)
            sql = "select main.sen_id , sentence from main join labels on main.emotion = labels.emotion and main.sen_id = labels.sen_id where main.emotion = '" + this.emotion + "' order by rand() limit 1";
        else
            sql = "select main.sen_id , sentence from main join labels on main.emotion = labels.emotion and main.sen_id = labels.sen_id where main.emotion = '" + this.emotion + "' and tag = '" + this.tag + "' order by rand() limit 1";
        ResultSet rs = st.executeQuery(sql);
        String res[] = new String[2];
        if(rs.next())
        {
            
            res[0]=rs.getString("sentence");
            res[1]=rs.getString("sen_id");
            sql = "update emotions set hits = hits + 1 where emotion='" + this.emotion + "'";
            st.executeUpdate(sql);
            return res;
        }
        
            
        else
            return null;
        
    }
}
