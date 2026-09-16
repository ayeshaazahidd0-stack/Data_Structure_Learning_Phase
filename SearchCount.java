
public class SearchCount {
	static int linearSearch(int[]a, int key) {

		for(int i=0; i< a.length; i++) {

			if(a[i]==key) {

				return i;
			}
		}
		return -1;
	}
public static void main(String[] args) {
	int count = 0; 
	int[] indices = {0,2,4,6};
	int index = linearSearch(indices, 2);
	if(index != -1) {
		System.out.println(" 2 found at index" + index );
		count++;
		System.out.println("\n Count: " + count);
	} 
	else {
		System.out.println(" 2 not found");
	}
	System.out.println(" Search 100 -> " + linearSearch(indices,2) );

}

}
