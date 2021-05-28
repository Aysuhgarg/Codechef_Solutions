public  class listone {

    public  static class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
        }
    }

public  static class Linkedlist{
        Node head;
        Node tail;
        int size;

        public void add(int val)
        {
            Node n=new Node(val);

            if(head==null)
            {
                head=n;
                tail=n;
                size=size+1;
            }
            else
            {
                tail.next=n;
                tail=n;
                size=size+1;
            }
        }

        public void display()
        {
            Node root=head;
            while(root!=null)
            {
                System.out.print(root.data+"->");
                root=root.next;
            }
        }


}
public static void main(String args[])
{
    Linkedlist list=new Linkedlist();
    list.add(10);
    list.add(20);
    list.add(30);
    list.add(40);
    list.add(50);
    list.add(60);
    list.add(100);
    list.add(101);
    list.display();
}


}
