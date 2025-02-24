package chapter13_abstraction.Interfaces;
/*
    인터페이스는 일반 클래스와 달리 다중 상속이 가능
    그렇기 때문에 일반 클래스와 상속 관련 명령어도 다름.
    extends(클래스 상속 시)
    implements(인터페이스 상속 시)
 */
public abstract class Button implements Press, Up, Down
{
    @Override
    public void onDown() {

    }

    @Override
    public abstract void onPressed();

    //지워도 되지 않나요?

    @Override
    public void onUp() {

    }
}
