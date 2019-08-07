package sortProcessor;
import java.io.IOException;
//import parserProcessor.timeCheck;
public class Demo extends Thread{
	public static void main(String args[]) throws IOException, InterruptedException{
		int []array=arrayInit(); 	    
		array=new Quick_6D_luoyaoguang_Sort().sort(array);
		print(array);
	}

	private static void print(int[] a) {
		int count=0;
		for(int i=0;i<a.length-1;i++){
			if(a[i]>a[i+1]){
				count++;
			}
		}
		System.out.println(count);
	}

	private static int[] arrayInit() {
		int[] array=new int[9999999];
		java.util.Random r=new java.util.Random(); 
		for(int i=9999999,j=0;i>0;i--,j++){
			array[j]=r.nextInt();
		}
		return array;
	}
}