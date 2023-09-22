public class zeromatrix {

    static void setzero(int matrix[][],int n, int m){

        int answer[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                answer[i][j]=1;
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    for(int k=0;k<m;k++) {
                        answer[i][k] = 0;
                    }
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    for(int k=0;k<n;k++) {
                        answer[k][j] = 0;
                    }
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(answer[i][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
    }

    public static void main(String[] args) {
        int matrix[][]=new int[][]{{0,6,3,0},{1,8,9,3},{6,2,0,7}};
        int n= matrix.length;;
        int m=matrix[0].length;

        setzero(matrix,n,m);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
