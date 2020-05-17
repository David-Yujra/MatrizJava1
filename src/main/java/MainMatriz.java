public class MainMatriz {
    public static void main(String[] args){
        Matriz ma=new Matriz();

        int [][]m1=ma.crear(2,2);
        int [][]m2=ma.crear(2,2);
        ma.mostrar(ma.sumar(m1,m2));
    }
}
