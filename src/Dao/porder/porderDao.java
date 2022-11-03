package Dao.porder;

import Model.porder;
/**
 *
 * @author hijus
 */
public interface porderDao {
    
    String show1(porder p);//原價購買的計算(含明細) 或 優惠價購買的計算(含明細)
    String show2(porder p);//get原價or優惠價總金額 
     
     //Create新增
   void add(porder p);
   
   //Read查詢
   String checkAllOrder();
    
}
