package chapter15_objects.teacher;

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TeacherMain {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("최민준","afsf");
        Teacher teacher2 = new Teacher("최민준","afsd");

        // teacher 1의 객체의 클래스 정보 얻기
        Class tClass = teacher1.getClass();
        System.out.println(tClass);
        // 결과값 : class chapter15_objects.teacher.Teacher

        System.out.println(teacher1);
        // result : Teacher{name='최민준', schoolName='afsf'}

        System.out.println(tClass.getSimpleName());
        // result : Teacher

        // 클래스의 모든 필드(Field) 정보를 출력하는 반복문
        Field[] fields = tClass.getDeclaredFields();
        for(Field field : fields) {
            System.out.println("필드명 출력 : "+field.getName());
            System.out.println("패키지 + 클래스명 출력"+field);
            System.out.println("클래스명 출력 : "+field.getType().getSimpleName());
        }

        // 클래스의 모든 메서드 정보를 출력하는 반복문
        Method[] methods = tClass.getDeclaredMethods();
        for(Method method : methods) {
            System.out.println(method.getName());
            //메서드명 출력
            System.out.println(method.getReturnType().getSimpleName());
        }
        System.out.println(Arrays.toString(fields));
        System.out.println(Arrays.toString(methods));

        // 당연히 fields 와 methods가 배열로 선언되었읜 당연히 여러분들은
        // Arrays.toString() 떠올리면 좋겠다.
        System.out.println(teacher1.getClass() == teacher2.getClass()); // true
        System.out.println(teacher1 instanceof Teacher);
        chapter15_objects.Teacher teacher3 = new chapter15_objects.Teacher("최민준","ㅁㄴㅇㄹ");
        //teacher3의 경우에는 Teacher 클래스의 인스턴스이기는 하지만 패키지 경로가 다릅니다.
        // 근데 우리는 일단 두 Teacher 클래스에 동일한 코드 라인을 작성했었습니다.

        System.out.println(teacher1.equals(teacher2)); // 내부의 값이 동일한가
        System.out.println(teacher1 == teacher2); // 주소지가 동일한가
    }
}
