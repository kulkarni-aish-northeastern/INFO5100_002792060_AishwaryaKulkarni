public class main {
    public static void main(String[] args) {
        Session newSession = new Session();

        float[] scores1 = new float[]{100,100,95,100,90,100,90,95,100, 85,100,100,100,90,100};
        float[] scores2 = new float[]{90,100,100,100,90,100,90,95,100, 85,100,93,100,90,100};
        float[] scores3 = new float[]{90,90,100,100,90,100,90,95,100, 85,100,100,100,90,100};
        float[] scores4 = new float[]{100,90,95,100,90,100,90,95,100, 85,100,100,100,90,100};
        float[] scores5 = new float[]{100,100,100,100,90,100,90,95,100, 85,100,100,100,90,100};
        float[] scores6 = new float[]{90,100,95,100,90,100,90,95,86, 85,100,100,45,90,100};
        float[] scores7 = new float[]{100,90,100,100,90,100,90,95,100, 85,100,100,100,90,100};
        float[] scores8 = new float[]{90,100,100,100,90,65,90,95,100, 85,37,100,100,90,100};
        float[] scores9 = new float[]{100,100,100,100,90,100,90,95,100, 85,75,100,100,90,100};
        float[] scores10 = new float[]{100,90,100,100,90,100,90,95,100, 85,100,33,100,90,100};
        float[] scores11 = new float[]{100,100,100,100,90,85,90,95,100, 85,100,100,100,90,100};
        float[] scores12 = new float[]{80,100,100,100,90,100,90,95,83, 85,100,100,100,90,100};
        float[] scores13 = new float[]{100,100,100,100,90,100,90,95,100, 85,100,100,100,90,100};
        float[] scores14 = new float[]{80,100,100,100,90,100,90,95,100, 85,100,100,100,90,100};
        float[] scores15 = new float[]{100,100,100,100,90,100,90,95,100, 85,100,100,100,90,100};
        float[] scores16 = new float[]{90,100,100,100,90,100,90,95,100, 85,100,100,100,90,100};
        float[] scores17 = new float[]{100,90,100,100,90,100,90,95,100, 85,65,100,100,90,100};
        float[] scores18 = new float[]{90,100,95,100,90,100,90,95,100, 85,100,100,100,90,100};
        float[] scores19 = new float[]{80,90,95,100,90,100,90,95,100, 85,100,100,100,90,100};
        float[] scores20 = new float[]{100,90,100,100,90,25,90,95,100, 85,100,100,100,90,100};

        float[] extraScores  = new float[]{90,90};

        newSession.createStudent("Aishwarya", "Kulkarni", constVar.FULL_TIME, scores1);
        newSession.createStudent("sam", "Varshney", constVar.FULL_TIME, scores2);
        newSession.createStudent("Ravi", "Mishra", constVar.PART_TIME, scores3);
        newSession.createStudent("Rakhi", "Mishra", constVar.PART_TIME, scores4);
        newSession.createStudent("Parul", "Varshney", constVar.FULL_TIME, scores5);
        newSession.createStudent("Prashant", "Varshney", constVar.FULL_TIME, scores6);
        newSession.createStudent("Brij Nandan", "Mishra", constVar.PART_TIME, scores7);
        newSession.createStudent("Prakashni Devi", "Mishra", constVar.FULL_TIME, scores8);
        newSession.createStudent("Suman", "Gupta", constVar.PART_TIME, scores9);
        newSession.createStudent("Rajat", "Gupta", constVar.FULL_TIME, scores10);
        newSession.createStudent("Tyson", "Mishra", constVar.FULL_TIME, scores11);
        newSession.createStudent("Bonzo", "Varshney", constVar.PART_TIME, scores12);
        newSession.createStudent("Hades", "Varshney", constVar.FULL_TIME, scores13);
        newSession.createStudent("Alexa", "Mishra", constVar.FULL_TIME, scores14);
        newSession.createStudent("Marshal", "Prasanna", constVar.FULL_TIME, scores15);
        newSession.createStudent("Satyam", "Arora", constVar.FULL_TIME, scores16);
        newSession.createStudent("Emma", "Watson", constVar.FULL_TIME, scores17);
        newSession.createStudent("Saif Ali", "Khan", constVar.PART_TIME, scores18);
        newSession.createStudent("Salman", "Khan", constVar.PART_TIME, scores19);
        newSession.createStudent("Akshay", "Kumar", constVar.FULL_TIME, scores20);

        // Adding extra scores for full-time students
        for(int i = 0 ; i < newSession.students.length; i++) {
            newSession.students[i].addExtraScore(extraScores);
        }

        // Printing Average Quiz Scores for all students
        for(int i = 0 ; i < newSession.students.length; i++) {
            System.out.println("Score for " + newSession.students[i].getFullName() + " is " +newSession.students[i].avgQuizScore());
        }
        // Printing quiz scores for all students for quiz 15
        for(int i = 0 ; i < newSession.students.length; i++) {
            newSession.students[i].printQuizScore(14);
        }

        // Printing names of part-time students
        for(int i = 0; i < newSession.students.length; i++) {
            newSession.students[i].printName(constVar.PART_TIME);
        }

        // Printing quiz scores of full-time students
        for(int i = 0; i < newSession.students.length; i++) {
            newSession.students[i].printName(constVar.PART_TIME);
        }

        newSession.printParticularQuizInAscendingOrder(12);




    }
}
