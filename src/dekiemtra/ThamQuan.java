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
public class ThamQuan {
     String tenDiaDiem,viTri;

    public ThamQuan(String tenDiaDiem, String viTri) {
        this.tenDiaDiem = tenDiaDiem;
        this.viTri = viTri;
    }

    @Override
    public String toString() {
        return "ThamQuan{" + "tenDiaDiem=" + tenDiaDiem + ", viTri=" + viTri + '}';
    }
     
}
