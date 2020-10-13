public class Ansatt {
    private String fornavn;
    private String etternavn;

    public Ansatt (String fornavn, String etternavn){
        this.fornavn = fornavn;
        this.etternavn = etternavn;

    }
    public void skrivUtFulltNavn(){
        System.out.println(this.fornavn+" "+this.etternavn+" er med i prosjektet");
    }
}
