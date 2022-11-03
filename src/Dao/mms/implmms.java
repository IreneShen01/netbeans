
package Dao.mms;

import Dao.DbConnection;
import Model.mms;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hijus
 */
public class implmms implements mmsDao{

   
    public static void main(String[] args) {
        // 測試1新增是否成功
        //new implmss().add(new mms("2022/10/09","0900000001","5678","happy","5678@gmail.com","f","1999/02/01"));
        
        //測試2看是否可以查詢到ID
        //System.out.println(new implmss().phoneCheck("0911234334"));
        
        //測試查詢ID，等等跟修改資料做結合
        //System.out.println(new implmss().query1(4)); 
    }

    @Override
    public void add(mms m) {
        Connection conn=DbConnection.getDB();
        String sql="insert into memberlist(registrationDate,name,phoneNumber,password,email,birthday,gender) values(?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1, m.getRegistrationDate());
            ps.setString(2, m.getName());
            ps.setString(3, m.getPhoneNumber());
            ps.setString(4, m.getPassword());
            ps.setString(5, m.getEmail());
            ps.setString(6, m.getBirthday());
            ps.setString(7, m.getGender());
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(implmms.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String phoneCheck(String Number) {
        String show="";
        Connection conn=DbConnection.getDB();
        String Sql="select * from memberlist where phoneNumber=?";
        
        try {
            PreparedStatement ps=conn.prepareStatement(Sql);
            ps.setString(1,Number );
            
            ResultSet rs=ps.executeQuery();
            rs.next();
            show=""+rs.getInt("id");
            /*while(rs.next())
            {
            show=""+rs.getInt("id");
            }
            註：主要查找一個指定內容時，不用用while，讓他一直做喔！以下phoneCheck2~4都是一樣喔*/
        } catch (SQLException ex) {
            Logger.getLogger(implmms.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return show;
    }

    

    @Override
    public String phoneCheck2(String Number) {
        String show="";
        Connection conn=DbConnection.getDB();
        String Sql="select * from memberlist where phoneNumber=?";
        
        try {
            PreparedStatement ps=conn.prepareStatement(Sql);
            ps.setString(1,Number );
            
            ResultSet rs=ps.executeQuery();
           rs.next();
            show=""+rs.getString("password");
        } catch (SQLException ex) {
            Logger.getLogger(implmms.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return show;
    }

    @Override
    public String phoneCheck3(String Number) {
        String show="";
        Connection conn=DbConnection.getDB();
        String Sql="select * from memberlist where phoneNumber=?";
        
        try {
            PreparedStatement ps=conn.prepareStatement(Sql);
            ps.setString(1,Number );
            
            ResultSet rs=ps.executeQuery();
            rs.next();
            show=""+rs.getString("name");
        } catch (SQLException ex) {
            Logger.getLogger(implmms.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return show;
    }

    @Override
    public String phoneCheck4(String Number) {
        String show="";
        Connection conn=DbConnection.getDB();
        String Sql="select * from memberlist where phoneNumber=?";
        
        try {
            PreparedStatement ps=conn.prepareStatement(Sql);
            ps.setString(1,Number );
            
            ResultSet rs=ps.executeQuery();
            rs.next();
            show=""+rs.getString("email");

        } catch (SQLException ex) {
            Logger.getLogger(implmms.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return show;
    }
    
    @Override//要查詢ID+下一步驟修改資料
    public mms queryId(int id) {
        mms m=null;
        Connection conn=DbConnection.getDB();
        String Sql="select * from memberlist where id=?";
        try {
            PreparedStatement ps=conn.prepareStatement(Sql);
            ps.setInt(1,id);
            ResultSet rs=ps.executeQuery();
            if(rs.next())
            {
                m=new mms();
                m.setId(rs.getInt("id"));
                m.setPassword(rs.getString("password"));
                m.setName(rs.getString("name"));
                m.setEmail(rs.getString("email"));        
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(implmms.class.getName()).log(Level.SEVERE, null, ex);
        }       
        
        return m;
    }

    @Override
    public void update(mms m) {
        Connection conn=DbConnection.getDB();
       String sql="update memberlist set password=?,name=?,email=? where id=?";
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
           
            ps.setString(1, m.getPassword());
            ps.setString(2, m.getName());
            ps.setString(3, m.getEmail());
            ps.setInt(4,m.getId());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(implmms.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String checkAll() {
        String title="ID"+"\t註冊日"+"\t帳號"+"\t密碼"+"\t姓名"+"\t信箱"+"\t\t性別"+"\t生日\n";
       Connection conn=DbConnection.getDB();
       String sql="select * from memberlist";
       
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                title=title+rs.getInt("id")+
                "\t"+rs.getString("registrationDate")+
                "\t"+rs.getString("phoneNumber")+
                "\t"+rs.getString("password")+
                "\t"+rs.getString("name")+
                "\t"+rs.getString("email")+
                "\t"+rs.getString("gender")+
                "\t"+rs.getString("birthday")+"\n";
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(implmms.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       return title; 
    }

    @Override
    public void delete(int id) {
        Connection conn=DbConnection.getDB();
       String sql="delete from memberlist where id=?";
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setInt(1,id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(implmms.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override//查詢帳號密碼
    public boolean query(String phoneNumber, String password) {
         Connection conn=DbConnection.getDB();
        String sql="select* from memberlist where phoneNumber=? and password=?";
        boolean x=false;
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1,phoneNumber);
            ps.setString(2,password);
            ResultSet rs=ps.executeQuery();
            if(rs.next()) x=true;//先前會使用{}是因為有多行，目前只有一行，所以可以不用{}
            
        } catch (SQLException ex) {
            Logger.getLogger(implmms.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return x;
    }

    @Override//查詢帳號是否重複
    public boolean query(String phoneNumber) {
       Connection conn=DbConnection.getDB();
        String Sql="select * from memberlist where phoneNumber=?";
        boolean x=false;
        try {
            PreparedStatement ps=conn.prepareStatement(Sql);
            ps.setString(1, phoneNumber);
          
            ResultSet rs=ps.executeQuery();            
            if(rs.next()) x=true;
            
        } catch (SQLException ex) {
            Logger.getLogger(implmms.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return x;
    }
}
