package entity;

/**
 * MgrEnum: 枚举单例
 *
 * @author: zsm
 * @time: 2023/5/18 11:10
 */
public enum MgrEnum {

   A;

    public static void main(String[] args) {
        MgrEnum a = MgrEnum.A;
        MgrEnum b =  MgrEnum.A;
        System.out.println( a == b);
        System.out.println( a );
    }
}
