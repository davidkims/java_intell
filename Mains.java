import java.util.Scanner;

public class Mains {
    public static void main(String[] args) {
        // Scanner 객체를 사용하여 사용자로부터 텍스트 입력 받기
        Scanner scanner = new Scanner(System.in);
        System.out.print("텍스트를 입력하세요: ");
        String text = scanner.nextLine(); // 사용자가 입력한 텍스트를 읽음

        // 입력된 텍스트를 화면에 출력
        System.out.println("입력된 텍스트: " + text);

        // 프로그램 종료
        scanner.close(); // Scanner 사용이 끝나면 닫아줌
    }
}
