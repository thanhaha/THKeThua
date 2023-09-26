package thkethua;
public class SVOto extends SV {
// Attribute
    private float veKyThuat, coKyThuat;
// Constructor
    public SVOto(){}
    public SVOto(String maSV, String hoTen, int namSinh, String khoa, float tiengAnh,
            float veKyThuat,float coKyThuat ){
        super(maSV, hoTen, namSinh, khoa,tiengAnh);
        this.veKyThuat=veKyThuat;
        this.coKyThuat=coKyThuat;
        setKhoa("Oto");
    }
// set-get
    void setVeKyThuat(float veKyThuat){ this.veKyThuat=veKyThuat;}
    float getVeKyThuat(){return this.veKyThuat;}
    
    void setCoKyThuat(float coKyThuat){ this.coKyThuat=coKyThuat;}
    float getCoKyThuat(){return this.coKyThuat;}
    
// Tinh diem 
    float TinhDiem(){
        float d=0;
        d=(getTiengAnh()+this.coKyThuat+this.veKyThuat)/3;
        return d;
    }
// ToString
    String ToString(){
        String show="";
        show = " * THONG TIN SINH VIEN * "+ 
                "\n + Ho va ten: "+ getHoTen() +
                "\n + Ma sinh vin: "+getMaSV() +
                "\n + Nam sinh: "+getNamSinh() + 
                "\n + Khoa: " + getKhoa() +
                "\n + Diem trung binh: " +TinhDiem();
        return show;
    }
}
