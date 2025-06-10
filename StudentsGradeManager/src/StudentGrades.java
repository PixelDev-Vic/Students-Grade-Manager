public class StudentGrades {

    // Method to calculate average of a student's grades
    public static double calculateAverage(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    public static void main(String[] args) {
        // 2D array to store grades for 3 students, each with 4 grades
        int[][] studentGrades = {
                {85, 90, 78, 92},  // Student 1
                {75, 80, 72, 70},  // Student 2
                {88, 85, 91, 89}   // Student 3
        };

        // Process each student's grades
        for (int i = 0; i < studentGrades.length; i++) {
            System.out.print("Student " + (i + 1) + " grades: ");

            // Print individual grades
            for (int j = 0; j < studentGrades[i].length; j++) {
                System.out.print(studentGrades[i][j]);
                if (j < studentGrades[i].length - 1) {
                    System.out.print(" ");
                }
            }

            // Calculate and print average
            double average = calculateAverage(studentGrades[i]);
            System.out.printf(" | Average: %.2f%n", average);
        }
    }
}