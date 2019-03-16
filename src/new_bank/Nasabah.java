package new_bank;

public class Nasabah {
    private long id;
    private Tabungan[] listTabungan;

    public Nasabah(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Tabungan[] getListTabungan() {
        return listTabungan;
    }

    public void setListTabungan(Tabungan[] listTabungan) {
        this.listTabungan = listTabungan;
    }
}
