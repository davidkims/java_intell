import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CodeCloner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 원본 코드를 입력 받음
        System.out.println("원본 코드를 입력하세요:");
        StringBuilder codeBuilder = new StringBuilder();
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("EOF")) { // 사용자가 입력을 끝내려면 "EOF"를 입력
                break;
            }
            codeBuilder.append(line).append("\n"); // 입력받은 코드를 StringBuilder 추가
        }
        String originalCode = codeBuilder.toString();

        // 사용자로부터 복제할 파일의 이름을 입력 받음
        System.out.print("복제할 파일의 이름을 입력하세요: ");
        String fileName = scanner.nextLine();

        // 파일에 원본 코드를 쓰기
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(originalCode);
            fileWriter.close();
            System.out.println("코드가 성공적으로 복제되었습니다.");
        } catch (IOException e) {
            System.out.println("파일 작성 중 오류가 발생했습니다: " + e.getMessage());
        }

        scanner.close();
    }
}
