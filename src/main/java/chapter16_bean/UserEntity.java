package chapter16_bean;
/*
    정보를 담는 객체를 Entity class라고 합니다.
    -> 데이터베이스와 연결되는 클래스만 지칭하기 때문에
    특별한 지위에 있다고 할 수 있음.
        1열       2열         3열        4열        -> 세로줄(열/Column)
    +----------------------------------------+
    | username | password | email     | name |
    ------------------------------------------
    |    1      | 1234    | a@test.com| 안근수|    -> 가로줄(행/Row)
    +----------------------------------------+
 */
public class UserEntity {
    private int username;
    private int psassword;
    private String email;
    private String name;

    //setter getter tostring 정의

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPsassword() {
        return psassword;
    }

    public void setPsassword(int psassword) {
        this.psassword = psassword;
    }

    public int getUsername() {
        return username;
    }

    public void setUsername(int username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return """    
                     +----------------------------------------+
                     | username | password | email     | name |
                     ------------------------------------------
                     |    +""+      | 1234    | a@test.com| 안근수|    
                     +----------------------------------------+""";
    }
}
