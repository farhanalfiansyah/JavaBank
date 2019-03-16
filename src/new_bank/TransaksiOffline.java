package new_bank;

public class TransaksiOffline extends SystemTransaksi{
    public boolean simpan(long nominal){
        long saldoAwal = getTabungan().getSaldo();
        getTabungan().setSaldo(saldoAwal+nominal);
        return true;
    }
    public boolean ambil(long nominal){
        long saldoAwal = getTabungan().getSaldo();
        if(saldoAwal>=nominal){
            getTabungan().setSaldo(saldoAwal-nominal);
            return true;
        }
        return false;
    }
}
