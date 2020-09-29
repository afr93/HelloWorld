public class Main {
    public static void main(String[] args) {

        Ansatt[] ansatte = new Ansatt[]{

                new Ansatt("Astrid", "Fridtun"),
                new Ansatt("Anders", "Snellingen")

        };

        for (Ansatt a : ansatte) {
            a.skrivUtFulltNavn();
        }

    }
}
