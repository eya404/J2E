package Metier;
import Dao.IDao;

public class MetierImp implements IMetier{
    private IDao dao;
    public MetierImp(IDao a){
        this.dao=a;
    }

    public MetierImp() {

    }

    @Override
    public double calcul() {
        double t = dao.getdata();
        double res = t*23;
        return res;
    }
}
