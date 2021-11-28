package Model;

import java.util.ArrayList;
import java.util.List;
import Entity.ClusterEntity;

public class ModelCluster {
    List<ClusterEntity> cluster = new ArrayList<ClusterEntity>();
    public void setCluster(List<ClusterEntity> cluster) {
        this.cluster = cluster;
    }
    public List <ClusterEntity> getClusters() {
        return cluster;        
    }
}
