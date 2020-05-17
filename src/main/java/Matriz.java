public class Matriz {
    public int[][] crear() {
        int m1[][] = new int[2][2];
        int n=1;
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                m1[i][j] = n++;
            }
        }

        return m1;
    }
    public void mostrar(int[][] m){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j]+"\t");
            }
            System.out.println( );
        }
    }
}
