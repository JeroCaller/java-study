abstract class Cloth {
    String kind;

    abstract void printKind();
}

class Cap extends Cloth {
    Cap() {kind = "모자";}

    void printKind() {
        System.out.println(kind);
    }
}

class TShirt extends Cloth {
    TShirt() {kind = "티셔츠";}
    
    void printKind() {
        System.out.println(kind);
    }
}

class Jean extends Cloth {
    Jean() {kind = "바지";}

    void printKind() {
        System.out.println(kind);
    }
}

class YourCloth {
    Cloth getYourCloth(String name) {
        Cloth clothObj = null;
        switch(name) {
            case "모자":
                clothObj = new Cap();
                break;
            case "바지":
                clothObj = new Jean();
                break;
            case "티셔츠":
                clothObj = new TShirt();
                break;
        }
        return clothObj;
    }
}

public class PolyEx2 {
    public static void main(String[] args) {
        YourCloth uc = new YourCloth();

        Cloth myCloth = uc.getYourCloth("모자");
        myCloth.printKind();

        Cloth myCloth2 = uc.getYourCloth("티셔츠");
        myCloth2.printKind();
    }
}
