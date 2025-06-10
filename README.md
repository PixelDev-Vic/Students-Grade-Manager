# Student Grades Manager

A simple Java program that manages student grades using 2D arrays and calculates averages for each student.

## Features

- **2D Array Storage**: Efficiently stores grades for multiple students
- **Average Calculation**: Custom method to calculate each student's grade average
- **Formatted Output**: Clean, readable display of grades and averages
- **Modular Design**: Separate method for average calculation promotes code reusability

## How It Works

The program uses a 2D array where:
- Each row represents a student
- Each column represents a grade for that student
- A dedicated method calculates the average for any given student

## Sample Output

```
Student 1 grades: 85 90 78 92 | Average: 86.25
Student 2 grades: 75 80 72 70 | Average: 74.25
Student 3 grades: 88 85 91 89 | Average: 88.25
```

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Any Java IDE or text editor

### Running the Program

1. Clone this repository:
   ```bash
   git clone https://github.com/yourusername/student-grades-manager.git
   ```

2. Navigate to the project directory:
   ```bash
   cd student-grades-manager
   ```

3. Compile the Java file:
   ```bash
   javac StudentGrades.java
   ```

4. Run the program:
   ```bash
   java StudentGrades
   ```

## Code Structure

```
StudentGrades.java
├── calculateAverage()  # Method to calculate grade average
└── main()             # Main method with grade data and output logic
```

## Customization

You can easily modify the program to:
- Add more students by adding rows to the `studentGrades` array
- Add more grades per student by adding columns
- Change the grade values in the array initialization

### Example: Adding a 4th Student

```java
int[][] studentGrades = {
    {85, 90, 78, 92},  // Student 1
    {75, 80, 72, 70},  // Student 2
    {88, 85, 91, 89},  // Student 3
    {92, 88, 85, 90}   // Student 4 (new)
};
```

## Learning Objectives

This program demonstrates:
- **2D Arrays**: How to declare, initialize, and iterate through 2D arrays
- **Method Creation**: Writing reusable methods with parameters and return values
- **Array Processing**: Using loops to process array elements
- **Formatted Output**: Using `printf` for precise number formatting

## Technical Details

- **Language**: Java
- **Concepts**: 2D Arrays, Methods, Loops, Formatted Output
- **Complexity**: O(n*m) where n = number of students, m = number of grades per student

## Contributing

Feel free to fork this repository and submit pull requests for any improvements or additional features.

## License

This project is open source and available under the [MIT License](LICENSE).

## Author

Created as a demonstration of Java fundamentals including 2D arrays and method implementation.
