import com.paveldejimas.bazine.Transportas;
import com.paveldejimas.bazine.TransportasImpl;
import com.paveldejimas.isvestine.Automobilis;
import com.paveldejimas.isvestine.AutomobilisImpl;

public class Main {

    public static void main(String[] args) {

        TransportasImpl pirmas = new TransportasImpl("vandens", true, 2010);
        TransportasImpl antras = new TransportasImpl("oro", false, 2011);
        TransportasImpl trecias = new TransportasImpl("sausumos", true, 1999);
        TransportasImpl ketvirtas = new TransportasImpl("vandens", true, 2008);
        TransportasImpl penktas = new TransportasImpl("sausumos", true, 2000);

        AutomobilisImpl sestas = new AutomobilisImpl("oro", false, 2018, "Audi", 5, false);
        AutomobilisImpl sept = new AutomobilisImpl("sausumos", true, 2015, "Mercedes", 4, true);
        AutomobilisImpl astuoni = new AutomobilisImpl("vandens", true, 2019, "Lada", 5, true);
        AutomobilisImpl devini = new AutomobilisImpl("sausumos", true, 2020, "Peugeot", 3, true);
        AutomobilisImpl desimt = new AutomobilisImpl("oro", false, 2022, "Nezinomas", 8, false);


       // System.out.println(sestas);

        TransportasImpl[] sarasas = {pirmas, antras, trecias, ketvirtas, penktas, sestas, sept, astuoni, devini, desimt};


        //boolean result = true;

        for(TransportasImpl varyklis : sarasas) {
           if (varyklis instanceof AutomobilisImpl){
               //AutomobilisImpl = (AutomobilisImpl) varyklis;
              if (((AutomobilisImpl) varyklis).getVaromElektra() == (true)){
                   System.out.println("Sitas automobilis varomas Elektra - " + "Tipas: " + varyklis.getTipas() + ", "
                           +"Metai: " + varyklis.getPagaminMetai() + ", " + "Marke: " + ((AutomobilisImpl) varyklis).getMarke()
                           + ", " + ((AutomobilisImpl) varyklis).getDuruSk() + " duru");
                }
            }
       }
   }
}

