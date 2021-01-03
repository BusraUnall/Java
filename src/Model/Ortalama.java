
package Model;

import Helper.IHesaplamalar;
import java.util.ArrayList;

public class Ortalama implements IHesaplamalar{

    @Override
    public double ortalama(int not1, int not2, int odev) {
        double ort=(not1+not2+odev)/3.0;
        ort=(Math.round(ort*100.0))/100.0;
        return ort;
       
    }

    @Override
    public double yilSonuOrtalama(ArrayList<Double> notlar) {
        double c=0;
        for(int b=0;b<notlar.size();b++){
         c=c+notlar.get(b);}
       return c/notlar.size();
    }


    
}
