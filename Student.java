class Student {
    String name;
    int age;
    int rollNumber;
    String house;
    public Student(String name,int age,int rollNumber,String house){
     this.name=name;
     this.age=age;
     this.rollNumber=rollNumber;
     this.house=house;
    }
    @Override
    public String toString() {
        return "Student Detail:{name:"+name+",age:"+age+",roll Number:"+rollNumber+",house:"+house+"}";
    }
    public static void main(String[] args) {
       Student sb = new Student("Shriya",16, 5,"qwerty house");
       System.out.println(sb);
    }
}
