public class Sedzia extends Osoba{
    Sedzia(String i, String n){
        super(i,n);
    }
    public Sedzia(Sedzia s) {
        super(s);
    }
    public String toString(){
        return imie+" "+nazwisko;
    }
}
