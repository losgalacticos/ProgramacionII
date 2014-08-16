

package Super;


public class B extends A{
    private int i;
    public B (int y, int w){
        super (y);
        i=w;
    }
    public int sumar (){
        return (i+super.geti());
    }
}
