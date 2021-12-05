package Controller;

import Entity.RecordEntity;

public interface ClusterControllerInterface {
    public void initiateClusterAndCentroid(int clusterNumber);
    public void initiateCluster(int clusterNumber,RecordEntity record);
    public void FinalCluster();
    public String ViewDataCluster();
}
