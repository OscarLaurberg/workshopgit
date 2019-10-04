package biludlejning;

public class Elbil extends Bil {

    private double batteriKapacitetKWh;
    private int maxKm;
    private double whPrKm;
    private final double DIVISIONSFAKTOR=91.25;

    public Elbil(String regNr, String mærke, String model, int årgang, int antalDøre, double batteriKapacitetKWh, int maxKm, double whPrKm) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.batteriKapacitetKWh = batteriKapacitetKWh;
        this.maxKm = maxKm;
        this.whPrKm = whPrKm;

    }

    public double getBatteriKapacitetKWh() {
        return batteriKapacitetKWh;
    }

    public void setBatteriKapacitetKWh(int batteriKapacitetKWh) {
        this.batteriKapacitetKWh = batteriKapacitetKWh;
    }

    public int getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public double getWhPrKm() {
        return whPrKm;
    }

    public void setWhPrKm(int whPrKm) {
        this.whPrKm = whPrKm;
    }

    @Override
    public String toString() {
        return "Elbil: " + super.getMærke() + ", " + super.getModel()+ ", årgang " + super.getÅrgang() + ", WH/km: " + whPrKm;
    }

    @Override
    public double beregnGrønEjerAfgift() {
        double result = 0.0;
        double kmPrl=omregnWhPrKmTilKmPrL();
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
    private double omregnWhPrKmTilKmPrL(){
        double temp = whPrKm/DIVISIONSFAKTOR;
        return 100/temp;
        
    }
}
