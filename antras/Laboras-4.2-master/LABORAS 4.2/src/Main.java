import com.laboras.bazine.MoketojasImpl;
import com.laboras.isvestine.InternetasImpl;
import com.laboras.isvestine.SildymasImpl;
import com.laboras.isvestine.TelefonasImpl;

public class Main {

    public static void main(String[] args) {

        /*     int moketojoKodas, String vardas, String pavarde, String adresas, double suma +
                    + int telNuemris  /  String ip  /  double kubai
         */

        MoketojasImpl gedas = new MoketojasImpl(32101, "Gedas", "Gedaitis", "pievų g. 5", 0);
        MoketojasImpl rasa = new MoketojasImpl(32102, "Rasa", "Rasaitė", "Rytų g. 14", 0);
        MoketojasImpl linas = new MoketojasImpl(32103, "Linas", "Linaitis", "Vakarų g 65", 0);

        TelefonasImpl ieva = new TelefonasImpl(32104, "Ieva", "Ievaitė", "Šiaurės pr, 84", 12.99, 861234567);
        TelefonasImpl jonas = new TelefonasImpl(32105, "Jonas", "Jonaitis", "Laisvės al. 33", 10.99, 867654321);
        TelefonasImpl toma = new TelefonasImpl(32106, "Toma", "Tomaitė", "Savanorių pr 176", 11.99, 861236548);

        InternetasImpl vytautas = new InternetasImpl(32107, "Vytautas", "Vytautaitis", "Plechavičiaus 43", 7.49, "1.1.1.1");
        InternetasImpl giedre = new InternetasImpl(32108, "Giedrė", "Giedraitė", "Baranausko g 52", 12.49, "2.2.2.2");
        InternetasImpl kazys = new InternetasImpl(32109, "Kazys", "Kazaitis", "Kuopų g 13", 14.99, "3.3.3.3");

        SildymasImpl aldona = new SildymasImpl(32110, "Aldona", "Aldonaitė", "Taikos pr. 18", 40.20, 60.52);
        SildymasImpl petras = new SildymasImpl(32111, "Petras", "Petraitis", "Vingių g 11", 50.30, 70.93);
        SildymasImpl zita = new SildymasImpl(32112, "Zita", "Zitienė", "Mituvos g. 5", 45.40, 65.47);

        MoketojasImpl sarasas[] = new MoketojasImpl[12];

        sarasas[0] = gedas;
        sarasas[1] = rasa;
        sarasas[2] = linas;
        sarasas[3] = ieva;
        sarasas[4] = jonas;
        sarasas[5] = toma;
        sarasas[6] = vytautas;
        sarasas[7] = giedre;
        sarasas[8] = kazys;
        sarasas[9] = aldona;
        sarasas[10] = petras;
        sarasas[11] = zita;

        double mokestisInternetas = 0;
        double mokestisTelefonas = 0;
        double mokestisBendras = 0;

        for (MoketojasImpl saskaita : sarasas) {
            if (saskaita instanceof TelefonasImpl) {
                TelefonasImpl telefonas = (TelefonasImpl) saskaita;
                mokestisTelefonas = mokestisTelefonas + telefonas.getSuma();
            }
            if (saskaita instanceof InternetasImpl) {
                InternetasImpl internetas = (InternetasImpl) saskaita;
                mokestisInternetas = mokestisInternetas + internetas.getSuma();
            }
        }
        System.out.println("Bendra vartotojų už telefono paslaugas suma: " + mokestisTelefonas + "€.");
        System.out.println("Bendra vartotojų už interneto paslaugas suma: " + mokestisInternetas + "€.");
        mokestisBendras = mokestisInternetas + mokestisTelefonas;
        System.out.println("Iš viso mokėti už telefono ir interneto paslaugas: " + mokestisBendras + "€.");
    }
}
