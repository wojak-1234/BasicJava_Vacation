package chapter13_abstraction.Interfaces;

public interface Up {
    void onUp();
}
/*
    PowerButton.java 에서 확인할 수 있듯이
    걔는 전원을 켜고 끄는것만 하는 상황이기 때문에 onUp onDown 메서드를
    굳이 Override 할 필요가 없다. 하지만, abstract로 선언한 메서드는 반드시
    자식 클래스에서 구현되어야 하므로, onUp() onDown() 메서드들을 abstract로 선언하면
    PowerButton 클래스에 불필요한 method들을 구현해야하므로, onPressed만
    abstract로 선언함.
 */