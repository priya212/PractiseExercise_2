package program_3;

class Member{
    public String name;
    public int age;
    public float salary;
    Member(String name,int age,float salary)
    {
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
}
public class MemberVariable {
    public static void main(String[] args) {
        Member obj=new Member("priyanka",22,20000);
        System.out.println("Members name:"+obj.name);
        System.out.println("Member salary:"+obj.age);
        System.out.println("Member salary:"+obj.salary);
    }
}
