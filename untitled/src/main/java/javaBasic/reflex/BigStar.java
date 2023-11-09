package javaBasic.reflex;

/**
 * @author: zsm
 * @time: 2023/4/23 16:45
 */
public class BigStar implements Star{
    private String name;

    public BigStar() {
    }

    public BigStar(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BigStar{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public String sing(String name) {
        System.out.println(this.name + "唱了一首" + name);
        return "谢谢";
    }

    @Override
    public void dance() {
        System.out.println(this.name + "跳舞");
    }
}
