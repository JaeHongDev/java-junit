package xunit;

// 첫 번째로 테스트 메소드를 먼저 실행합니다.
// WasRun이라는 테스트케이스를 만든다.
public class XUnitTest {
    public static void main(String[] args) {
        WasRun wasRun = new WasRun(); // 하나의 테스트를 만듦

        System.out.println(wasRun.wasRun); //false
        wasRun.testMethod();
        System.out.println(wasRun.wasRun); //true
    }
}
