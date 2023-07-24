//Leibeigen erbt von Einwohner
public class Leibeigen extends Einwohner {

    public Leibeigen(String name, int einkommen) {
        super(name, einkommen);
    }

    @Override
    public int zuVersteuern() {
        // Leibeigene zahlen keine Steuern, daher wird das gesamte Einkommen zurückgegeben
        return getEinkommen();
    }

    @Override
    public int steuer() {
        // Leibeigene zahlen keine Steuern, daher wird immer 0 zurückgegeben
        return 0;
    }
}

