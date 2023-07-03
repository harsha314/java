# Java

-   **JDK** consists of compilers, debuggers
    -   **JRE** consists of libraries
        -   **JVM** executes bytecode

## 1. Basics

### Primitive Data Types

-   **boolean**, **byte**, **short**, **int**, **long**, **float**, **double**, **char**

### Basic I/O

```java
class helloWorld{
  public static void main(String []args){
    System.out.println("Hello There");
  }
}
```

```java
class helloWorld {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name : ");
    String Name = sc.nextLine();
    // String Name = sc.next();
    // This reads only the next space
    System.out.println("Hello, " + Name);
    sc.close();
  }
}
```

### Non-Primitive Data Types

#### Array

```java
class Array{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), i;
        int []arr = new int[N];
        for (i = 0; i < N; ++i) {
            arr[i] = sc.nextInt();
        }
        for (i = 0; i < N; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
        sc.close();
    }
}
```

-   Arrays should be compared with **Arrays.equals** method

```java
int[] arr0 = new int[]{0, 1, 2} ;
int[] arr1 = new int[]{0, 1, 2} ;

System.out.println(arr0.equals(arr1));
System.out.println(Arrays.equals(arr0, arr1));
```

#### String

```java
String a = "hello there" ;
String b = "hello" + " there" ;
String c = "hello" ;
System.out.println(b.equals(a)) ;
System.out.println(String.format("%s == %s : %b", a, b, a.equals(b))) ;
```

-   Non-primitive Data types in java should always be compared with equals method
-   Double equals check only if they refer the same address(object)

```java

class string{
    public static void main(String []args){
        String s1 = new String("hello");
        String s2 = new String("hello");
        // Prints false
        System.out.println(s1 == s2);
        // Prints true
        System.out.println(s1.equals(s2));

    }
}
```

## 2. Exception Handling

### 2.1 Basics

```java
class Exception{
    public static void main(String []args){
        try {
            Integer.parseInt("abcd");
        } catch (Exception e) {
            System.out.println("There is some error");
        } finally {
            System.out.println("After try/catch");
        }

    }
}
```

-   **finally** block should not contain any return because it overrides other return statements.
-   **finally** is mostly unused.

```java
public class Finally{
    public static int printANumber1() {
        // This method always returns 3 ;
        try {
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }

}
```

```java
import java.util.InputMismatchException;

class helloWorld {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int A = sc.nextInt();
            int B = sc.nextInt();
            double result = (1.0f * A) / B;
            System.out.println("A / B = " + result);
            sc.close();
        } catch (InputMismatchException ime){
            System.out.println("Invalid input" + ime);
        } catch(ArithmeticException ae) {
                System.out.println("A/B might cause errors");
        } catch(Exception e){
            System.out.println("Some other error!!!" + e);
        }
    }
}
```

### 2.2 Checked & Unchecked Exception

-   **Checked Exception** are compile-time exceptions. Ex : FileNotFoundException, Exception, SQLException

-   Resolution : place them in try-catch blocks, use _throws_ in method signatures.

```java
import java.io.*;
import java.util.Scanner;

class CheckedException{
    public static void main(String []args) {
        try (Scanner sc = new Scanner(System.in)) {
            String fileName = sc.nextLine();
            readFile(fileName);
        } catch (FileNotFoundException fnfe){
            System.out.println("File not found ");
        }catch(Exception e){
            System.out.println("Error : " + e);
        }
    }
    public static void readFile(String fileName) throws Exception {
        FileReader f = new FileReader(fileName);
        BufferedReader br = new BufferedReader(f);
        String line = null;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }
}
```

-   Unchecked Exception are run-time exceptions. Ex : ArithmeticException, NullPointerException, IndexOutOfBoundsException

```java
import java.util.*;

class UncheckedException {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int A = sc.nextInt();
            String b = sc.next();
            int B = Integer.parseInt(b);
            double Q = (1.0F * A) / B;
            Sytem.out.println("A / B : " + Q);
        } catch (InputMismatchException ime){
            System.out.println("b can't be converted to an integer");
        } catch (ArithmeticException ae){
            System.out.println("You can't divide by zero") ;
        } catch(Exception e){
            System.out.println("Uncaught Error" + e) ;
        }
    }
}
```

-   **Errors** are unrecoverable situations which are meant not to be handled by code, but to be logged.

-   **Throwable** is the Superclass of Exceptions and Errors

## 3. Classes, Objects, Interfaces

#### 3.1 Constructors

```java

class cat {
    public String name ;
    public cat(){
        this.name = 'kitty' ;
    }
    public cat(String name){
        this.name = name ;
    }
}

```

#### Inheritance

-   One of the core functions of OOP

#### this Keyword

-   Constructor Chaining

```java
class Animal{
    String name ;
    String food ;
    public Animal(){}
    public Animal(String name){ this.name = name; }
    public Animal(String name, String food){
        // Constructor Chaining using this
        this(name);
        this.food = food;
    }
}
```

#### super Keyword

```java
class Animal{
    String name ;
    String food ;
    public Animal(){}
    public Animal(String name) { this.name = name; }
    public Animal(String name, String food) {
        this(name);
        this.food = food;
    }
    public shout(){ System.out.println("Hello"); }
}

class Cat extends Animal {
    public Cat(){}
    public Cat(String name){ super(name); }
    public Cat(String name, String food){
        // Constructor Chaining using super
        super(name, food);
    }
    public shout(){
        super.shout() ;
        System.out.println("Meow");
    }
}

```

#### Interfaces, Abstract Class

-   An Interface is a programming construct that defines a contract or a set of rules that classes can adhere to. It provides a way to define a blueprint for a group of related classes to ensure consistency in behavior.

```java
interface MyInterface {
    public void myMethod1() ;
    public void myMethod2() ;
}
```

-   **Default Methods** are non-abstract methods in interface.

```java
interface MyInterface {
    default public void myDefaultMethod1() {
        System.out.println("Default Method 1 invoked") ;
    }
}
```

-   **Functional Interface** is an interface with only one abstract method, which may have non-abstract methods.

```java
@FunctionalInterface
interface MyInterface {
    public void execute() ;
    default public void log() {
        System.out.println("Logger Method invoked") ;
    }
}
```

-   **Method References** are a concise way to refer to methods without executing them. They provide a shorthand notation for lambdas that invoke a single method.
    -   **Static Method Reference**
    -   **Object Method Reference**
    -   **Constructor Reference**

```java
class Person{
    String name ;
    public Person(String name) { this.name = name; }
}

List<String> names = Arrays.asList("Luffy", "Zoro", "Itachi", "Brook", "Tobi") ;

List<Person> people = names.stream().map(Person::new)
                .collect(Collectors.toList());

```

## 4. Collections & Streams (Java 8)

### Collections

### Streams

-   Streams API/package enable functional style of prorgramming
-   Stream does not store elements. It simply conveys elements from a source such as a data structure, an array, or an I/O channel, through a pipeline of computational operations.
-   Intermediate Operations, Terminal Operations

```java
// Streaming an array
String[] names = { "luffy", "zoro", "sanji", "nami", "usopp" };

Arrays.stream(names)
        .forEach(name -> System.out.println(name));
        // forEach.(System.out::println);
```

-   **map**, **filter**

```java
List<Integer> nums = Arrays.asList(2, 4, 6, 8, 10);

nums.stream()
    .filter(num -> num % 4 == 0)
    .forEach(num -> System.out.println(num)) ;
```

-   **flatMap**

```java
List<List<Integer>> arr = Arrays.asList(
    Arrays.asList(0, 1, 2),
    Arrays.asList(3, 4, 5)
);

arr.stream()
    .flatMap(a -> a.stream()) // flatMap(Collection::stream)
    .forEach(number -> System.out.println(number));
```

```java
int[][] arr = {{0, 1, 2}, {3, 4, 5}};

Arrays.stream(arr)
    // boxed method converts IntStream to Stream<Integer>
    .flatMap(a -> Arrays.stream(a).boxed())
    .forEach(a -> System.out.println(a));
```

-   **collect**

```java
int[] arr = {0, 1, 4, 2, 3};

List<Integer> list = Arrays.stream(arr)
                        .boxed()
                        .collect(Collectors.toList());
```

```java
int[][] arr = { { 0, 1, 2 }, { 3, 4, 5 } };

List<List<Integer>> list = Arrays.stream(arr)
                                .map(a -> Arrays.stream(a).boxed().collect(Collectors.toList()))
                                .collect(Collectors.toList());
```

-   Consumer is a Functional Interface which returns void
-   Predicate is a Functional Interface which accepts T t returns boolean

```java
Consumer<Integer> consumer = (num) -> {
    System.out.println(num);
};
consumer.accept(5);

Predicate<Integer> predicate = (num) -> {
    return num % 2 == 0 ;
};
predicate.test(5) ;

// Second Type is for the return type
Function<Integer, Integer> function = (v1) -> {
    return v1 * 2 ;
};
function.apply(2) ;


Supplier<Integer> supplier = () -> {
    return 5 ;
};

supplier.get() ;
```

-   parallelStream() processes the stream concurrently across multiple threads

-   Optional is a class introduced in Java 8 that is designed to represent an optional value. It is used to handle situations where a value may or may not be present. It helps to avoid NullPointerExceptions and provides a more expressive way to handle nullability in Java code.

## 5. File Handling

```java
try (FileReader fr = new FileReader("<file-location>")) {
    int data = fr.read();
    while (data != -1) {
        System.out.print((char) data);
        data = fr.read();
    }
} catch (Exception e) {
    System.out.println("Excpetion Occured: " + e.getLocalizedMessage());
}
```

## java.lang

-   Core Functionality of java
    1. Object
    1. String
    1. Wrapper Classes
    1. Throwable, Exception, RuntimeException Classes
    1. Thread, Runnable Classes
    1. Class

## Concurrency

### Threads

#### Intro

```java
Thread myThread1 = new Thread(() -> {
    System.out.println("Hello") ;
})

Thread myThread2 = new Thread() {
    @Override
    public void run() {
        System.out.println("Hello") ;
    }
}

```

#### Thread join method

-   join method waits until the thread is executed

```java
int n = 10;

Thread[] threads = new Thread[n];

for (int i = 0; i < n; ++i) {
    final int j = i;
    threads[i] = new Thread(() ->  System.out.println(j));
}

for (int i = 0; i < n; ++i) {
    try {
        threads[i].start() ;
        threads[i].join() ;
    } catch (Exception e) {
        System.out.println("Exception Occured : " + e.getLocalizedMessage());
    }

}
```

-   **volatile** can only be used in field declaration, volatile fields are directly read from main memory and are never cached. volatile ensures visibility across threads

```java
class VolatileExample {
    private volatile boolean flag = false;

    public void start() {
        Thread writerThread = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            flag = true;
            System.out.println("Flag set to true");
        });

        Thread readerThread = new Thread(() -> {
            while (!flag) {
                // Busy-wait until flag is set to true
            }
            System.out.println("Flag is now true");
        });

        readerThread.start();
        writerThread.start();
    }

}

VolatileExample example = new VolatileExample();
example.start();
```

#### Synchronized keyword

-   **synchronized** ensures atomicity and visibility
-   **synchronized** methods

```java
// only one thread executes the method at any given time
public synchronized void likeAndSubscribe() {

}
```

### Concurrency & Parallelism

-   Concurrency can be achieved even with 1 CPU, Parallelism requires that computing be done on 2 CPUs.

### Future

-   When a Callable is submitted to the executorPool, it returns a Future (Generic of Callable return)

### Completable Future

-   Futures Improved
