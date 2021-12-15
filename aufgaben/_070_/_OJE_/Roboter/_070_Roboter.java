package aufgaben._070_._OJE_.Roboter;

public class _070_Roboter {

    /*
     * Roboter
     *
     * Wir haben folgende einfache Roboterklasse geschrieben:

        public class Roboter {
            private String name;
            protected Roboter(String name) { this.name = name;}
            public String getName() { return name; }
            public void setName(String name) { this.name = name; }
        }

     * Diese Klasse erfreut sich nun auf einmal weltweit großer Beliebtheit.
     * Wir haben allerdings ein Problem:
     * Die internationale Robotergewerkschaft konnte ein weltweites Verbot durchsetzen,
     * dass Roboter nicht mehr „Bernd” genannt werden dürfen.
     * Schreibe nun die Klasse so um,
     * dass Roboter automatisch „Herbert” genannt werden,
     * wenn jemand versucht, sie „Bernd” zu taufen
     * oder versucht den Roboter in „Bernd” umzubenennen.
     * Eine Test-Klasse könnte so aussehen:

        public class RoboterTest {
            public static void main(String[] args) {
                Roboter x = new Roboter("Herbert");
                Roboter y = new Roboter("Bernd");
                System.out.println(x.getName() + " und " + y.getName());
            }
        }

     * Für die Benutzer der Klasse darf sich natürlich nichts ändern
     * Nur muss jetzt zweimal "Herbert" ausgegeben werden.
     *
     * Bitte auch das Umbenennen testen:
     * Nach dem Versuch, einen Roboter in „Bernd” umzubenennen,
     * muss dieser Roboter „Herbert” heissen.
     */

    // Bitte als Ordner (mir angefügtem Namen) mit drei Dateien abgeben: RoboterAufgabe, Roboter, RoboterTest
}
