package chapter13_abstraction.Interfaces;

public class VolumeDownButton extends Button {
    @Override
    public void onPressed() {
        System.out.println("음량을 한 칸 내립니다.");
    }

    @Override
    public void onDown() {
        super.onDown();     // 슈퍼 클래스의 메서드를 호출하는 키워드
        // 근데 구현한게 없어서 있어도 그만 없어도 그만임. 여기서는 남겨놓음
        // 그리고 VolumeUpButton에서는 없애서 비교
        System.out.println("음량을 계속 내립니다.");
    }
}
