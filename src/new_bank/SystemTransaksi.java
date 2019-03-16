
package new_bank;

public class SystemTransaksi {
    private Tabungan tabungan;

    public Tabungan getTabungan() {
        return tabungan;
    }

    public boolean transfer(long nominal, long rekeningTujuan){  
        for(Nasabah cekNasabah : DataBase.listNasabah){
            for(Tabungan cekTabungan : cekNasabah.getListTabungan()){
                long cekRekening = cekTabungan.getRekening();
                if(cekRekening == rekeningTujuan && tabungan.getSaldo()>nominal){
                    cekTabungan.setSaldo(cekTabungan.getSaldo()+nominal);
                    tabungan.setSaldo(tabungan.getSaldo()-nominal);
                    return true;
                }
            }
        }
        return false;
    }
    
    public String cekSaldo(){
        long saldo = tabungan.getSaldo();
        return " Rp "+saldo+",-";
    }
    public boolean login(String user, int pass){
        for(Nasabah cekNasabah : DataBase.listNasabah){
            for(Tabungan cekTabungan : cekNasabah.getListTabungan()){
                String cekUser = cekTabungan.getUser();
                int cekPass = cekTabungan.getPass();
                if (cekUser.equals(user) && cekPass == pass) {
                    this.tabungan = cekTabungan;
                    return true;
                }
            }
        }
        return false;
    }
}
