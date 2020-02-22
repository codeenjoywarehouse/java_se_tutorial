/**
 * 类型转换 
 */ 
public class TypeCast {
    
    public static void main(String[] args) {

        // 99.9D 属于 double 类型，把它转换为 int 类型时，需要在它前面加上强制转换符，转换后 i 的数值为 99 ，此时出现精度损失现象。
        int i = (int)99.9D;

    }
    
}