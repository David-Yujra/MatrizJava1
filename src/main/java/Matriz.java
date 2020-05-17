import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Matriz {
    public int[][] crear(int fil, int col) {
        int m1[][] = new int[fil][col];
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                System.out.println("Ingrese la fila " + (i + 1) + " columna " + (j + 1));
                m1[i][j] = leer.nextInt();
            }
        }

        return m1;
    }

    public int[][] sumar(int[][] m1, int[][] m2) {
        if (m1.length == m2.length && m1[0].length == m2[0].length) {
            int[][] mr = new int[m1.length][m1[0].length];
            for (int i = 0; i < mr.length; i++) {
                for (int j = 0; j < mr[0].length; j++) {
                    mr[i][j] = m1[i][j] + m2[i][j];
                }
            }
            return mr;
        }
        else{
            System.out.println("Las matrices deben ser de dimensiones iguales");
            return null;
        }

    }


    public void mostrar(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + "\t\t\t");
            }
            System.out.println();
        }
    }
}
