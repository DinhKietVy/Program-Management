import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class danhsachsinhvien {
    private ArrayList<sinhvien> danhsach;

    public danhsachsinhvien(ArrayList<sinhvien> danhsach) {
        this.danhsach = danhsach;
    }

    public danhsachsinhvien() {
        this.danhsach = new ArrayList<sinhvien>();
    }
    public void themsinhvien(sinhvien sv) {
        this.danhsach.add(sv);
    }
    public void display() {
        for (sinhvien sinhvien : danhsach) {
            System.out.println(sinhvien.toString());
        }
    }
    public boolean check() {
        return this.danhsach.isEmpty();
    }
    public int soluong() {
        return this.danhsach.size();
    }
    public void lamrong() {
        danhsach.removeAll(danhsach);
    }
    public boolean kiemtratontai(sinhvien sv) {
         return this.danhsach.contains(sv);
    }
    public boolean xoasv(sinhvien sv) {
        return this.danhsach.remove(sv);
    }
    public void timsv(String name) {
        for (sinhvien sinhvien : danhsach) {
            if(sinhvien.getTen().indexOf(name)>=0) {
                System.out.println(sinhvien);
            }
        }
    }
    public void sapxep() {
        Collections.sort(this.danhsach, new Comparator<sinhvien>() {

            @Override
            public int compare(sinhvien o1, sinhvien o2) {
                if(o1.getDiemtb()<o2.getDiemtb()) {
                    return 1;
                }
                else if(o1.getDiemtb()>o2.getDiemtb()){
                    return -1;
                }
                else return 0;
            }   
            
        });
    }
}
