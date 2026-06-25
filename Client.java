import PPA.Marvellous;       // user defined package import 
import PPA.Infosystems;
import PPA.LB.Pune;


public class Client {
    public static void main(String A[])
    {
        Marvellous mobj = new Marvellous();

        Infosystems iobj = new Infosystems();

        Pune pobj = new Pune();

        System.out.println("Inside main of Client");

        mobj.Fun();

        iobj.Gun();

        pobj.Sun();

    }
    
}
