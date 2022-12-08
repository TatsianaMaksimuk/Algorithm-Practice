package Day12;

public class Student extends Person{


    public int[] scores;


    public Student(String firstName, String lastName, int id, int[] testScores){
        super(firstName, lastName, id);
        this.scores = testScores;
    }

    public char calculate(){
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum+=scores[i];
        }
        double average = sum/(scores.length);

        if (average>=90 && average<=100){
            return 'O';
        } else if (average>=80&&average<=90) {
            return 'E';
        } else if (average>=70&&average<=80) {
            return 'A';
        } else if (average>=55&&average<=70) {
            return 'P';
        }else if (average>=40&&average<=55) {
            return 'D';
        }else {
            return 'T';
        }
    }
}
