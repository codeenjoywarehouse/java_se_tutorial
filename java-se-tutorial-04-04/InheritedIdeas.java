/**
 * 继承思想
 */ 
public class InheritedIdeas {

    public static void main(String[] args) {

        Users user = new Users("Tom", 18);

        user.interduce();
        user.swim();

        Teachers teacher = new Teachers("Nancy", 30);

        teacher.interduce();
        teacher.swim();

    }

}

class Users {
    private String userName;
    private int userAge;

    public Users(String name, int age) {
        this.userName = name;
        this.userAge = age;
    }

    public void interduce() {
        System.out.println( userName + " is " + userAge + " years old ... ");
    }

    public void swim() {
        System.out.println( userName + " is in swimming ... ");
    }
}

class Teachers extends Users {
    public Teachers (String teacherName, int teacherAge) {
         super(teacherName, teacherAge); 
    }
}