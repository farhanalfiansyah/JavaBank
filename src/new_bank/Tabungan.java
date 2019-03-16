package new_bank;

public class Tabungan {
    private long rekening;
    private long saldo;
    private String user;
    private int pass;

    public Tabungan(long rekening, long saldo, String user, int pass) {
        this.rekening = rekening;
        this.saldo = saldo;
        this.user = user;
        this.pass = pass;
    }

    public long getRekening() {
        return rekening;
    }

    public void setRekening(long rekening) {
        this.rekening = rekening;
    }

    public long getSaldo() {
        return saldo;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    
}
