package DataStructureQuestion.ArraysQuestion;

import java.util.HashSet;

public class FindAllPairsWithAgivenSum {
    public static void main(String[] args) {
      long  A[] = {1, 2, 4, 5, 7};
       long B[] = {5, 6, 3, 4, 8};
       int X = 9;
      int N=A.length;
      int M=B.length;
      allPairs(A,B,N,M,X);

    }
   static public void allPairs( long A[], long B[], long N, long M, long X) {
        // Your code goes here
        HashSet<Long> st=new HashSet<>();
        for(int i=0;i<M;i++){
            st.add(B[i]);
        }
        for(int i=0;i<N;i++){
            long res=X-A[i];
            if(st.contains(res)){
                System.out.println(A[i]+" "+res);
            }


        }
    }
}

