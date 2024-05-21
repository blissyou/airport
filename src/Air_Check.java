public class Air_Check {
    public void checkAirplane(Airplane airplane) {
        for (int i = 0; i < airplanes.length; i++) {
            // 비행기 정보 출력 (ex: 1. 비행기 이름 1 비행기)
            System.out.println((i + 1) + ". " + airplane.getName() + " 비행기");
            // 비행기 좌석 출력
            for (int j = 0; j < airplane.seats.length; j++) {
                System.out.println(airplane.seats[j]);
            }
            System.out.println();
        }
    }
}
