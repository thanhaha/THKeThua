
package thkethua;


public class THKeThua {

 
    public static void main(String[] args) {
        // khai bao doi tuong SV IT 
        SVIT sv1 = new SVIT("001","Nguyen Van Anh",2000, "CNTT",
                6,9,9);
        System.out.println(sv1.ToString());
        
        // khai bao doi tuong SV Oto
        SVOto sv2 = new SVOto("002","Tran Ngoc Minh",2023, "Oto",
                6,9,9);
        System.out.println(sv2.ToString());
        
    }
    
}
