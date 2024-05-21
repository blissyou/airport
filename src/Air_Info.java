public class Air_Info { 
    private String name;
    private String day;
    private int gate;
    private String D_Time;
    private String A_Time;
    private String Desti;

    public Air_Info(){
        super();
    }

    public Air_Info(String name, String day, int gate, String D_Time, String A_Time, String Desti){
        this.name = name;
        this.day = day;
        this.gate = gate;
        this.D_Time = D_Time;
        this.A_Time = A_Time;
        this.Desti = Desti;
    }


    public String toString(){
        return "항공사 : " + name + "\t" + "날짜 : " + day + "\t" + "\t" + "게이트 : " + gate + "\n" + "출발 시간 : " + D_Time + "\t" + "도착시간 : " + A_Time + "\t" + "목적지 : " + Desti;
    }

}
