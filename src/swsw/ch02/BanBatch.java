package swsw.ch02;

public class BanBatch {

    public static void main(String[] args) {

        String banBatch[][] = new String[6][5];

        banBatch[0][0] = "최원용";
        banBatch[0][1] = "김인규";
        banBatch[0][2] = "여현욱";
        banBatch[0][3] = "권혁원";
        banBatch[0][4] = "김현정";

        banBatch[1][0] = "임지완";
        banBatch[1][1] = "장은조";
        banBatch[1][2] = "현광우";
        banBatch[1][3] = "양승철";
        banBatch[1][4] = "김민식";

        banBatch[2][0] = "(구)성우";
        banBatch[2][1] = "이한수";
        banBatch[2][2] = "윤주호";
        banBatch[2][3] = ".......";
        banBatch[2][4] = ".......";

        banBatch[3][0] = "김우성";
        banBatch[3][1] = "배신자";
        banBatch[3][2] = "(구)세진";
        banBatch[3][3] = "이건혁";
        banBatch[3][4] = "박범수";

        banBatch[4][0] = "unknown";
        banBatch[4][1] = "임지훈";
        banBatch[4][2] = "김영선";
        banBatch[4][3] = "김석근";
        banBatch[4][4] = "김윤빈";

        banBatch[5][0] = "탕비실";
        banBatch[5][1] = "임성우";
        banBatch[5][2] = "이세진";
        banBatch[5][3] = "빈칸";
        banBatch[5][4] = "옷걸이";

        for (int i = 0; i < banBatch.length; i++) {
            for (int j = 0; j < banBatch[i].length; j++) {
                System.out.print(banBatch[i][j] + "  \t");
            }
            System.out.println();
        }
        System.out.println();
    }

}