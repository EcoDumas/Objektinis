import com.paveldejimas.bazine.Transportas;
import com.paveldejimas.bazine.TransportasImpl;
import com.paveldejimas.isvestine.Automobilis;
import com.paveldejimas.isvestine.AutomobilisImpl;

public class Main {

    public static void main(String[] args) {

        TransportasImpl pirmas = new TransportasImpl("oro", true, 2010);
        TransportasImpl antras = new TransportasImpl("vandens", false, 2011);
        TransportasImpl trecias = new TransportasImpl("sausumos", true, 1999);
        TransportasImpl ketvirtas = new TransportasImpl("oro", true, 2008);
        TransportasImpl penktas = new TransportasImpl("sausumos", true, 2000);

        AutomobilisImpl sestas = new AutomobilisImpl("oro", false, 2018, "BMW", 5, false);
        AutomobilisImpl septintas = new AutomobilisImpl("sausumos", true, 2015, "AUDI", 4, true);
        AutomobilisImpl astuntas = new AutomobilisImpl("vandens", true, 2019, "MERCEDES", 5, true);
        AutomobilisImpl devintas = new AutomobilisImpl("sausumos", true, 2020, "FORD", 3, true);
        AutomobilisImpl desimtas = new AutomobilisImpl("oro", false, 2022, "TOYOTA", 8, false);


       // System.out.println(sestas);

        TransportasImpl[] sarasas = {pirmas, antras, trecias, ketvirtas, penktas, sestas, septintas, astuntas, devintas, desimtas};

        

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

