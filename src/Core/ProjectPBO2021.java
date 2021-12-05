package Core;

import java.util.Scanner;
import GUI.RecordGui;
import Controller.AllObjectController;
public class ProjectPBO2021 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[]args){
        dataDefault();
        RecordGui start = new RecordGui();
    }
    static void dataDefault(){
        AllObjectController.recordController.InsertRecord("Jatim", 19, 15, 39); 
        AllObjectController.recordController.InsertRecord("Jateng", 21, 15,81); 
        AllObjectController.recordController.InsertRecord("Jabar", 23, 16, 77); 
        AllObjectController.recordController.InsertRecord("Sulteng",31,17,40); 
        AllObjectController.recordController.InsertRecord("Sumut", 22, 17, 76); 
    }
}
