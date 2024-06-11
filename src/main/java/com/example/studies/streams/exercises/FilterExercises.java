package com.example.studies.streams.exercises;

import java.util.List;

public class FilterExercises {

    public static void main(String[] args) {
        easyExercise1();
        midExercise1();
        midExercise2();
        hardExercise1();
        hardExercise2();
        hardExercise3();
        hardExercise4();
    }

    /**
     * 1. Easy Level:
     * Given a list of integers, filter out the even numbers and collect the odd numbers into a new list.
     * Use Stream API to achieve this.
     */
    public static void easyExercise1() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> oddNumbers = null;
        // Insert your code here
        System.out.println(oddNumbers); // Expected: [1, 3, 5, 7, 9]
    }

    /**
     * 1. Mid Level:
     * Given a list of strings, filter out the strings that have length less than 5 and collect the remaining strings into a new list.
     * Use Stream API to achieve this.
     */
    public static void midExercise1() {
        List<String> words = List.of("apple", "pear", "banana", "kiwi", "strawberry", "grape");
        List<String> longWords = null;
        // Insert your code here
        System.out.println(longWords); // Expected: [apple, banana, strawberry]
    }

    /**
     * 2. Mid Level:
     * Given a list of integers, filter out the numbers greater than 10 and collect the remaining numbers into a new list.
     * Use Stream API to achieve this.
     */
    public static void midExercise2() {
        List<Integer> numbers = List.of(5, 15, 8, 12, 20, 3, 9);
        List<Integer> smallNumbers = null;
        // Insert your code here
        System.out.println(smallNumbers); // Expected: [5, 8, 3, 9]
    }

    /**
     * 1. Hard Level:
     * Given a list of persons, filter out the persons who are older than 30 years and collect the remaining persons into a new list.
     * Use Stream API to achieve this.
     */
    public static void hardExercise1() {
        List<Person> persons = List.of(
                new Person("Alice", 25),
                new Person("Bob", 35),
                new Person("Charlie", 28),
                new Person("David", 40)
        );
        List<Person> youngPersons = null;
        // Insert your code here
        System.out.println(youngPersons); // Expected: [Person{name='Alice', age=25}, Person{name='Charlie', age=28}]
    }

    /**
     * 2. Hard Level:
     * Given a list of strings, filter out the strings that do not contain the letter 'a' and collect the remaining strings into a new list.
     * Use Stream API to achieve this.
     */
    public static void hardExercise2() {
        List<String> words = List.of("apple", "pear", "banana", "kiwi", "strawberry", "grape");
        List<String> wordsWithA = null;
        // Insert your code here
        System.out.println(wordsWithA); // Expected: [apple, banana, pear, grape]
    }

    /**
     * 3. Hard Level:
     * Given a list of integers, filter out the prime numbers and collect them into a new list.
     * Use Stream API to achieve this.
     */
    public static void hardExercise3() {
        List<Integer> numbers = List.of(2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> primeNumbers = null;
        // Insert your code here
        System.out.println(primeNumbers); // Expected: [2, 3, 5, 7]
    }

    /**
     * 4. Hard Level:
     * Given a list of employees, filter out the employees who have a salary less than 50000 and collect the remaining employees into a new list.
     * Use Stream API to achieve this.
     */
    public static void hardExercise4() {
        List<Employee> employees = List.of(
                new Employee("Alice", 45000),
                new Employee("Bob", 55000),
                new Employee("Charlie", 60000),
                new Employee("David", 48000)
        );
        List<Employee> highSalaryEmployees = null;
        // Insert your code here
        System.out.println(highSalaryEmployees); // Expected: [Employee{name='Bob', salary=55000}, Employee{name='Charlie', salary=60000}]
    }

    // Solution Methods

    public static void easyExercise1Solution() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> oddNumbers = numbers.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());
        System.out.println(oddNumbers); // Expected: [1, 3, 5, 7, 9]
    }

    public static void midExercise1Solution() {
        List<String> words = List.of("apple", "pear", "banana", "kiwi", "strawberry", "grape");
        List<String> longWords = words.stream()
                .filter(w -> w.length() >= 5)
                .collect(Collectors.toList());
        System.out.println(longWords); // Expected: [apple, banana, strawberry]
    }

    public static void midExercise2Solution() {
        List<Integer> numbers = List.of(5, 15, 8, 12, 20, 3, 9);
        List<Integer> smallNumbers = numbers.stream()
                .filter(n -> n <= 10)
                .collect(Collectors.toList());
        System.out.println(smallNumbers); // Expected: [5, 8, 3, 9]
    }

    public static void hardExercise1Solution() {
        List<Person> persons = List.of(
                new Person("Alice", 25),
                new Person("Bob", 35),
                new Person("Charlie", 28),
                new Person("David", 40)
        );
        List<Person> youngPersons = persons.stream()
                .filter(p -> p.getAge() <= 30)
                .collect(Collectors.toList());
        System.out.println(youngPersons); // Expected: [Person{name='Alice', age=25}, Person{name='Charlie', age=28}]
    }

    public static void hardExercise2Solution() {
        List<String> words = List.of("apple", "pear", "banana", "kiwi", "strawberry", "grape");
        List<String> wordsWithA = words.stream()
                .filter(w -> w.contains("a"))
                .collect(Collectors.toList());
        System.out.println(wordsWithA); // Expected: [apple, banana, pear, grape]
    }

    public static void hardExercise3Solution() {
        List<Integer> numbers = List.of(2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> primeNumbers = numbers.stream()
                .filter(FilterExercises::isPrime)
                .collect(Collectors.toList());
        System.out.println(primeNumbers); // Expected: [2, 3, 5, 7]
    }

    public static void hardExercise4Solution() {
        List<Employee> employees = List.of(
                new Employee("Alice", 45000),
                new Employee("Bob", 55000),
                new Employee("Charlie", 60000),
                new Employee("David", 48000)
        );
        List<Employee> highSalaryEmployees = employees.stream()
                .filter(e -> e.getSalary() >= 50000)
                .collect(Collectors.toList());
        System.out.println(highSalaryEmployees); // Expected: [Employee{name='Bob', salary=55000}, Employee{name='Charlie', salary=60000}]
    }

    private static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // Model classes
    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "Person{name='" + name + "', age=" + age + "}";
        }
    }

    static class Employee {
        private String name;
        private int salary;

        public Employee(String name, int salary) {
            this.name = name;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public int getSalary() {
            return salary;
        }

        @Override
        public String toString() {
            return "Employee{name='" + name + "', salary=" + salary + "}";
        }
    }
}
