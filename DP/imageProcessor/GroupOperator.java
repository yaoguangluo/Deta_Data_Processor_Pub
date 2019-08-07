package imageProcessor;
public class GroupOperator {	
	public double[][] GO(int[][] kener,int[][] refG,int[] size ){
		double[][] Imagex=  new double[size[0]][size[1]];
		double sum;
		int filterHeight=kener.length;
		int filterWidth= kener[0].length;
		for(int i= filterHeight/2; i<refG.length-(int)filterHeight/2; i++){
			for(int j= filterWidth/2; j<refG[0].length-(int)filterWidth/2; j++){
				sum= 0;
				for(int k= -filterHeight/2; k<= filterHeight/2; ++k){
					for(int l= -filterWidth/2; l<= filterWidth/2; ++l){
						sum+= (refG[i + k][j + l] * kener[k+ filterHeight/2][l+ filterWidth/2]);
					}
				}
				Imagex[i][j] =sum;
			}
		}
		return Imagex;
	}	
}