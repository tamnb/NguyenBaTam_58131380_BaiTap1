/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dekiemtra;

/**
 *
 * @author FPT_2-4
 */
public class DeKiemTra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         ThamQuan thamQuan1 = new ThamQuan("Nha Trang", "012");
        ThamQuan thamQuan2 = new ThamQuan("Nha Trang", "012");
        ThamQuan thamQuan3 = new ThamQuan("Sai gon", "012");
        
        Tour tour = new Tour.Builder().getInstance()
                .addThongTin("A", "13", "09/07/2020")
                .addTour(thamQuan1)
                .addTour(thamQuan2)
                .addTour(thamQuan3)
                .build();
        Tour tour2 = new Tour.Builder().getInstance()
                .addThongTin("B", "13", "09/07/2020")
                .addTour(thamQuan1)
                .addTour(thamQuan2)
                .addTour(thamQuan3)
                .build();
        Tour tour3 = new Tour.Builder().getInstance()
                .addThongTin("C", "13", "09/07/2020")
                .addTour(thamQuan1)
                .addTour(thamQuan2)
                .addTour(thamQuan3)
                .build();
        Tour tour1 = new Tour.Builder().build();

                
        System.out.println(tour.hienThi());
        System.out.println(tour2.hienThi());
        System.out.println(tour1.hienThi());
        
    }
    
}
