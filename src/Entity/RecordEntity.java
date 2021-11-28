package Entity;

public class RecordEntity {
    private String provinsi;
    private int TingkatKematian;
    private int JumlahKasus;
    private int PotensiPenularan;
    private int clusterNumber;

    public RecordEntity(String provinsi,int TingkatKematian,int JumlahKasus,int PotensiPenularan){
        this.provinsi = provinsi;
        this.TingkatKematian = TingkatKematian;
        this.JumlahKasus = JumlahKasus;
        this.PotensiPenularan = PotensiPenularan;
    }

    public String getProvinsi() {
        return provinsi;
    }
    public int getTingkatKematian() {
        return TingkatKematian;
    }
    public int getJumlahKasus() {
        return JumlahKasus;
    }
    public int getPotensiPenularan() {
        return PotensiPenularan;
    }
    public int getClusterNumber() {
        return clusterNumber;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }
    public void setTingkatKematian(int tingkatKematian) {
        TingkatKematian = tingkatKematian;
    }
    public void setJumlahKasus(int jumlahKasus) {
        JumlahKasus = jumlahKasus;
    }public void setPotensiPenularan(int potensiPenularan) {
        PotensiPenularan = potensiPenularan;
    }
    public void setClusterNumber(int clusterNumber) {
        this.clusterNumber = clusterNumber;
    }

    public String toString(){
        return "Record[Provinsi="+provinsi+",TingkatKematian="+TingkatKematian
        +",JumlahKasus="+JumlahKasus+",PotensiPenularan="+PotensiPenularan
        +",ClusterNumber="+clusterNumber+"]";
    }


}
