/**
 * Created by a on 27/02/17.
 */
public class Series {

    private int nu;
    private int di;
    private int na;


    public String Series(int di){


        double re = 0.00;

        for(int i =0; i < di; i+=3 ){

            re += 1/(1+i);

        }

        String result=String.valueOf(re);
        return result;
    }
}
