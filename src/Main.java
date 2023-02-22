import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {

        System.out.println(funcion(1,2,3));

        Coche coche=new Coche();
        coche.incrementarPuertas();
        coche.incrementarPuertas();
        System.out.println(coche.puertas);
    }
    public static int funcion(int a, int b, int c){
        return a+b+c;
    }

}