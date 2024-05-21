import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class User_Test {
    public static void setUser() {
        Scanner scan = new Scanner(System.in, "UTF-8");
        List<Userinfo> u = new ArrayList<>();
        

        while (true) {
            System.out.println("정보를 입력해주세요");

            System.out.print("이름 : ");
            String name = scan.nextLine();

            System.out.print("나이 : ");
            int age = scan.nextInt();

            scan.nextLine(); //줄바꿈
            
            System.out.print("국적 : ");
            String world = scan.nextLine();

            System.out.print("연락처 : ");
            String phone = scan.nextLine();

            System.out.print("성별 : ");
            String gender = scan.nextLine();

            System.out.print("이메일 : ");
            String email = scan.nextLine();

            Userinfo us = new Userinfo(name, age, world, phone, gender, email);

            u.add(us);          // 리스트에 추가

            System.out.println("다른 사람도 입력하시겠습니까? 아니면 n 또는 N를 입력해주세요");
            String response = scan.nextLine();

            if(response.equalsIgnoreCase("n")){
                break;
            }


        }
        System.out.println("사용자 정보");
        for(Userinfo us : u){
            System.out.println(us);
        }

        scan.close();
        

    }
}
