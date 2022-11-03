package Model; //靜態class


public class porder {
    //field
    private String name;
    private int lcd;
    private int ram;
    private int mouse;
    private int sum;
    private boolean discount=false;
    private String phoneNumber;

    public porder() {
    }//空建構式

    public porder(boolean discount) {
        this.discount=discount;
    }
    
    public porder(String phoneNumber,String name, int lcd, int ram, int mouse,boolean discount) {
       if(lcd>=0 && ram>=0 && mouse>=0)
        {
            this.name= name;
            this.lcd= lcd;
            this.ram= ram;
            this.mouse= mouse;
            this.phoneNumber=phoneNumber;
        this.discount=discount;
            if(discount)
            {
                    sum=(int)((lcd*4999+ram*1280+mouse*1099)*0.95);
            }
            else
                  {
                    sum= lcd*4999+ram*1280+mouse*1099;     
                  }
         }
    }
    
   public porder(String phoneNumber,String name, int lcd, int ram, int mouse) {
       if(lcd>=0 && ram>=0 && mouse>=0)
        {
            this.name= name;
            this.lcd= lcd;
            this.ram= ram;
            this.mouse= mouse;
            this.phoneNumber=phoneNumber;
            
            sum= lcd*4999+ram*1280+mouse*1099;     
           
         }
    }
    

    
    public  String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLcd() {
        return lcd;
    }

    public void setLcd(int lcd) {
        this.lcd = lcd;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getMouse() {
        return mouse;
    }

    public void setMouse(int mouse) {
        this.mouse = mouse;
    }

    public int getSum() {
         if(discount)
            {
                    sum=(int)((lcd*4999+ram*1280+mouse*1099)*0.95);
            }
            else
                  {
                    sum= lcd*4999+ram*1280+mouse*1099;     
                  }
        return sum;
    }

    public boolean isDiscount() {
        return discount;
    }

    public void setDiscount(boolean discount) {
        this.discount = discount;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
   
    
}
