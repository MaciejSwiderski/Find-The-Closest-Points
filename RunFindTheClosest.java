package org.java2.maciej.swiderski.zadania011algorytmy.zadanie5;

import java.util.Random;

public class RunFindTheClosest {

    public static void main(String[] args) {

        Random random = new Random();

        Points point1 = new Points(random.nextInt(15), random.nextInt(15));
        Points point2 = new Points(random.nextInt(15), random.nextInt(15));
        Points point3 = new Points(random.nextInt(15), random.nextInt(15));
        Points point4 = new Points(random.nextInt(15), random.nextInt(15));
        Points point5 = new Points(random.nextInt(15), random.nextInt(15));
        Points point6 = new Points(random.nextInt(15), random.nextInt(15));
        Points point7 = new Points(random.nextInt(15), random.nextInt(15));

        Points[] points = new Points[7];
        points[0] = point1;
        points[1] = point2;
        points[2] = point3;
        points[3] = point4;
        points[4] = point5;
        points[5] = point6;
        points[6] = point7;

        for (int i = 0; i < points.length; i++) {
            System.out.println("*p" + (i + 1) + " : (" + points[i].x + "," + points[i].y + ")");
        }

        FindTheClosest findTheClosest = new FindTheClosest();
        String[][] result = findTheClosest.findTwoPoints(18, 18);

        for (int i = 0; i < result.length; i++) {
            System.out.println();
            for (int j = 0; j < result[i].length; j++) {
                result[point1.x][point1.y] = "p*1";
                result[point2.x][point2.y] = "p*2";
                result[point3.x][point3.y] = "p*3";
                result[point4.x][point4.y] = "p*4";
                result[point5.x][point5.y] = "p*5";
                result[point6.x][point6.y] = "p*6";
                result[point7.x][point7.y] = "p*7";
                System.out.print(result[i][j] + "\t");
            }
        }
        Points point = new Points(0, 0);
        double minDistance = point.compare(point1, point2, point3, point4, point5, point6, point7);
        System.out.println("The distance between those two Point is " + minDistance);
    }
}
