class Solution {
    Node sortedMerge(Node head1, Node head2) {
        // code here
        Node a=new Node(0);
        Node d=a;
        while(head1!=null&&head2!=null){
            if(head1.data<head2.data){
                d.next=new Node(head1.data);
                d=d.next;
                head1=head1.next;
            }
            else{
               
                d.next=new Node(head2.data);
                d=d.next;
                head2=head2.next;
            }
        }
        while(head1!=null){
             d.next=new Node(head1.data);
                d=d.next;
                head1=head1.next;
        }
        while(head2!=null){
            d.next=new Node(head2.data);
            d=d.next;
            head2=head2.next; 
        }
        return a.next;
    }
}
