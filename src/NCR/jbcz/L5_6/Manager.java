package NCR.jbcz.L5_6;

/**
 * Created by xdx on 2018/2/23.
 */
public class Manager extends Employee {
    private double bonus;

    public Manager(String n, double s, int year, int month, int day) {
        super(n, s, year, month, day);
        bonus = 0;
    }


    public void setBonus(double b) {
        bonus = b;
    }

    @Override
    public boolean equals(Object otherobj) { //对employee的方法覆盖
        if (!super.equals(otherobj)) {
            return false;
        }
        Manager other = (Manager) otherobj;
        return bonus == other.bonus;
    }

    @Override
    public int hashCode() {   //对employee的方法覆盖
        return super.hashCode() * 17 * new Double(bonus).hashCode();
    }

    @Override
    public String toString() {  //对employee的方法覆盖
        return super.toString() + "[bonus=" + bonus + "]";
    }
}
