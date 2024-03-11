interface PersonFunc {
    void printProfile();
    default void useSkill() {};
}

abstract class PersonInGame {
    String name;
    String job;
    
    PersonInGame(String name, String job) {
        this.name = name;
        this.job = job;
    }
}

class Citizen extends PersonInGame implements PersonFunc {
    final String skill = "없음";
    
    Citizen(String name, String job) {
        super(name, job);
    }

    public void printProfile() {
        System.out.println("====== 사용자 정보 ======");
        System.out.println("이름 : " + name);
        System.out.println("직업 : " + job);
        System.out.println("보유 스킬 : " + skill);
        System.out.println("========================");
    }
}

class Mafia extends PersonInGame implements PersonFunc {
    final String skill = "죽일 시민 지정";

    Mafia(String name, String job) {
        super(name, job);
    }

    public void printProfile() {
        System.out.println("====== 사용자 정보 ======");
        System.out.println("이름 : " + name);
        System.out.println("직업 : " + job);
        System.out.println("보유 스킬 : " + skill);
        System.out.println("========================");
    }

    public void useSkill() {
        System.out.printf("%s 가 %s 스킬을 사용하였습니다.", name, skill);
    }
}

public class defaultMethod {
    public static void main(String[] args) {
        Citizen citi1 = new Citizen("시민1", "시민");
        Mafia mafia1 = new Mafia("마피아1", "마피아");
        
        citi1.printProfile();
        mafia1.printProfile();

        mafia1.useSkill();
    }
}
