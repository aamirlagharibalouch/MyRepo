public class operators{
public static void main(String ar[]){
	
	System.out.println(10<9);
	System.out.println(10<=9);
	System.out.println(10==9); //f

	System.out.println();

	System.out.println(9!=10);//t
	System.out.println(10>9);
	System.out.println(10>=9);

	System.out.println();

	System.out.println(10<=9);//f
	System.out.println(10!=10);

	System.out.println();

	System.out.println(10<=9 || 10!=9);//t
	System.out.println(10>=9 && 9!=10);

	System.out.println();
	
	System.out.println((10==9 && 10<=9) && (10>=9 && 10<=9));//f
	System.out.println((10!=9 && 10>=9) || (10>=9 && 10<=9));//t

	System.out.println("This is Last Statement");
}
}