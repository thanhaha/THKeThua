package thkethua;
public class SVIT extends SV{
// Attribute
    private float lapTrinhJava, csdl;
// Constructor
    public SVIT(){}
    public SVIT(String maSV, String hoTen, int namSinh, String khoa, float tiengAnh,
            float lapTrinhJava, float csdl ){
        super( maSV, hoTen, namSinh, khoa,tiengAnh);
        this.csdl=csdl;
        this.lapTrinhJava=lapTrinhJava;
        setKhoa("CNTT");
    }
// set-get
    void setLapTrinhJava(float lapTrinhJava){ this.lapTrinhJava=lapTrinhJava;}
    float getLapTrinhJava(){return this.lapTrinhJava;}
    
    void setCSDL(float csdl){ this.csdl=csdl;}
    float getCSDL(){return this.csdl;}
    
// Tinh diem 
    float TinhDiem(){
        float d=0;
        d=(getTiengAnh()+this.csdl+this.lapTrinhJava)/3;
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
