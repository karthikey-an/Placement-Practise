import java.util.*;
public class Student {
    class Node
    {
         String name;
         long phone;
         int age;
        Node next;

        public Node(String name,long phone,int age)
        {
            this.name = name;
            this.phone = phone;
            this.age = age;
            this.next=null;
        }
    }
    Node start = null;
    Node end = null;
    void insert(String name,long phone,int age)
    {
        Node newnode = new Node(name, phone, age);
        if(start == null)
        {
            start = newnode;
            end = newnode;
        }
        else
        {
            newnode.next = start;
            start = newnode;
        }
    }
    void display()
    {
        Node temp = start;
        while(temp!=null)
        {
            System.out.println("-------------------------------");
            System.out.println("Name: "+temp.name);
            System.out.println("Mobile number: "+temp.phone);
            System.out.println("Age: "+temp.age);
            System.out.println("-------------------------------");
            temp=temp.next;
        }
    }
    void delete(String name)
    {
        if(name.equals(start.name))
        {
            start = start.next;
            return;
        }
        Node c = start, p = null;
        while(c != null && !c.name.equals(name))
        {
            p=c;
            c=c.next;
        }
        p.next = c.next;
        if(p.next==null)
        {
            end=p;
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        int op;

        while(true)
        {
            System.out.println("1:Enter Details 2:Display Name list  3:Delete a student details 4:Exit");
            op=sc.nextInt();
            switch (op) {
                case 1:
                    sc.nextLine();
                    System.out.println("Enter Student name: ");
                    String name = sc.nextLine();
                    System.out.println("Enter Mobile Number: ");
                    Long phone = sc.nextLong();
                    System.out.println("Enter age: ");
                    int age = sc.nextInt();
                    s.insert(name,phone,age);
                    break;

                case 2:
                    s.display();
                    break;
                
                case 3:
                    sc.nextLine();
                    String n1;
                    System.out.println("Enter a Student name: ");
                    n1=sc.nextLine();
                    s.delete(n1);
                    break;
                
                case 4:
                    return;

                default:
                    System.out.println("Invalid choice");
                    break;

            }
        }
    }
}
