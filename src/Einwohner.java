
// Eine abstrakte Klasse Einwohner, die als Basis für verschiedene Einwohnertypen dient
public abstract class Einwohner {
    protected String name;
    protected int einkommen;

    public Einwohner(String name, int einkommen) {
        this.name = name;
        this.einkommen = einkommen;
    }

    public int getEinkommen() {
        return einkommen;
    }

    public String getName() {
        return name;
    }

    // Eine abstrakte Methode, die von den Unterklassen implementiert werden muss,
    // um das zu versteuernde Einkommen zu berechnen
    public abstract int zuVersteuern();

    // Eine abstrakte Methode, die von den Unterklassen implementiert werden muss,
    // um die Steuer zu berechnen
    public abstract int steuer();
}



