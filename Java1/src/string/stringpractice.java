package string;

public class stringpractice {

	public static void main(String[] args) {
		String a="VELOCITY";
		String b="velocity";
		String c="velo";
		String d="city";
		String e="                thank you          ";
		System.out.println(a.charAt(a.length()-1));
		System.out.println(b.compareToIgnoreCase(c));
		System.out.println(c.concat(d));
		System.out.println(b.contains(d));
		System.out.println(c.contentEquals(c));
		System.out.println(b.endsWith(d));
		System.out.println(b.equals(c));
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(c.indexOf(d));
		System.out.println(e.isBlank());
		System.out.println(e.isEmpty());
		System.out.println(b.lastIndexOf(d));
		System.out.println(b.repeat(2));
		System.out.println(b.replace(c, d));
		System.out.println(c.isEmpty());
		System.out.println(c.resolveConstantDesc(null));
		System.out.println(e.trim());
		System.out.println(b.startsWith(c));
		System.out.println(d.substring(1));
		System.out.println(b.join("*", b,c));
		

		
		
	}
}
