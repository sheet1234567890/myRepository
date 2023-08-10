/*import java.util.*;
class PriorityQueueExample
{
  public static void main(String[] args)
  {
  	PriorityQueue<String>q = new PriorityQueue();
  	q.add("sheetal");
  	q.add("surbhi");
  	q.add("minakshi");
  	q.add("ishwari");
  	q.add("null");
  	q.add("aaa");
  	System.out.println("head :"+q.element());
  	System.out.println("head :"+q.peek());
  	System.out.println("iterating the queue element :");
  	Iterator i = q.iterator();
  	while(i.hasNext())
  	{
  		System.out.println(i.next());
  	}
  	q.remove();
  	System.out.println(q);
  	q.poll();
  	System.out.println(q);
  	System.out.println("atter removing**************************");
  	Iterator<String> i1 = q.iterator();
  	while(i1.hasNext())
  	{
  		System.out.println(i1.next());
  	}
  }
}*/
import java.util.*;  
class Book implements Comparable<Book>{  
int id;  
String name,author,publisher;  
int quantity;  
public Book(int id, String name, String author, String publisher, int quantity) {  
    this.id  = id;  
    this.name  = name;  
    this.author  = author;  
    this.publisher  = publisher;  
    this.quantity  = quantity;  
}  
public int compareTo(Book b) {  
    if(id>b.id){  
        return 1;  
    }else if(id<b.id){  
        return -1;  
    }else{  
    return 0;  
    }  
}  
}  
public class PriorityQueueExample {  
public static void main(String[] args) {  
    Queue<Book> queue=new PriorityQueue<Book>();  
    //Creating Books  
    Book b1=new Book(121,"Let us C","Yashwant Kanetkar","BPB",8);  
    Book b2=new Book(233,"Operating System","Galvin","Wiley",6);  
    Book b3=new Book(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
    //Adding Books to the queue  
    queue.add(b1);  
    queue.add(b2);  
    queue.add(b3);  
    System.out.println("Traversing the queue elements:");  
    //Traversing queue elements  
    for(Book b:queue){  
    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
    }  
    queue.remove();  
    System.out.println("After removing one book record:");  
    for(Book b:queue){  
        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
        }  
}  
}  