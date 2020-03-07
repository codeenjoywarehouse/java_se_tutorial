/**
 * 数组
 */ 
public class Array {

  public static void main(String[] args) {

    int[] array = new int[100];

    /**
     * for 循环
     */
    for(int i = 0; i < array.length; i++) {
        array[i] = i;
    }

    /**
     * 增强 for 循环
     */
    for(int element : array) {
        System.out.println(element);
    }

    /**
     * 多维数组初始化
     */
    int number[][] = new int[][]{
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9}
    };


  }
    
}