class Student{
  String name;
  int id;
  Student(String n,int i){
     name =n;
     id=i;
  }
  void method(){
    System.out.println("Student name="+name);
    System.out.println("Student id="+id);
  }
  public static void main(String[] args){
    Student std=new Student("clara",18);
       std.method();
  }
}
          
