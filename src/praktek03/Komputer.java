package praktek03;

public class Komputer extends Laptop{
    private String JenisKomputer;
    
    void throttle(){
        System.out.println(" R.O.G -Gaming-");
    }

    public String getJenisKomputer() {
        return JenisKomputer;
    }

    public void setJenisKomputer(String JenisKomputer) {
        this.JenisKomputer = JenisKomputer;
    }
 
    
}
