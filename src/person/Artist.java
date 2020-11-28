package person;

public class Artist extends Person {

    private String nickname;

    public Artist(String firstName,String lastName, int age, char sex, String nickname) {
        super(firstName, lastName, age, sex);
        this.nickname = nickname;
    }

    public Artist() {};

    public String getNickname() {
        return this.nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println(String.format("Nickname: " + nickname));
    }
}
