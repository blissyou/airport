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

    public String getName() {
        return name;
    }

    public String getDay() {
        return day;
    }

    public int getGate() {
        return gate;
    }

    public String getD_Time() {
        return D_Time;
    }

    public String getA_Time() {
        return A_Time;
    }

    public String getDesti() {
        return Desti;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setGate(int gate) {
        this.gate = gate;
    }

    public void setD_Time(String d_Time) {
        D_Time = d_Time;
    }

    public void setA_Time(String a_Time) {
        A_Time = a_Time;
    }

    public void setDesti(String desti) {
        Desti = desti;
    }

    public String toString(){
        return "항공사 : " + name + "\t" + "날짜 : " + day + "\t" + "\t" + "게이트 : " + gate + "\n" + "출발 시간 : " + D_Time + "\t" + "도착시간 : " + A_Time + "\t" + "목적지 : " + Desti;
    }

}
