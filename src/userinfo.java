public class userinfo {
    private String name;
    private int age;
    private String world;
    private String phone;
    private String gender;
    private String email;

    public userinfo(String name, int age, String world, String phone, String gender, String email ){
        this.name = name;
        this.age = age;
        this.world = world;
        this.phone = phone;
        this.gender = gender;
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWorld(String world) {
        this.world = world;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getWorld() {
        return world;
    }

    public String getPhone() {
        return phone;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String toString(){
        return "이름 : " + name + "\t" + "나이 : " + age + "\t" + "\t" + "국적 : " + world + "\t" + "번호 : " + phone + "\t" + "성별 : " + gender + "\t" + "이메일 : " + email;
    }

}
