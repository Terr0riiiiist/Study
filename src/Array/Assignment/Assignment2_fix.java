package Array.Assignment;

public class Assignment2_fix {
    static void main() {

        int A[] = {1, 3, 5, 5, 7, 8};
        int B[] = {1, 2, 4, 6, 8, 9, 10};
        int C[] = new int[10];

        int count = 0;
        int i = 0;
        int j = 0;
        while (i < A.length && j < B.length) {
            if (A[i] <= B[j] ) {
                if(count == 0 || A[i] != C[count-1]) {
                    C[count] = A[i];
                    count++;
                }
                i++;

            }
            else  {
               if ( B[j] != C[count-1]){
                C[count] = B[j];
                count++;}
               j++;
            }

        }

            if (i >= A.length) {
                for (; j < B.length; j++) {
                    if (B[j] != C[count-1] && count !=0) {
                        C[count] = B[j];
                        count++;
                    }
                }
            }
                else
                for (; i < B.length; i++) {
                    if (A[i] != C[count-1] && count != 0) {
                        C[count] = A[i];
                        count++;
                    }
                }
        for (int i1 = 0; i1 < count; i1++) {
            System.out.print(C[i1] + " ");
        }
    }
}
