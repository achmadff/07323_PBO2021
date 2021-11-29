package Core;

import java.util.Scanner;

import Controller.AllObjectController;
import Model.AllObjectModel;

public class ProjectPBO2021 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int pil;
        do {
            System.out.println("1. Insert");
            System.out.println("2. Update");
            System.out.println("3. Delete");
            System.out.println("4. View Hasil Clustering");
            System.out.println("0. exit");
            System.out.print("Pili->");
            pil = input.nextInt();
            switch (pil) {
                case 1:
                    InputDataRecord();
                    System.out.println(AllObjectController.recordController.ViewDataRecord());
                    break;
                case 2:
                    UpdateDataRecord();
                    System.out.println(AllObjectController.recordController.ViewDataRecord());
                    break;
                case 3:
                    Delete();
                    System.out.println(AllObjectController.recordController.ViewDataRecord());
                    break;
                case 4:
                    AllObjectController.clusterController.initializeClusterAndCentroid(3);
                    System.out.println(AllObjectController.clusterController.viewDataCluster());
                    break;
            }
        } while (pil != 0);
    }

    static void InputDataRecord(){
        System.out.print("Provinsi = ");
        String provinsi = input.next();
        System.out.print("Tingkat Kematian = ");
        int tingkatKematian = input.nextInt();
        System.out.print("Jumlah Kasus = ");
        int jumlahKasus = input.nextInt();
        System.out.print("Potensi Penularan = ");
        int potensiPenularan = input.nextInt();
        AllObjectController.recordController.InsertRecord(provinsi, tingkatKematian, jumlahKasus, potensiPenularan);
        System.out.println("Data Berhasil Diinsert");
    }

    static void UpdateDataRecord(){
        boolean cari = false;
        int index = 0;
        System.out.print("Provinsi yang diUpdate = ");
        String provinsicek = input.next();
        for (int i = 0; i < AllObjectModel.modelRecord.getData().size(); i++) {
            if (provinsicek.equals(AllObjectModel.modelRecord.getData().get(i).getProvinsi())) {
                cari = true;
                index = i;
            }
        }
        if (cari==true) {
            System.out.print("Provinsi = ");
            String provinsi = input.next();
            System.out.print("Tingkat Kematian = ");
            int tingkatKematian = input.nextInt();
            System.out.print("Jumlah Kasus = ");
            int jumlahKasus = input.nextInt();
            System.out.print("Potensi Penularan = ");
            int potensiPenularan = input.nextInt();
            AllObjectController.recordController.UpdateRecord(index, provinsi, tingkatKematian, jumlahKasus, potensiPenularan);
            System.out.println("Data Berhasil DiUpadate");
        } else {
            System.out.println("Data Tidak Ada");
        }
    }
    static void Delete(){
        boolean cari = false;
        int index = 0;
        System.out.print("Provinsi yang diUpdate = ");
        String provinsicek = input.next();
        for (int i = 0; i < AllObjectModel.modelRecord.getData().size(); i++) {
            if (provinsicek.equals(AllObjectModel.modelRecord.getData().get(i).getProvinsi())) {
                cari = true;
                index = i;
            }
        }
        if (cari==true) {
            AllObjectController.recordController.DeleteRecord(index);
            System.out.println("Data Berhasil Didelete");
        } else {
            System.out.println("Data Tidak Ada");
        }
    }
}
