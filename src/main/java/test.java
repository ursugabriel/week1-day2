import org.apache.commons.lang3.ArrayUtils;


public class test {

    public static void main(String[] args) {
        //remove an element from a given array
        int arr1[]={1,2,3,4,5,6,7,8,9};
        //int newArr[]=ArrayUtils.removeElement(arr,2);
        int newArr[]=ArrayUtils.remove(arr1,2);
        for(int ar:newArr){
            System.out.print(ar +" ");
        }



        int arr2[]={1,2,3,4,5,6,7,8,9};
        int t = (arr2.length)-1;
        int newArr2[]=new int[t];
        // the number we want to remove is on this position
        int position=2;
        for(int i=0;i<arr2.length;i++){
            if(i==position){
                break;
            }else{
                newArr2[i]=arr2[i];
            }
        }
        for(int i=position+1;i<arr2.length;i++) {
            newArr2[i-1]=arr2[i];
        }
        System.out.println();
        for(int ar:newArr2){
            System.out.print(ar+" ");
        }

        //General
        System.out.println();
        Assignments assign = new Assignments();


     // Assignment 1:
        int array1[]={1,2,3,4,4,5,6,2,2,2,3};
        String array2[]={"mama","tata","sora","sora","sora","tata"};
        //assign.countOccurrences(array1,2);
        //assign.countOccurrences(array2,"sora");

     // Assignment 2:
        //assign.readArray();
        //assign.readMatrix();

     // Assignment 3:
        //assign.randomGenerate();

     // Assignment 4:
        int matrix1[][]={{1,2,3},{4,5,6}};
        int matrix2[][]={{1,2,3},{4,5,6}};
        int matrix3[][]={{1,3,4},{2,4,5}};
        int matrix4[][]={{1,5,6},{2,5,4},{1,1,1}};
        int scalar=3;

        //assign.matrixAddition(matrix1,matrix2);
        //assign.matrixScalarMultiplication(matrix1,scalar);
        //assign.matrixMultiplication(matrix3,matrix4);

     // Assignment 5
        assign.arraySearch(10);
    }

}
