class Student {
    String name;

    Student(String n){
        name = n;
    }

    void display(){
        System.out.println("Student Name: " + name);
    }
}

class Main {
    public static void main(String[] args){
        Student s = new Student("Harshith");
        s.display();
    }
}
