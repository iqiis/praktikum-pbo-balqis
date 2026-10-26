package modul6.guided.gd2;

public class Manager extends Employee{
    private String alamat;

    public Manager(String name, String alamat) {
        super(name);
        this.alamat = alamat;
    }

    public void tampilInformasi() {
        super.tampilName();
        System.out.println("Alamat : " + alamat);
        System.out.println("Departemen : " + super.department);
    }
}
