//1. LinkedList basically says kuch nodes/elements hey which are linked....
//2. ArrayList allocates memory dynamically in heaps...

//3. 			ArrayList		LinkedList
//	Insert:		O(n)				O(1)
//	Search:		O(1)?				O(n)


//4. LinkedLIst- Variable size(not fixed)
//			-Non contiguous Memory - we need chungs of data which we can randomly link/connect...

//5. All components of LinkedList are made of Chungs(/NODES) which have 2 infos -> DATA & NEXT 
//			DATA -> stores the value..
//			NEXT -> stores the nextpointer/REFERENCE of the DATA...linking is done by this infor

//6. if we had HEAD node then autoly all the rest Nodes can be found from the next of the successive nodes..

//7. Node jo hota hey in java usko hum ek class ke form mein represnt karte hey...

//8.Suruwat mein LinkedList nahi banti woh NODES banta hey...





















public class LINKEDLISTinJava {
	class Node
	{
		String data;
		Node next;													//next ka type node hota hey cuz woh next NODE ko relate karta hey...
		
		Node(String d)
		{
			data=d;
			next=null;
		}
	}																// creation of NODE CLASS complete
	
	public void addFirst(String data)
	{
		Node newnd=new Node(data);
		if(head==null)
		{
			head=newnd;
			return;
		}
		
		newnd.next=head;
		head=newnd;
	}
	
	
	public static void main(String[] args) 
	{
		LINKEDLISTinJava ll=new LINKEDLISTinJava();
		
	}
}
