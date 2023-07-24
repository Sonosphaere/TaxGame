import java.util.InputMismatchException;
import java.util.Scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    // Scanner-Objekt für die Eingabe (konstant, damit es nicht versehentlich geändert wird)
    public static final Scanner eingabe = new Scanner(System.in);

    public static void main(String[] args) {

        boolean abruch = false;
        // Start einer do-while-Schleife, die das Hauptmenü und die Benutzerinteraktion ausführt
        do {
            // Anzeige des Hauptmenüs
            System.out.println("Steuerberechnung des.... ");
            System.out.println("1. König");
            System.out.println("2. Adel");
            System.out.println("3. Bauer");
            System.out.println("4. Leibeigen");
            System.out.println("5. Beenden");

            int auswahl = 0;
            try {
                // Eingabe der Auswahl des Benutzers (es wird versucht, eine Zahl zu lesen)
                auswahl = eingabe.nextInt();
            } catch (InputMismatchException e) {
                // Fehlerbehandlung für den Fall, dass der Benutzer keine Zahl eingegeben hat
                System.out.println("Ungültige Eingabe. Bitte geben Sie eine Zahl ein.");
                eingabe.nextLine(); // Verbrauche die fehlerhafte Eingabe, um eine Endlosschleife zu vermeiden
                continue; // Springe zurück zum Anfang der Schleife, um erneute Eingabe zu ermöglichen
            }

            switch (auswahl) {
                case 1:
                    // Eingabe von Name und Einkommen für den König
                    System.out.println("Wie lautet der Name des Königs?");
                    String name = eingabe.next();
                    System.out.println("Wie hoch ist sein Verdienst?");
                    int einkommen = eingabe.nextInt();
                    // Erstellung eines Königs-Objekts mit den eingegebenen Daten
                    Einwohner koenig = new Koenig(name, einkommen);

                    // Die folgenden beiden Methodenaufrufe werden ignoriert, da die Rückgabewerte nicht verwendet werden.
                    // Stattdessen sollte das zu versteuernde Einkommen und die berechnete Steuer in Variablen gespeichert werden.
                    // koenig.zuVersteuern();
                    // koenig.steuer();

                    // Berechnung des zu versteuernden Einkommens und der Steuer für den König
                    int zuVersteuernEinkommenKoenig = koenig.zuVersteuern();
                    int steuerKoenig = koenig.steuer();

                    // Ausgabe der Steuerinformationen für den König
                    System.out.println("König " + name + " hat ein Einkommen von " + zuVersteuernEinkommenKoenig + " und zahlt " + steuerKoenig + " Taler.");
                    System.out.println();
                    break;
                // ... Restliche Fälle für Adel, Bauer und Leibeigen bleiben gleich ...

                case 2:
                    System.out.println("Wie lautet der Name des Adels?");
                    name = eingabe.next();
                    System.out.println("Wie hoch ist sein Verdienst?");
                    einkommen = eingabe.nextInt();
                    Einwohner adel = new Adel(name, einkommen);

                    int zuVersteuernEinkommenAdel = adel.zuVersteuern();
                    int steuerAdel = adel.steuer();

                    System.out.println("Adeliger " + name + " hat ein Einkommen von " + zuVersteuernEinkommenAdel + " und zahlt " + steuerAdel + " Taler.");
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Wie lautet der Name des Bauern?");
                    name = eingabe.next();
                    System.out.println("Wie hoch ist sein Verdienst?");
                    einkommen = eingabe.nextInt();
                    Einwohner bauer = new Bauer(name, einkommen);

                    int zuVersteuernEinkommenBauer = bauer.zuVersteuern();
                    int steuerBauer = bauer.steuer();

                    System.out.println("Bauer " + name + " hat ein Einkommen von " + zuVersteuernEinkommenBauer + " und zahlt " + steuerBauer + " Taler.");
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Wie lautet der Name des Leibeigenen?");
                    name = eingabe.next();
                    System.out.println("Wie hoch ist sein Verdienst?");
                    einkommen = eingabe.nextInt();
                    Einwohner leibeigen = new Leibeigen(name, einkommen);

                    int zuVersteuernEinkommenLeibeigen = leibeigen.zuVersteuern();
                    int steuerLeibeigen = leibeigen.steuer();

                    System.out.println("Leibeigener " + name + " hat ein Einkommen von " + zuVersteuernEinkommenLeibeigen + " und zahlt " + steuerLeibeigen + " Taler.");
                    System.out.println();
                    break;
                case 5:
                    // Beenden des Programms
                    System.out.println("Das Programm wird beendet");
                    System.out.println("Tschüss!!!!");
                    abruch = true; // Setze die Abbruch-Flagge auf true, um die Schleife zu beenden
                    break;
                default:
                    // Wenn der Benutzer eine ungültige Auswahl getroffen hat
                    System.out.println("Ungültige Auswahl. Bitte wählen Sie erneut.");
                    break;
            }

        } while (!abruch); // Schleife wird ausgeführt, solange die FLag nicht true ist

        // Nachdem die Schleife beendet ist, muss der Scanner schließen, um Ressourcen freizugeben.
        eingabe.close();
    }
}

