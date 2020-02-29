/**
 * 条件分支语句 
 */ 
public class ConditionalBranching {
    
    public static void main(String[] args) {

    	int i = 0;

    	// 1. if 语句表示如果条件表达式成立，便执行相应的的逻辑代码
        if ( i == 0 ) {
        	System.out.println(i);
	    }

	    // 2. if - else 语句表示如果条件表达式成立，便执行成立的逻辑代码，否则执行不成立的逻辑代码
	    if ( i == 0 ) {
          System.out.println(i);
      	} else {
          System.out.println("error");
      	}

      	// 3. if -else if ... - else 语句表示如果条件表达式成立，便执行成立的逻辑代码
      	// 		否则进行下一个条件表达式的判断，直到执行最后一个都不成立时的逻辑代码
      	double price = 10.0D;
      	double except = 6.0D;
      	if ( price > except ) {
          System.out.println(price - except);
      	} else if ( price == except ) {
          System.out.println(0);
      	} else {
          System.out.println(except - price);
      	}

      	// 4. switch 语句根据表达式的值 ( key ) 在一个或多个 case 分支语句中选择一个执行
      	switch ( i ) {
          	case 0 :
                System.out.println(i);
                break;
          	case 1 :
                System.out.println("1");
                break;
			default : 
                System.out.println("error");
                break;
      	}

    }
    
}