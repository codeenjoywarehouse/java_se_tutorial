/**
 * 循环结构 
 */ 
public class LoopStructure {

  public static void main(String[] args) {

    int i = 111;

  	// 1. while 语句通过判断条件表达式的值是否成立来处理相同的逻辑代码
    while ( i > 100 ) {
      i = i - 1;
    }

    System.out.println(i);

    // 2. do while 语句首先执行一次逻辑代码，然后通过判断条件表达式的值是否成立继续处理相同的逻辑代码
    do {
        i = i - 1;
    } while ( i < 99 );

    System.out.println(i);

  	// 3. for 循环
  	for( int j = 0 ; j < 10 ; j++ ) {
        System.out.println(j);
    }

  }
    
}