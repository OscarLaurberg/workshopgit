package biludlejning;

public class Dieselbil extends Bil {

    private double kmPrl;
    private boolean harPartikelFilter;

    public Dieselbil(String regNr, String mærke, String model, int årgang, int antalDøre, double kmPrl, boolean harPartikelFilter) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.kmPrl = kmPrl;
        this.harPartikelFilter = harPartikelFilter;

    }

    public double getKmPrl() {
        return kmPrl;
    }

    public void setKmPrl(int kmPrl) {
        this.kmPrl = kmPrl;
    }

    public boolean isHarPartikelFilter() {
        return harPartikelFilter;
    }

    public void setHarPartikelFilter(boolean harPartikelFilter) {
        this.harPartikelFilter = harPartikelFilter;
    }

    @Override
    public String toString() {
        return "Dieselbil: " + super.getMærke() + ", " + super.getModel() + ", " + super.getÅrgang() + ". Km/l: " + kmPrl+  " Partikelfilter: " + harPartikelFilter;
    }

    @Override
    public double beregnGrønEjerAfgift() {
            double result = 0.0;
        if (kmPrl<5)
            result=10470+15260;
        else if (kmPrl<10)
            result=5500+2770;
        else if (kmPrl<15)
            result=2340+1850;
        else if (kmPrl<20)
            result=1050+1390;
        else
            result=330+130;
        if (!harPartikelFilter)
            result+=1000;
        return result;
    }

}
