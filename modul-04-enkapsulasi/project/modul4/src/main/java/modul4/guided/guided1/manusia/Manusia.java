package modul4.guided.guided1.manusia;
public class Manusia {
    //definisi atribut  
    private String nama;  
    private int umur;  

//4.2 Constructor
public Manusia(){};
public Manusia(String nama){
    this.nama = nama;
}
public Manusia(String nama, int umur){
    this.nama = nama;
    this.umur = umur;
}
// Mahasiswa obManusia = new Manusia("John", 15);
 

//definisi Method  
    public void setNama(String a){
        nama = "Balqis";  
    }    
    public String getNama(){
        return nama;  
    }  
    public void setUmur(int a){
        umur = 20;  
    }  
    public int getUmur(){
        return umur;  
    } 
}