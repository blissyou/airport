public class Array_Add {
    private static String[] Add(String[] originArray, String val){
        String[] newArray = new String[originArray.length+1];

        for(int index = 0; index< originArray.length;index ++){
            newArray[index] = originArray[index];
        }
        newArray[originArray.length] = val;

        return newArray;
    }
}
