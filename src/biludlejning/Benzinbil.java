package biludlejning;

public class Benzinbil extends Bil {
    
    private int oktantal;
    private double kmPrl;
    
    public Benzinbil(String regNr, String mærke, String model, int årgang, int antalDøre, int oktantal, double kmPrl){
        
    super(regNr,mærke,model,årgang,antalDøre);
    this.oktantal=oktantal;
    this.kmPrl=kmPrl;
    
    }

    public int getOktantal() {
        return oktantal;
    }

    public void setOktantal(int oktantal) {
        this.oktantal = oktantal;
    }

    public double getKmPrl() {
        return kmPrl;
    }
//Et styks kommentar
    public void setKmPrl(int kmPrl) {
        this.kmPrl = kmPrl;
    }

    @Override
    public String toString() {
        return "Benzinbil: " + super.getMærke() + ", " + super.getModel() + ", årgang " + super.getÅrgang() + " km/l: " + kmPrl;
    }

    @Override
    public double beregnGrønEjerAfgift() {
        double result = 0.0;
        if (kmPrl<5)
            result=10470;
        else if (kmPrl<10)
            result=5500;
        else if (kmPrl<15)
            result=2340;
        else if (kmPrl<20)
            result=1050;
        else
            result=330;
                
        return result;
    }
    
    
    
}