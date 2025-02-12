public class Main {
    public static void main(String[] args) {
        String introduction = """
                안녕하세여
                안녕하세요
                안녕
                """;
        System.out.println(introduction);
/*
    int / long
    int : 4Byte
        최소값 : (-2^31)
        최대값 : (2^31-1)
    long :

    5. 상수 -> 변수와 반대되는 개념
        특징 :
            1) 한 번의 선언 및 초기화가 가능. -> 변수와는 달리 '재 대입이 불가능'
            2) 이미 초기화가 끝난 상수를 한참 밑에서 불러올 경우 걔가 상수인지 변수인지 가시적으로
            확인이 불가능하기 때문에 개발자들끼리 약속으로 상수는 전부 다 대문자로 작성하고, 단어와 단어
            사이의 공백을 "_"로 처리함
            3) 상수를 선언할 때는 final 키워드가 붙음.
 */
        // 자료형 변수명 = data;
        // final 자료형 변수명 = data;
        // -> 보통 file path 에 사용(변하지 않음.)
    }
}