public class Hallgato {

    private final String nev;
    private final int szuletesiEv;

    public Hallgato(String nev, int szuletesiEv) {
        this.nev = nev;
        this.szuletesiEv = szuletesiEv;
    }

    // @Override
    // public boolean equals(Object obj) {
    // if (obj == null) {
    // return false;
    // }
    // if (obj.nev == nev && obj.szuletesiEv == szuletesiEv)
    // {
    // return true;
    // }
    // return false;
    // }

    @Override
    public int hashCode() {
        int hash = 1;
        hash = hash + (nev == null ? 0 : nev.hashCode());
        hash = hash + szuletesiEv;
        return hash;
    }
}