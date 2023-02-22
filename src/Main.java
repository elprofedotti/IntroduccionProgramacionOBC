import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        //añado comentario para probar GIT
        System.out.println(funcion(1,2,3));

        //añado comentario para probar GIT
        Coche coche=new Coche();
        coche.incrementarPuertas();
        System.out.println(coche.puertas);
    }
    public static int funcion(int a, int b, int c){
        return a+b+c;
    }

}