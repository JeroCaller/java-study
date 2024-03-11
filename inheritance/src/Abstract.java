abstract class ChessPiece {
    int x;
    int y;
    String pieceName;

    ChessPiece(int initX, int initY, String pieceName) {
        this.x = initX;
        this.y = initY;
        this.pieceName = pieceName;
    }

    abstract void move(int toX, int toY);
}

class Pawn extends ChessPiece {
    Pawn(int initX, int initY, String pieceName) {
        super(initX, initY, pieceName);
    }

    void move(int toX, int toY) {
        if (Math.abs(this.x - toX) > 1 || Math.abs(this.y - toY) > 1) {
            return;
        }
        this.x += toX;
        this.y += toY;
        System.out.println("폰 한 칸 이동.");
    }
}

class Rook extends ChessPiece {
    Rook(int initX, int initY, String pieceName) {
        super(initX, initY, pieceName);
    }

    void move(int toX, int toY) {
        this.x += toX;
        this.y += toY;
        System.out.println("룩 이동");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Pawn pawn1 = new Pawn(2, 1, "Pawn1");
        Rook rook1 = new Rook(1, 1, "Rook1");

        pawn1.move(2, 2);
        rook1.move(1, 5);

        ChessPiece cp = new ChessPiece(3, 4, "hi");  // 추가된 코드.
    }
}
