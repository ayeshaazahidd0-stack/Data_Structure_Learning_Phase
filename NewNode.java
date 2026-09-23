package LinkedList;

public class NewNode {
int data;
NewNode next;
NewNode(int data){
	  this.data = data;
	  this.next = null;
  }
  public static void main(String[] args) {

	  NewNode head = new NewNode(10);
	  		  head.next = new NewNode(20);
	          head.next.next = new NewNode(30);
	  
	  NewNode A = new NewNode(01);
	  A.next = head;
	  head = A;
	  NewNode temp = head;
	  		while(temp != null) {
	  System.out.print(temp.data+ "->");
		  temp = temp.next; 
	  }
	  System.out.println("null");
  }
}
