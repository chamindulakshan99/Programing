import java.util.ArrayList;
public class Q1{
	
	public static void main(String args[]){
	ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
	ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
	ArrayList<Integer> arrayList3 = new ArrayList<Integer>();
	
	arrayList1.add(2);
	arrayList1.add(4);
	arrayList1.add(6);
	arrayList1.add(8);
	arrayList1.add(10);
	
	arrayList2.add(1);
	arrayList2.add(2);
	arrayList2.add(3);
	arrayList2.add(4);
	
	int size1 = arrayList1.size();
	int size2 = arrayList2.size();
	
	int minSize = size1;
	if(size2<size1){
		minSize=size2;
	}
	
	for(int i=0;i<minSize;i++){
		int value = arrayList2.get(i);
		if( arrayList1.contains(value)){
			arrayList3.add(value);
		}
	}
	
	System.out.println(arrayList3);
	}
}