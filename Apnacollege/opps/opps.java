package Apnacollege.opps;

public class opps {

    public static void main(String args[]){

Student  p1 = new Student(10); // object creation
Student  p2 = new Student("vishwa"); // object with sting as the parameters
Student  p3 = new Student();// object with no parameters
p3.initial = 0; // assign with value with in the class 
p3.res = 56; 
p3.marks[0] = 40;  //assigning the array value
p3.marks[1] = 50;
p3.marks[2]= 50;

//Shallow copy contractor
Student p4 = new Student(p3);  //passing the object in the another object


// Shallow  -> This refers to the array
// Deep copy -> This makes new array


// changing the array value after the copy constructor
p3.marks[0] = 80;  //assigning the array value
p3.marks[1] = 90;
p3.marks[2]= 100; // THIS WILL EFFECT THE VALUES IN THE COPY CONSTRUCTOR

System.out.println(p1.res);

p1.changePassword("hello world");
p1.sum();
    }
}

  class Student{
int initial ; // default
public int res ; // public
public String name ;
private String password = "$&%&*#@((#$))"; // private
int marks[]; //array

// contructor with no parameters
Student(){
  System.out.println("No parameters");
}

// shallow copy contructor

// Student(Student s1){
//   marks = new int[3];
// this.initial = s1.initial;
// this.res = s1.res;
// this.marks = s1.marks ; // this refers to the same array of the object
// }


// Deep copy constructor  making the new marks array  instead of the referring to the same array
Student (Student s1){
  marks = new int[3];
this.initial = s1.initial;
this.res = s1.res;
for(int i =0; i<marks.length;i++){
  this.marks[i] = s1.marks[i];
}
}

//constructor with Sting parameter
Student(String nameUser){
  marks = new int[3];
  this.name = nameUser;
  System.out.println(this.name);
}

// constructors with int parameters
Student(int val){
  marks = new int[3];
  this.initial = val;
  System.out.println("this is constructor"+initial);
}

//setters
public void changePassword (String ps){
  System.out.println(this.password);
  this.password = ps ;
  System.out.println(this.password);
}

//getters
public String getPassword(){
  return this.password;
}

public void sum (){
System.out.println(9+6);
}


}
