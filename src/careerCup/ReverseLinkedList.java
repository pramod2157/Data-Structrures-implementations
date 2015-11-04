package careerCup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseLinkedList {
	static LinkList head;
	void add(int item){
		LinkList temp;
		LinkList ll=new LinkList();
		ll.item=item;
		if(head==null)
			head=ll;
		else{
			temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=ll;
			
		}
			
		
	}
	LinkList reverse(LinkList current,LinkList prev){
		if(current==null)
			return null;
		if(current.next==null){
			current.next=prev;
			return current;}
		LinkList rev=reverse(current.next, current);
		
		current.next=prev;
		return rev;
		
				
		
		
	}
	void display()
	{
		LinkList temp=head;
		while(temp!=null)
		{
			System.out.print(temp.item+ " ");
			temp=temp.next;
			
		}
		
	}

	public static void main(String[] args) throws IOException{
		String inp="";
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("tell ur choice");
		ReverseLinkedList rl=new ReverseLinkedList();
		while(inp!="Q"){
			System.out.println("tell ur choice");
			System.out.println("1.add   2.display  3.reverse");
			int choice=Integer.parseInt(br.readLine());
			switch(choice){
            
            case 1: System.out.println("Enter item");
            		int item=Integer.parseInt(br.readLine());
            		rl.add(item);
            		break;
            	
            case 2: rl.display();
            		break;
            case 3: head=rl.reverse(head, null);
            
            default: break;
        }
				
				
				
			}
		
		
		}
		
		
		

	

}
class LinkList{
	
	LinkList next;
	int item;
}