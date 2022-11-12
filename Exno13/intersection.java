package exno13;
import java.util.*;
class element implements Comparable<element>
{
    Scanner s=new Scanner(System.in);
    int no;
    element()
    {
        no=s.nextInt();
    }
    public int compareTo(element e1)
    {
        return this.no-e1.no;
    }
    public String toString()
    {
        return ""+no;
    }
}
public class intersection
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,n1;
        System.out.println("Enter how  many nos for list1");
        n=s.nextInt();
        System.out.println("Enter how many nos for list2");
        n1=s.nextInt();
        ArrayList<element> obj=new ArrayList<>();
        ArrayList<element> obj1=new ArrayList<>();
        ArrayList<Integer> obj2=new ArrayList<>();
        System.out.println("Enter elements for list 1");
        for(int i=0;i<n;i++)
        {
            obj.add(new element());
        }
        System.out.println("Enter elements for list 2");
        for(int i=0;i<n1;i++)
        {
            obj1.add(new element());
        }
        Collections.sort(obj);
        Collections.sort(obj1);
        System.out.println("List 1 elements are\t"+obj);
        System.out.println("List 2 elements are\t"+obj1);
        for(element e:obj)
        {
            for(element e1:obj1)
            {
                if(e.no==e1.no)
                {
                    obj2.add(e.no);
                }
            }
        }
        System.out.println("Intersection of two lists\t"+obj2);            
    }
}        
   
