import java.math.BigInteger;

public class Encrypt {

	public static void main(String[] args) {
		String value = args[0];
		String key = args[1];
		
		String output = "";
		int j = 0;
		
		for(int i = 0; i < value.length(); i++){
			String tmp = "";
			
			int inputChar = (int)value.charAt(i);
			//String subKey = key.substring(i % key.length(), (i + 2) % key.length());
			String subKey = "";
			subKey = subKey + key.charAt(j % key.length())
					+ key.charAt((j + 1) % key.length());
			
			int keyNum = new BigInteger(subKey, 16).intValue();
			
			output = output + Integer.toHexString(inputChar ^ keyNum);
			
			j = j + 2;
		}
		
		System.out.println(output);
	}

}
