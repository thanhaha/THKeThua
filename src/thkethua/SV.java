package thkethua;
public class SV {
// Attribute
    private String maSV, hoTen, khoa;
    private int namSinh;
    private float tiengAnh; // diem tieng Anh
    
// Constructor
    public SV(){    
    }
    public SV(String maSV, String hoTen, int namSinh, String khoa, float tiengAnh){
        this.hoTen=hoTen;
        this.maSV=maSV;
        this.khoa=khoa;
        this.namSinh=namSinh;
        this.tiengAnh=tiengAnh;
    }
    
// set-get
    void setMaSV(String maSV){ this.maSV=maSV;}
    String getMaSV(){return this.maSV;}
    
    void setHoTen(String TenSV){ this.hoTen=hoTen;}
    String getHoTen(){return this.hoTen;}
    
    void setKhoa(String khoa){ this.khoa=khoa;}
    String getKhoa(){return this.khoa;}
    
    void setNamSinh(int namSinh){ this.namSinh=namSinh;}
    int getNamSinh(){return this.namSinh;}
    
    void setTienAnh(float tiengAnh){ this.tiengAnh=tiengAnh;}
    float getTiengAnh(){return this.tiengAnh;}
}
