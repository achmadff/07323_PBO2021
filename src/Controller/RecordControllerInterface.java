package Controller;

public interface RecordControllerInterface {
    public void InsertRecord(String provinsi,int TingkatKematian,int JumlahKasus,int PotensiPenularan);
    public void UpdateRecord(int index,String provinsi,int TingkatKematian,int JumlahKasus,int PotensiPenularan);
    public void DeleteRecord(int index);
    public String ViewDataRecord();
}
