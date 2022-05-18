public class Hallgato {

    private final String nev;
    private final int szuletesiEv;

    public Hallgato(String nev, int szuletesiEv) {
        this.nev = nev;
        this.szuletesiEv = szuletesiEv;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Hallgato)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        Hallgato tmp = (Hallgato) obj;
        if (tmp.nev == nev && tmp.szuletesiEv == szuletesiEv) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(nev,szuletesiEv);
    }
}