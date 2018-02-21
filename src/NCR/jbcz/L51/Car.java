package NCR.jbcz.L51;

/**
 * Created by xdx on 2018/2/21.
 */
public class Car {
    private boolean sale;
    private String carName;

    public Car(String c1, boolean isSale) {
        carName = c1;
        sale = isSale;
    }

    public void setSale(boolean isSale) {
        this.sale = isSale;
    }

    public void setCarName(String c1) {
        this.carName = c1;

    }

    public boolean getSale() {
        return sale;
    }

    public String getCarName() {
        return carName;
    }
    public String toString(){
        if (sale) {
            return (carName+"已卖出");
        } else {
            return (carName + "未卖出");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Car)) {
            return false;
        }
        Car c = (Car) obj;
        return (carName.equals(c.getCarName()) && (sale == c.getSale()));
    }
}
