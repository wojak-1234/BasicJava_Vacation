package chapter13_abstraction.Interfaces;
/*
    동일한 onPressed()라는 메서드를 사용하는데
    어떤 때는 볼륨이 한 칸 내려갈 것이고, 다른 때는 볼륨이 한 칸 올라갈겁니다.
 */
public class VolumeUpButton extends Button {
    @Override
    public void onPressed() {
        System.out.println("음량을 한 칸 올립니다.");
    }

    @Override
    public void onUp() {
        System.out.println("음량을 계속 올립니다.");
    }
}
