package parser;

public class LexerHelper {

	public static int lexemeToInt(String str) {
		try {
			return Integer.parseInt(str);
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
		return -1;
	}

	public static char lexemeToChar(String text) {
		if (text == null || text.length() == 0) {
			return 0;
		}
		if (text.length() == 3) {
			char[] array = text.toCharArray();
			if (array[0] == '\'' && array[2] == '\'') {
				return array[1];
			}
		}

		if (text.length() == 4) {
			char[] array = text.toCharArray();
			if (array[0] == '\'' && array[3] == '\'') {
				if (array[1] == '\\') {
					char c = array[2];
					if (c == 'n') {
						return '\n';
					}else if (c == 't')
						return '\t';
					else if ( instanceof Number) {
						
					}
				}
			}
		}
		
		if(text.length() >= 3) {
			
		}
		return 0;
	}

	public static double lexemeToReal(String text) {
		try {
			return Double.parseDouble(text);
		} catch (NumberFormatException e) {
			System.err.println(e);
		}
		return -1;
	}
}
