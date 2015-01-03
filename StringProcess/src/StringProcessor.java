
public class StringProcessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseString("abcdefg"));
	}

	public static String reverseString(String str) {
        //Convert str to a char array
        char[] tempArray = str.toCharArray();
        //copy items to the new array in reverse order.
        char[] reverseArray = new char[str.length()];
        int i = str.length() - 1;
        for (char c : tempArray) {
            reverseArray[i] = c;
            System.out.println(reverseArray[i]);
            i = i - 1;
            if (i < 0) break;            
        }
        
        //replace str content		
		str = new String(reverseArray);
		return str;
	}
}
