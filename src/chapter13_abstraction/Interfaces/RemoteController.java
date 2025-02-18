package chapter13_abstraction.Interfaces;
/*
    이 부분에서 고려해야 할 점은
    자바는 단일 상속만 가능하기 때문에
    VU / VD / PB 이든 셋 중 하나만 상속할 수 있을 것 같은데
    어떻게 vu / vd / pb 여기에 있는 애들의 메서드들을 전부 다 사용하게 작성할 수는 없을까?
 */
public class RemoteController {
    // 필드 선언
    // -> 이전까지는 Java의 기본 자료형 primitive datatype 만을 사용했지만
    // 이번에 처음으로 우리갖 ㅓㅇ의한 클래스가 자료형이 되는 필드를 적용했습니다
    private PowerButton powerbutton;
    private VolumeDownButton VolumeDownButton;
    private VolumeUpButton VolumeUpButton;

    public RemoteController(PowerButton powerbutton,
                            chapter13_abstraction.Interfaces.VolumeDownButton volumeDownButton,
                            chapter13_abstraction.Interfaces.VolumeUpButton volumeUpButton) {
        this.powerbutton = powerbutton;
        VolumeDownButton = volumeDownButton;
        VolumeUpButton = volumeUpButton;
    }

    //메서드 구현
    //powerButton의 메서드 구현
    public void onPressedPowerButton(){
        powerbutton.onPressed();
    }

    // VolumeDownButton의 메서드 구현
    public void onPressedVolumeDownButton(){
        VolumeDownButton.onPressed();
    }

    public void onDownVolumeDownButton(){
        VolumeDownButton.onDown();
    }
    public void onPressedVolumeUpButton(){
        VolumeUpButton.onPressed();
    }
    public void onDownVolumeUpButton(){
        VolumeUpButton.onDown();
    }
}
