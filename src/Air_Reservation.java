public class Air_Reservation {
    Air_Info airInfo = new Air_Info();
    private static String[] Add(String[] originArray, String val){
        String[] newArray = new String[originArray.length+1];

        for(int index = 0; index< originArray.length;index ++){
            newArray[index] = originArray[index];
        }
        newArray[originArray.length] = val;

        return newArray;
    }
    public void reservationsystem(){

    }
}
