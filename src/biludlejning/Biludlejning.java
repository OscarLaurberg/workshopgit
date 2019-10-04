package biludlejning;

public class Biludlejning {

    public static void main(String[] args) {
        //Vi opretter vores garage objekt:
       IGarage garage = new FixedSizeGarage("Garage");
               
        //Vi opretter vores bilobjekter
        Benzinbil c5 = new Benzinbil("YY49529", "Citröen", "C5", 2002, 5, 95, 12.6);
        Benzinbil a7 = new Benzinbil("CB59565", "Audi", "A7", 2018, 5, 95, 8.4);
        Dieselbil panda = new Dieselbil("AD56884", "Fiat", "Panda", 2007, 5, 18.6, false);
        Dieselbil vito = new Dieselbil("QQ65895", "Mercedes", "Vito", 2018, 5, 16.1, true);
        Elbil modelS = new Elbil("HJ56874", "Tesla", "Model S", 2015, 5, 85, 426, 206);
        Elbil eUp = new Elbil("BF63541", "Volkswagen", "E-up!", 2016, 5, 18.7, 120, 117);

        //Var indsætter vores bilobjekter i vores garage ArrayList
        garage.parkerBil(c5);
        garage.parkerBil(a7);
        garage.parkerBil(panda);
        garage.parkerBil(vito);
       // garage.parkerBil(modelS);
       // garage.parkerBil(eUp);
        //Vi udskriver nu vores ArrayList - vi udskriver ikke alle informationerne om bilerne, kun dem så vi har fundet nødvendige.
        //Vi kan altid ændre det i vores toString metode(r), hvis vi finder det nødvendigt at udskrive ex. oktantal eller antalbildøre
        System.out.println("Biler i vores garage: ");
        System.out.println(garage);

        System.out.println("Vores samlede grønafgift for hele vores bilpark i DKK:");
        System.out.println(garage.beregnGrønAfgiftForBilPark());
        System.out.println("Grundet høje omkostninger har vi solgt vores dyre A7 og skrottet vores gamle Panda.");
        /*garage.afskafBil(a7);
        garage.afskafBil(panda);
        System.out.println("Vores samlede grønafgift for hele vores bilpark er nu DKK:");
        System.out.println(garage.beregnGrønAfgiftForBilPark());*/
    }

}

