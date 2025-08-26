package Demo;
import java.sql.*;

public class jdbc {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

//        7 steps to follow
//        import package
//        load and register
//        create connection
//        create statement
//        execute
//        process result
//        close


        int sid =101;
        int marks =48;
        String sname="Max";


        String url="jdbc:postgresql://localhost:5432/first";
        String uname="postgres";
        String pass ="1234";

        // done in sql
       // String sql = "select * from student";

//       // String sql = "insert into student values ( 6, 89,'Niharika')"; //insert
         // String sql = "update student set sname ='Max' where  sid =5"; //update
        //String sql = "delete from student where sid =5"; //delete

        String sql = "insert into student values(?,?,?)";

        //String sql = "select sname from student where sid=2";---> will give false as there is no value in in 2
        //load & register
       // Class.forName("org.postgresql.Driver");

        //create connection

        Connection con = DriverManager.getConnection(url,uname,pass);
        System.out.println("Connection Established");
        //Statement st = con.createStatement();

        PreparedStatement st = con.prepareStatement(sql);
        st.setInt(1,sid);
        st.setInt(2,marks);
        st.setString(3,sname);

        //when u have where clause use prepare statement


//        boolean status = st.execute(sql);
//        System.out.println(status);

        //System.out.println(rs.next()); //bolean value as a response
        //true means u got some data

//        rs.next(); //go to first record
//
//        String name = rs.getString("sname");
//        System.out.println("name is " + name);

//
//        while(rs.next())
//        {
//            System.out.print(rs.getInt(1) + " - ");
//            System.out.print(rs.getInt(2) + " - ");
//            System.out.println(rs.getString(3));
//
//        }

        //crud operation---create insert update delete

        con.close();
        System.out.println("Conncetion closed");



    }
}
