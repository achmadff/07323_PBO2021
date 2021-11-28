package Model;

import java.util.ArrayList;
import java.util.List;
import Entity.RecordEntity;

public class ModelRecord {
    private List<RecordEntity> data = new ArrayList<RecordEntity>();
    public void setData(List<RecordEntity>data){
        this.data = data;
    }
    public List<RecordEntity> getData() {
        return data;
    }
}
