package biludlejning;
import java.util.ArrayList;

public class Garage implements IGarage {
    
    private ArrayList <Bil> garage = new ArrayList <Bil>();
    private String navn;
    public Garage (String navn){
        this.navn=navn;
    }
    @Override
    public void parkerBil (Bil bil){
        garage.add(bil);
    }

    @Override
    public void afskafBil(Bil bil){
        garage.remove(bil);
    }
        
    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }
    
        @Override
    public String toString() {
        String result ="";
        for (int i=0; i < garage.size(); i++){
            result+=garage.get(i).toString()+"\n";
        }
        return result;
        
}
    public double beregnGrønAfgiftForBilPark(){
            double result = 0;
        for (int i=0; i < garage.size(); i++){
            result+=garage.get(i).beregnGrønEjerAfgift();
        }
        return result;
}

}