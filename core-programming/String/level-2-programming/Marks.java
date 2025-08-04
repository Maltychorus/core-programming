import java.util.Random;

class main {
    public static void main(String[] args) {
        Random rand = new Random();
        int students = 5;
        int[][] marks = new int[students][3];

        for (int i = 0; i < students; i++)
            for (int j = 0; j < 3; j++)
                marks[i][j] = rand.nextInt(41) + 60; 

        double[] total = new double[students];
        double[] percentage = new double[students];
        char[] grade = new char[students];

        for (int i = 0; i < students; i++) {
            total[i] = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = Math.round((total[i] / 3.0) * 100.0) / 100.0;

            if (percentage[i] >= 90) grade[i] = 'A';
            else if (percentage[i] >= 75) grade[i] = 'B';
            else if (percentage[i] >= 60) grade[i] = 'C';
            else grade[i] = 'D';
        }

        System.out.println("Stu\tPhy\tChem\tMath\tTotal\t%\tGrade");
        for (int i = 0; i < students; i++) {
            System.out.println(
                (i+1)+"\t"+marks[i][0]+"\t"+marks[i][1]+"\t"+marks[i][2]+
                "\t"+(int)total[i]+"\t"+percentage[i]+"\t"+grade[i]
            );
        }
    }
}
