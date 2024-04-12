package BasicSA;
   class Student1{
    private String name;
    public int getAge(){
        return getAge();
    }
    public void setAge(int age){
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void show(){
        System.out.println(name + " " + name);
        
    }
   }
class Test {
    public static void main(String[]args){
        Student1 obj = new Student1();
        Student1 obj1 = new Student1();
        obj.setAge(18);
        obj1.setAge(10);
        obj.setName("ram");
        obj1.setName("arun");
        int stud1Age = obj.getAge();
        System.out.println(stud1Age);
    }
}