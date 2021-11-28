package Controller;

import Entity.*;
import Model.*;

public class RecordController implements RecordControllerInterface{
    @Override
    public void InsertRecord(String provinsi, int TingkatKematian, int JumlahKasus, int PotensiPenularan) {
        AllObjectModel.modelRecord.getData().add(new RecordEntity(provinsi, TingkatKematian, JumlahKasus, PotensiPenularan));
    }
    @Override
    public void UpdateRecord(int index, String provinsi, int TingkatKematian, int JumlahKasus, int PotensiPenularan) {
        AllObjectModel.modelRecord.getData().set(index, new RecordEntity(provinsi, TingkatKematian, JumlahKasus, PotensiPenularan));
    }
    @Override
    public void DeleteRecord(int index) {
        AllObjectModel.modelRecord.getData().remove(index);
    }
    @Override
    public String ViewDataRecord() {
        String text;
        text = "Provinsi\tTingkat Kematian\tJumlah Kasus\tPotensi Penularan\n";
        for (int i = 0; i < AllObjectModel.modelRecord.getData().size(); i++) {
            text+= ""+ AllObjectModel.modelRecord.getData().get(i).getProvinsi()
            +"\t\t"+AllObjectModel.modelRecord.getData().get(i).getTingkatKematian()
            +"\t\t"+AllObjectModel.modelRecord.getData().get(i).getJumlahKasus()
            +"\t\t"+AllObjectModel.modelRecord.getData().get(i).getPotensiPenularan()+"\n";
        }
        return text;
    }
}