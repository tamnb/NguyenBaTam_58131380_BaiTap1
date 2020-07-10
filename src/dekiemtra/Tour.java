/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dekiemtra;

import java.util.ArrayList;

/**
 *
 * @author FPT_2-4
 */
public class Tour {
    String tenTour,giaTour,thoiGian;
    ArrayList<ThamQuan> thamquan = new ArrayList();
    
    public Tour() {
    }
    public Tour(Builder builder)
    {
        this.tenTour = builder.tenTour;
        this.giaTour = builder.giaTour;
        this.thoiGian = builder.thoiGian;
        this.thamquan = builder.thamquan;
    }

    public String hienThi() {
        return "Tour{" + "tenTour=" + tenTour + ", giaTour=" + giaTour + ", thoiGian=" + thoiGian + ", thamquan=" + thamquan + '}';
    }
    
    public static class Builder
    {
        String tenTour,giaTour,thoiGian;
        ArrayList<ThamQuan> thamquan = new ArrayList();
        
//        private static Builder instance = new Builder();
         protected static Builder instance;
         public static Builder getInstance()
         {
             if (instance == null)
                 instance =  new Builder();
             return instance;
         }
         
        
        public Builder addTour(ThamQuan thamquan)
        {
            instance.thamquan.add(thamquan);
            return instance;
        }
        
         public Builder addThongTin(String tenTour,String giaTour,String thoiGian){
             instance.tenTour = tenTour;
             instance.giaTour = giaTour;
             instance.thoiGian = thoiGian;
             return instance;
         }
         public Tour build()
         {
             return new Tour(instance);
         }
    }
}
