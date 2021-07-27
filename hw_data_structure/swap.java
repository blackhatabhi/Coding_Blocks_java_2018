package hw_data_structure;

import java.util.Scanner;

/**
 * @author:- Abhinav_kumar
 * @email:- abhinavpnp.kumar@gmail.com
 * @date :-29-Oct-2018
 */
public class swap {
	private class Node 
	{ 
	    int data; 
	    Node next; 
	    Node(int d) 
	    { 
	        data = d; 
	        next = null; 
	    } 
	} 

	static Node head; 
	  
   
    public void swapNodes(int x, int y) 
    { 
        if (x == y) return; 
  
        Node prevX = null, currX = head; 
        while (currX != null && currX.data != x) 
        { 
            prevX = currX; 
            currX = currX.next; 
        } 
  
        Node prevY = null, currY = head; 
        while (currY != null && currY.data != y) 
        { 
            prevY = currY; 
            currY = currY.next; 
        } 
  
        if (currX == null || currY == null) 
            return; 
  
        if (prevX != null) 
            prevX.next = currY; 
        else 
            head = currY; 
  
        if (prevY != null) 
            prevY.next = currX; 
        else // make x the new head 
            head = currX; 
  
        // Swap next pointers 
        Node temp = currX.next; 
        currX.next = currY.next; 
        currY.next = temp; 
    } 
  
    public void push(int new_data) 
    { 
        Node new_Node = new Node(new_data); 
  
        new_Node.next = head; 
  
        head = new_Node; 
    } 
  
    void printReverse(Node head) 
    { 
        if (head == null) return; 
  
        printReverse(head.next); 
  
        System.out.print(head.data+" "); 
    } 
    public void printList() 
    { 
        Node tNode = head; 
        while (tNode != null) 
        { 
            System.out.print(tNode.data+" "); 
            tNode = tNode.next; 
        } 
    } 
    public static void main(String[] args) 
    { 
    	swap llist = new swap(); 
  
        
        Scanner Scn = new Scanner(System.in);
        
		int n = Scn.nextInt();
		for (int i = 0; i < n; i++) {
			int j = Scn.nextInt();
			llist.push(j);
		}
		int k=Scn.nextInt();
        int m=Scn.nextInt();
        llist.swapNodes(k, m); 
  llist.printReverse(head);
       
    } 
}
