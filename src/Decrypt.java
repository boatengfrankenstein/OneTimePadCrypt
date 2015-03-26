import java.math.BigInteger;

public class Decrypt {
	
	public static void main(String[] args){
		String value = args[0];
		String key = args[1];
		
		String output = "";
		int j = 0;
		
		for(int i = 0; i < value.length(); i = i + 2){
			String valueHex = "" + value.charAt(i) + value.charAt(i + 1);
			String subKey = "" + key.charAt(j % key.length())
					+ key.charAt((j + 1) % key.length());
			
			int valueNum = new BigInteger(valueHex, 16).intValue();
			int keyNum = new BigInteger(subKey, 16).intValue();
			
			char c = (char)(valueNum ^ keyNum);
			
			output = output + c;
			
			j = j + 2;
		}
		
		System.out.println(output);
	}
	
}
