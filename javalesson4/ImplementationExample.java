package javalesson4;

public class ImplementationExample {
    public static void main(String[] args) {
        if (onTest(1000).equals("TestValue - 34300")) {
            System.out.println("정답입니다.");
            return;
        }
        System.out.println("오답입니다.");
    }

    private static String onTest(int value) {
        TestClass testClass = new TestClass();
        return testClass.eval(testClass.getString(), value);
    }


    private static class TestClass {
        /**
         * 해당 메서드는 다음과 같은 역할을 가져야 합니다 :
         * 다음 문자열을 반환해야 합니다.
         *
         * "TestValue"
         */
        public String getString() {
            return "TestValue";
        }

        /**
         * 해당 메서드는 다음과 같은 역할을 가져야 합니다 :
         *
         * 두번째 값에 다음 연산을 거친 후, 첫번째 값에 " - "를 붙여야 합니다.
         *
         * 두번째 값을 2로 나눈 다음, 7을 곱하고, 3을 제곱한 후, 5로 나눠야 합니다.
         *
         * 그 후, 이 값을 반환해야 합니다.
         *
         * 예를 들어, first가 "TestValue"이고, data가 1000이였다면, 다음 값이 반환되어야 합니다 :
         *
         * "TestValue - 34300"
         *
         * @param first 맨 앞에 위치할 문자열
         * @param data 계산이 진행되어야 할 값
         */
        public String eval(String first, int data) {
            int result = ((data / 2) * 7 + (int)Math.pow(3, 2)) / 5;
            return first + " - " + result;
        }
    }

}
