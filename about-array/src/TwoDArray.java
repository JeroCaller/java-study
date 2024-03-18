class TwoDArray {
    /**
     * 주어진 2차원 배열을 1부터 연속적인 자연수로 초기화한다.
     * @param twoArr  : 2차원 int형 배열
     * @return int[][] : 초기화가 완료된 2차원 int형 배열
     */
    public static int[][] initializeTwoDArrayWithNumbers(int[][] twoArr) {
        int num = 1;
        for(int i = 0; i < twoArr.length; i++) {
            for(int j = 0; j < twoArr[i].length; j++) {
                twoArr[i][j] = num++;
            }
        }
        return twoArr;
    }

    public static void printTwoDArray(int[][] twoArr) {
        for(int[] oneArr : twoArr) {
            for(int num : oneArr) {
                System.out.print(num + "\t");
            }
            System.out.println();  // 개행.
        }
    }

    public static void main(String[] args) {
        int[][] movieSeats = new int[10][10];
        int[][] seatsNonSquare = {
            {1},
            {2, 3},
            {4, 5, 6},
        };
        
        movieSeats = initializeTwoDArrayWithNumbers(movieSeats);
        printTwoDArray(movieSeats);

        printTwoDArray(seatsNonSquare);
    }
}
