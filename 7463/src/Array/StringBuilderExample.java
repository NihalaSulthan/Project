package Array;

class StringBuilderExample{  
		public static void main(String[] args) {
			StringBuilder sb1 = new StringBuilder("Hello Ppls World");
			sb1.delete(4, 8);
			System.out.println("Delete method : " + sb1);
			StringBuilder sb2 = new StringBuilder("Hello World");
			sb2.insert(4, "abc");
			System.out.println("Insert : "+sb2);
			StringBuilder sb3 = new StringBuilder("Edubridge.com");
			sb3.replace(1, 4, "Amit");
			System.out.println("Replace : "+sb3);
			StringBuilder sb4 = new StringBuilder("ABCDE");
			System.out.println("Reverse of ABCDE: "+ sb4.reverse());
			StringBuilder sb5 = new StringBuilder("ABCDEF");
			sb5.setCharAt(3, 'x');
			System.out.println("Replacing char at index 3: "+ sb5);

		}
}