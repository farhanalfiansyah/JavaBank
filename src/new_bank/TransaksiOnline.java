package new_bank;

public class TransaksiOnline extends SystemTransaksi{
    public boolean transfer(long nominal, long rekeningTujuan, int token){
        for(Nasabah cekNasabah : DataBase.listNasabah){
            for(Tabungan cekTabungan : cekNasabah.getListTabungan()){
                long cekRekening = cekTabungan.getRekening();
                if(cekRekening == rekeningTujuan && getTabungan().getPass() == token && getTabungan().getSaldo()>nominal){
                    cekTabungan.setSaldo(cekTabungan.getSaldo()+nominal);
                    getTabungan().setSaldo(getTabungan().getSaldo()-nominal);
                    return true;
                }
            }
        }
        return false;
    }
}
