package Loops;

public class LoopedArray {
    public static void main(String[] args) {
        String[] colors = {"Red", "Blue", "Green", "Yellow"}; //definerer Stringsne i arrayet
        for (int i = 0; i < colors.length; i++) { // kører et for-loop som varer længden af colors-arrayet
            System.out.println(colors[i]); //udprinter det på i's plads
         //   System.out.println(colors[2]); //udprinter det som er på plads nummer to
        }
        String[][] moreColors = {{"Pink", "Purple"},  //hente elementer fra et 2d array HUSK dobbelt brackets [][]!!!
                {"Brown", "White", "Black"}
        };
        for (int row = 0; row < 2; row++) {  //her er row rækken (dvs først pink og purple
            for (int j = 0; j < 2; j++) { //j er her elementet i den række der arbejdes i, ligesom et normalt array

                System.out.println(moreColors[row][j]); //udprinter 2d arrayet. HUsk at sætte i brackets [][]
            }
        }
    }
}
