package org.java2.maciej.swiderski.zadania011algorytmy.zadanie5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Points {

    int x;
    int y;

    public Points(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double compare(Points p1, Points p2, Points p3, Points p4, Points p5, Points p6, Points p7) {

        Points[] myNew = new Points[7];
        myNew[0] = p1;
        myNew[1] = p2;
        myNew[2] = p3;
        myNew[3] = p4;
        myNew[4] = p5;
        myNew[5] = p6;
        myNew[6] = p7;
        System.out.println();

        List<Double> myNewTableNew = new ArrayList<>();

        int a = 0;
        int b = 0;

        for (int i = 0; i < myNew.length; i++) {
            for (int j = 0; j < myNew.length; j++) {
                if (i == j)
                    break;

                double finalResult1 = Math.sqrt((myNew[i].x - myNew[j].x) * (myNew[i].x - myNew[j].x)
                        + (myNew[i].y - myNew[j].y) * (myNew[i].y - myNew[j].y));

                if (finalResult1 == 0)
                    continue;

                myNewTableNew.add(finalResult1);

                double min = i;
                if ((Collections.min(myNewTableNew) <= min)) {
                    min = Collections.min(myNewTableNew);
                }

                if ((finalResult1 == min)) {
                    b = j;
                    a = i;
                }
            }
        }
        double min = Collections.min(myNewTableNew);
        System.out.println("(*p" + (b + 1) + " and *p" + (a + 1) + ")- are the closests points on the Grid");
        System.out.println("The grids of the Points are: (" + myNew[b].x + "," + myNew[b].y + ")(" + myNew[a].x + "," + myNew[a].y + ")");
        return min;
    }
}





