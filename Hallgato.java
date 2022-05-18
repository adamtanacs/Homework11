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
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Hallgato)) {
            return false;
        }
        Hallgato tmp = (Hallgato) obj;
        if (tmp.nev == nev && tmp.szuletesiEv == szuletesiEv) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 1;
        hash = hash + (nev == null ? 0 : nev.hashCode());
        hash = hash + szuletesiEv;
        return hash;
    }
}