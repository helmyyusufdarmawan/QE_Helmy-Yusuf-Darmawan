public class Tugas2 {
    public static void main(String []args){

        int studentScore = 80;


        String result = "";

        if (studentScore >= 80 && studentScore <= 100) {
            result = "A";
        } else if (studentScore >= 65 && studentScore <= 79) {
            result = "B+";
        } else if (studentScore >= 50 && studentScore <= 64) {
            result = "B";
        } else if (studentScore >= 35 && studentScore <= 49) {
            result = "C";
        } else if (studentScore >= 0 && studentScore <= 34) {
            result = "D";
        } else {
            result = "";
        }

        System.out.println(result);

    }
}

