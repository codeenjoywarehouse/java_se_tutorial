/**
 * 方法
 */ 
public class Method {

  public static void main(String[] args) {

    methodTest(0, "hello");

    methodOverLoad(1, "hi");

    methodOverLoad(2);

  }

  /**
    * public 为修饰符
    * void 为返回类型
    * methodTest 为方法名称
    * number 和 str 为形式参数
    */
  public static void methodTest(int number, String str) {
    // 方法体
    System.out.println(number);
    System.out.println(str);
  }

  public static void methodOverLoad(int number) {
      System.out.println(number);
  }
  
  public static void methodOverLoad(int number, String str) {
      System.out.println(number);
      System.out.println(str);
  }
    
}