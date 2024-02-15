import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("ID");
        String id = scanner.next();
        System.out.println("비번");
        String password = scanner.next();
        System.out.println("비번확인");
        String werifying = scanner.next();
        System.out.println("이름");
        String name = scanner.next();
        System.out.println("주민번호");
        String resident = scanner.next();
        System.out.println("전화번호");
        String phone = scanner.next();
        System.out.println("주소");
        String address = scanner.next();
        System.out.println("직업");
        String occupation = scanner.next();

        System.out.println("ID"+id);
        System.out.println("비번"+password);
        System.out.println("비번확인"+werifying);
        System.out.println("이름"+name);
        System.out.println("주민번호"+resident);
        System.out.println("전화번호"+phone);
        System.out.println("주소"+address);
        System.out.println("직업"+occupation);


    }
}