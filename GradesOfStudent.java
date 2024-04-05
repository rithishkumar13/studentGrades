import java.util.Scanner;
class Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of Students:");
        int numOfStudents=sc.nextInt();
        int []grades=new int[numOfStudents];

        for (int i = 0; i < grades.length; i++) {
            System.out.print("Enter grade for" +" "+(i + 1)+"st student" + ": ");
             grades[i] = sc.nextInt();
        }

        double average = calculateAverage(grades);
        int highest = calculateHighest(grades);
        int lowest = calculateLowest(grades);

        System.out.println("Average grade: " + average);
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);

    }

    private static double calculateAverage(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum /grades.length;
    }

    private static int calculateHighest(int[] grades) {
        int max=grades[0];
        for(int i=0;i<grades.length;i++){
            if(grades[i]>max){
                max=grades[i];
            }
        }
        return max;
    }

    private static int calculateLowest(int[] grades) {
        int min=grades[0];
        for(int i=0;i<grades.length;i++){
            if(grades[i]<min){
                min=grades[i];
            }
        }
        return min;
    }
}