package practice;

public class StringToCharacterArray {
	public static void main(String[] args) {
		String string ="Hello world";
		char[]stringArray;
		stringArray =string.toCharArray();
		for (int index = 0; index <stringArray.length; index++)
	System.out.print(stringArray[index]);
	}

}
