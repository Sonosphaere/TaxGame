//Adel erbt von Einwohner
public class Adel extends Einwohner {

    public Adel(String name, int einkommen) {
        super(name, einkommen);
    }

    @Override
    public int zuVersteuern() {
        // Adelige zahlen keine Steuern, daher wird das gesamte Einkommen zurückgegeben
        return getEinkommen();
    }

    @Override
    public int steuer() {
        // Adelige zahlen keine Steuern, daher wird immer 0 zurückgegeben
        return 0;
    }
}
