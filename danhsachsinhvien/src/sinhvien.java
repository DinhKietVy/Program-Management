public class sinhvien  {
    private String masv;
    private String ten;
    private int namsinh;
    private float diemtb;
    public sinhvien(String masv) {
        this.masv=masv;
    }
    public sinhvien(String masv, String ten, int namsinh, float diemtb) {
        this.masv = masv;
        this.ten = ten;
        this.namsinh = namsinh;
        this.diemtb = diemtb;
    }
    public String getMasv() {
        return masv;
    }
    public void setMasv(String masv) {
        this.masv = masv;
    }
    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    public int getNamsinh() {
        return namsinh;
    }
    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }
    public float getDiemtb() {
        return diemtb;
    }
    public void setDiemtb(float diemtb) {
        this.diemtb = diemtb;
    }
    @Override
    public String toString() {
        return "sinhvien [masv=" + masv + ", ten=" + ten + ", namsinh=" + namsinh + ", diemtb=" + diemtb + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((masv == null) ? 0 : masv.hashCode());
        result = prime * result + ((ten == null) ? 0 : ten.hashCode());
        result = prime * result + namsinh;
        result = prime * result + Float.floatToIntBits(diemtb);
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        sinhvien other = (sinhvien) obj;
        if (masv == null) {
            if (other.masv != null)
                return false;
        } else if (!masv.equals(other.masv))
            return false;
        return true;
    }

    
}
