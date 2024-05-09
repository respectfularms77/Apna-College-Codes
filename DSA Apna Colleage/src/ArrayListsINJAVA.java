//1. Collection Frameworks in java are Classes,Interfaces,Functions are the basic parts of the DATA STRUCTURE and used to implement and to enhance it so that we dont need to build everything from the scratch.
//2. Arraylist are somewhat like arrays but different from the arrays.
//3.ARRAYS	-> Memory is in Continuous(datas are stored in a sequential format) 	&	Size of an array is fixed.
//4.ARRAYLIST	-> Memory is non Continuous(datas are not stored in a sequential format) & Size can be variable until code ki memory bhar nahi jaati..
//3.ARRAYS	-> Isme hum Primitives(Int,Float) and Non-Primitives(Only Objects) store kar sakte hey cuz....primitves ke liye hume memory pehle se allocate karwani padti hey.
//4.ARRAYLIST	-> Isme hum sirf Non Primitive(Objects) store karke rakh sakte hey cuz they are DYNAMICALLY ALLOCATED IN MEMORY using the HEAPS...

//5. Operations will Do in ArrayLIst....
//	  Addition of elements,		Getting an element,		Modifying an element,	Deletion/Removal of an Element,	Itarative functions on Arraylist.. 

//6.Arraylist can only be created of OBJECTS therefore we cant use [Interger Primitve Datatypes] but we can use the INTEGER CLASS to store integers...
























import java.util.ArrayList;
import java.util.Collections;
public class ArrayListsINJAVA {
	public static void main(String[] args) {
		
		
		
		
		//SYNTAX
		ArrayList<Integer> l1= new ArrayList<>();			//ArrayList<Integer> l1= new ArrayList<Integer>(); is also a syntax
//		ArrayList<String> L2= new ArrayList<>();
//		ArrayList<Boolean> L3= new ArrayList<>();
//		ArrayList<Float> L4= new ArrayList<>();
		
		
		
		//SIMPLE OPERATIONS..
		//ADDing Elements...
		l1.add(10);	l1.add(30);	l1.add(50);					//Like this is a sequential type of additon..pehle ek,then do
		
		//Printing the List...
		System.out.println(l1);
		
		//Getting an element
		System.out.println(l1.get(1)); 						//We need to pass the index of the Member we need to get..
		
		//Adding an element Inbetween
		l1.add(1,20);										//We use add funtion but after placing the index..
		System.out.println(l1);
		
		//Setting an element	->	pehle se jo element rakha hua hey usko hum change krne walle hey
		l1.set(2,5);
		System.out.println(l1);
		
		//Removing an elemnt
		l1.remove(3);
		System.out.println(l1);
		
		//Counting the Number of elements present in the Array List..
		System.out.println(l1.size());
		
		
		
		
		
		
		
		//LOOPS
		for(int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i)+" ");
		}
		
		
		
		//Sorting the Elements in ArrayList....
		Collections.sort(l1);
		System.out.println(l1);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
