
public class Question20 {
	int value(char r) {
		if (r == 'I')
			return 1;
		if (r == 'V')
			return 5;
		if (r == 'X')
			return 10;
		if (r == 'L')
			return 50;
		if (r == 'C')
			return 100;
		if (r == 'D')
			return 500;
		if (r == 'M')
			return 1000;
		return -1;
	}
	int rtd (String str) {
		int  res = 0;
		
		for (int i = 0; i <str.length(); i++) {
			int x1 = value(str.charAt(i));
			
			if (i + 1 < str.length()) {
				int x2 = value(str.charAt(i+1));
				
				if (x1 >= x2) {
					res = res + x1;
				}else {
					res = res + x2-x1;
					i++;
				}
			}else {
				res = res+ x1;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		Question20 ob = new Question20();
		
		String str= "MMDCVI";
		System.out.println("Roman Numeral - "+ str + " in Integer form is: " + ob.rtd(str));
				
	}

}
