
package Dao.mms;

import Model.mms;


public interface mmsDao {
    //以下來看看要新增什麼 CRUD
    //以下都是抽象方法
    //把這邊當索引碼
    
    //Create新增
   void add(mms m);//因為後續可能要寫的變數內容會很多，所以直接寫入student物件
   
    //Read查詢
    String phoneCheck(String Number);//查ID
    String phoneCheck2(String Number);//查密碼
    String phoneCheck3(String Number);//查姓名
    String phoneCheck4(String Number);//查信箱
    String checkAll();
    boolean query(String phoneNumber,String password);//帳號密碼
    boolean query(String phoneNumber);//帳號重複
    
    //Update修改
    mms queryId(int id);//先查出來ID，透過ID來修改資料
    void update(mms m);//修改資料的方法
    
    //Delete刪除
    void delete(int id);
    
}
