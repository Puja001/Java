package Strings;

public class StringConvert {
	public static void main(String[] args) {
		
				
				String str = " This is a nice day";
				System.out.println(StringConvert.appendNumbers(str));
			}

			public static Object appendNumbers (String str){
				
				int count = 0;
				String[] str1 = str.split(" ");
				for (String num :str1) {
					System.out.print( num+ count++ +" ");
					
				}
				
				return str;
			}
	}

