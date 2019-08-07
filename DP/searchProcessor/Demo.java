package searchProcessor;
import java.io.IOException;
//import parserProcessor.timeCheck;
import sortProcessor.TTreeSort;
import sortProcessor.Leaf;
public class Demo{
	public static void main(String args[]) throws IOException{
		boolean find=false;
		int []array=arrayInit(); 
		Leaf root=new TTreeSort().root(array);
		find=new BreadthTreeSearch().search(root,20000);
	    print(find); 
	}
	
	private static void print(boolean find) {
    if( find == true) {System.out.println("find");}
    else {System.out.println("not find");}
	}
	private static int[] arrayInit() {	
		int[] array=new int[999999];
		java.util.Random r=new java.util.Random(); 
		for(int i=999999,j=0;i>0;i--,j++){
			array[j]=r.nextInt(999999);
			//System.out.println(array[j]);
		}
		return array;
	}
}