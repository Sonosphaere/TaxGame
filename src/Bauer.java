//Bauer erbt von Einwohner
public class Bauer extends Einwohner {

    public Bauer(String name, int einkommen) {
        super(name, einkommen);
    }

    @Override
    public int zuVersteuern() {
        // Bauern zahlen keine Steuern, daher wird das gesamte Einkommen zurückgegeben
        return getEinkommen();
    }

    @Override
    public int steuer() {
        // Bauern zahlen keine Steuern, daher wird immer 0 zurückgegeben
        return 0;
    }
}
