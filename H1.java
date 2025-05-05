/*TASK-1 using array x make same array y (identical elements) */
class H1 {
    public static void main(String[] args) {
        int[][] x={{12,23,45,56},{5,7,9},{3,34}};
        int[][] y= x;

      /* with Enhanced for loop-
      
      for(int[] next : x){
            for(int next1 : next){
                y[next1]=x[next1];
                }

        }*/
        for(int i=0;i<x.length;i++){
            for(int j=0;j<x[i].length;j++){
                y[i][j]=x[i][j];
            }
        }

        for(int i=0;i<y.length;i++){
            for(int j=0;j<y[i].length;j++){
                System.out.print(y[i][j]+" ");
            }
            System.out.println();
        }
    }
}