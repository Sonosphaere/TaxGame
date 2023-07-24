// König erbt von Einwohner
public class Koenig extends Einwohner {

    // Konstruktor der König-Klasse
    public Koenig(String name, int einkommen) {
        super(name, einkommen);
    }

    // Überschriebene Methode für König, um das zu versteuernde Einkommen zu berechnen
    @Override
    public int zuVersteuern() {
        // Könige zahlen keine Steuern, daher wird das gesamte Einkommen zurückgegeben
        return getEinkommen();
    }

    // Überschriebene Methode für König, um die Steuer zu berechnen
    @Override
    public int steuer() {
        // Könige zahlen keine Steuern, daher wird immer 0 zurückgegeben
        return 0;
    }
}
