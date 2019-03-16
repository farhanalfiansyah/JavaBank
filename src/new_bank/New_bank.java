package new_bank;

public class New_bank {

    public static void main(String[] args) {
        DataBase.listNasabah = new Nasabah[5];
        for(int i=0; i<DataBase.listNasabah.length; i++){
            DataBase.listNasabah[i] = new Nasabah(i);
            DataBase.listNasabah[i].setListTabungan(new Tabungan[1]);
            for(int j=0; j<DataBase.listNasabah[i].getListTabungan().length; j++){
                DataBase.listNasabah[i].getListTabungan();
                long rekening = 1000 + i;
                long saldo = 100000*i;
                DataBase.listNasabah[i].getListTabungan()[j] = new Tabungan(rekening, saldo, "nasabah" + i, 1234);
            }
        }
        for(Nasabah cekNasabah : DataBase.listNasabah){
            for(Tabungan cekTabungan : cekNasabah.getListTabungan()){
                System.out.print(cekTabungan.getRekening()+"; ");
                System.out.print(cekTabungan.getSaldo()+"; ");
                System.out.print(cekTabungan.getUser()+"; ");
                System.out.println(cekTabungan.getPass());
            }
        }
        MainMenu mainmenu = new MainMenu();
        mainmenu.setVisible(true);
    }
}