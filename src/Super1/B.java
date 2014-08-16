package Super1;

public class B extends A {

    //int i;

    public B(int y, int w) {
        super.i = y;
       // i = w;
    }

    public String mostrar() {
        return ("i es=" +  "super.i es=" + super.i);
    }
}
