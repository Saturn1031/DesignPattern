package ch06.A1a.framework;

public abstract class Product implements Cloneable { // createCopy를 구현해야 하므로 abstract class가 되고, Cloneable를 implements해야 함
    public abstract void use(String s);

    public Product createCopy() {
        Product p = null;
        try {
            p = (Product)clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
