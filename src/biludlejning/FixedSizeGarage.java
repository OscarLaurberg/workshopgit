package biludlejning;


public class FixedSizeGarage implements IGarage {
    private String navn;
    private Bil[] biler = new Bil[5];
    int count = 0;

    public FixedSizeGarage(String navn) {
        this.navn = navn;
    }

    @Override
    public void parkerBil(Bil bil) {
        biler[count++] = bil;
    }

    @Override
    public double beregnGrønAfgiftForBilPark() {
        return 0.0;
    }

    @Override
    public void afskafBil(Bil bil) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

        
    }





    
