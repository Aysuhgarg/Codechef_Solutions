/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ayush
{
    Node head=null;
    class Node {
        int data;
        Node next;
        
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    
    void push(int data)
    {
     Node n =new Node(data);
     n.next=head;
     head=n;
    }
    
    void print()
    {
        Node temp=head;
        
        while(temp!=null)
        {
            System.out.print(" "+temp.data);
            temp=temp.next;
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner (System.in);
		Ayush ob=new Ayush();
		
		ob.push(1);
		ob.push(2);
		ob.push(3);
		ob.push(4);
		ob.push(5);
		
		ob.print();
	}
}
