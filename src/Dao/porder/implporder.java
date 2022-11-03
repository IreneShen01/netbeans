package Dao.porder;

import Dao.DbConnection;
import Model.porder;
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
public class implporder implements porderDao{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 可以在此先測試看看以下方法的執行是否OK
        
    }

    @Override
    public String show1(porder p) {
        if(p.isDiscount())
        {
            return "購買明細"+
                "\n============================="+
                "\n購買人:"+p.getName()+
                "\nLCD液晶顯示器_數量:"+p.getLcd()+"\t金額:"+p.getLcd()*4999+
                "\n8G RAM記憶體_數量:"+p.getRam()+"\t金額:"+p.getRam()*1280+
                "\nUSB無線藍芽滑鼠_數量:"+p.getMouse()+"\t金額:"+p.getMouse()*1099+
                "\n============================="+
                "\n原價總額:NT$"+(p.getLcd()*4999+p.getRam()*1280+p.getMouse()*1099)+
                "\n折扣金額:NT$"+"-"+((p.getLcd()*4999+p.getRam()*1280+p.getMouse()*1099)-p.getSum())+
                "\n============================="+
                "\n優惠總額:NT$"+p.getSum();
        }
        else
        {
            return"購買明細"+
                "\n============================="+
                "\n購買人:"+p.getName()+
                "\nLCD液晶顯示器_數量:"+p.getLcd()+"\t金額:"+p.getLcd()*4999+
                "\n8G RAM記憶體_數量:"+p.getRam()+"\t金額:"+p.getRam()*1280+
                "\nUSB無線藍芽滑鼠_數量:"+p.getMouse()+"\t金額:"+p.getMouse()*1099+
                "\n============================="+
                "\n總額:NT$"+p.getSum();
        }       
    }

    @Override
    public String show2(porder p) {
        if(p.isDiscount())
        {
        return p.getSum()+"";
        }
        else
        {
        return p.getSum()+"";
        }
    }

    @Override
    public void add(porder p) {
        Connection conn=DbConnection.getDB();
        String sql="insert into porder(phoneNumber,name,lcd,ram,mouse,sum) values(?,?,?,?,?,?)";
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
             ps.setString(1, p.getPhoneNumber());
             ps.setString(2, p.getName());
             ps.setInt(3, p.getLcd());
             ps.setInt(4, p.getRam());
             ps.setInt(5, p.getMouse());
             ps.setInt(6, p.getSum());
             
             ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(implporder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String checkAllOrder() {
        String title="訂單編號"+"\t帳號"+"\t姓名"+"\tLcd數量"+"\tRam數量"+"\tMouse數量"+"\t總額\n";
       Connection conn=DbConnection.getDB();
       String sql="select * from porder";
       
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                title=title+rs.getInt("porderid")+
                "\t"+rs.getString("phoneNumber")+
                "\t"+rs.getString("name")+
                "\t"+rs.getInt("lcd")+
                "\t"+rs.getInt("ram")+
                "\t"+rs.getInt("mouse")+
                "\t"+rs.getInt("sum")+"\n";
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(implporder.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       return title; 
    }
    }
