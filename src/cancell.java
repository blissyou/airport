import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.time.LocalDateTime;
public class Cancell {

    private static String[] Add(String[] originArray, String val){
        String[] newArray = new String[originArray.length+1];

        for(int index = 0; index< originArray.length;index ++){ 
            newArray[index] = originArray[index];
        }
        newArray[originArray.length] = val;

        return newArray;
    }
    public String[] name = {"최원형"};
    public String[] log = {"취소 로그"};

    public void cancellsystem(String data) {
        LocalDateTime now = LocalDateTime.now();
        String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초"));
        for (int i = 0; i < name.length; i++) {
            if (name[i] == data) {
                name[i] = "X";
                for (int a = 0; a < log.length; a++) {
                    log[a] = Arrays.toString(Add(log,formatedNow+":"+data + "님이 취소했습니다"));
                }
            }
            else{
                System.out.println("조회된 데이터가 없습니다");
            }
        }
    }

}
