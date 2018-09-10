import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String arg[]){
        //------------------------------//
        //--COMPLEJOS--//
        Complejo a = new Complejo(1,2);
        Complejo b = new Complejo(2,3);
        Complejo c = new Complejo(0,0);
        c.suma(a,b);
        System.out.println("suma complejos: " + c.toString());
        //------------------------------//
        //--ARRAYS--//
        //-array vacío
        ArrayList<Integer> array = new ArrayList<Integer>();
        //-se rellena el array
        for(int i = 0; i<10; i++) {
            array.add(i);
        }
        //-se elimina un numero del array
        array.remove(2);
        //-se recorre el array y se muestra
        for(int i = 0; i < array.size(); i++){
            System.out.println(array.get(i));
        }
        //-otra forma de mostrar el array
        for(int x : array){
            System.out.println(x);
        }

    }
}
