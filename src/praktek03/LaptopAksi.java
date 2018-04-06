package praktek03;
public class LaptopAksi {
    public static void main(String[] args) {
        Laptop R = new Laptop();
      
        R.setMerk("ASUS");
        R.setWarna("HITAM");
        R.setHarga(5000000);
        
        R.cetakinfo();
        
        System.out.print("Merknya \t: ");
        System.out.println(R.getMerk());
        System.out.print("Warnanya \t: ");
        System.out.println(R.getWarna());
        System.out.print("Harganya \t: ");
        System.out.println(R.getHarga());
    }
}
