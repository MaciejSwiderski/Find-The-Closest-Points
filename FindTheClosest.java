package org.java2.maciej.swiderski.zadania011algorytmy.zadanie5;

public class FindTheClosest {

    public String[][] findTwoPoints(int x, int y) {

        String[][] myGridsField = new String[x][y];

        for (int i = 0; i < myGridsField.length; i++) {
            System.out.println();
            for (int j = 0; j < myGridsField[i].length; j++) {
                myGridsField[i][j] = " " + "\t";
            }
        }
        return myGridsField;
    }
}
