//consider last element : pivot
//put smaller element to left of pivot
public class QuickSort {
    public static void main(String[] args) {

        int arr[] = {24,9,29,14,19,27};
        int n = arr.length;

        System.out.println("Before Sorting ");
        print(arr);
        quickSort(arr ,0,n-1);
        System.out.println();
        System.out.println("After Sorting ");
        print(arr);

    }

    private static void quickSort(int[] arr, int start, int end) {

        if (start<end){

            int p = partition(arr, start, end); //p is the partitioning index
            quickSort(arr,start ,p-1);
            quickSort(arr,p+1,end);
        }
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot =arr[end];
        int i = start-1;
        for (int j=start;j<end;j++){
            // If current element is smaller than the pivot
            if (arr[j]<pivot){    //
                i++;               // increment index of smaller element
                //swap arr[i] and arr[j]
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }


        }
        int t = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = t;
        return (i + 1);

    }

    private static void print(int[] arr){

        for (int i : arr){
            System.out.print(i+" ");
        }
    }
}



//    Quicksort is the widely used sorting algorithm that makes n log n comparisons in average case for sorting an array of n elements.
//    It is a faster and highly efficient sorting algorithm.
/*
    PARTITION (array A, start, end)
    {
        1 pivot ? A[end]
        2 i ? start-1
        3 for j ? start to end -1 {
        4 do if (A[j] < pivot) {
            5 then i ? i + 1
            6 swap A[i] with A[j]
            7  }}
        8 swap A[i+1] with A[end]
        9 return i+1
    }*/





/*  s5r -0 and end - 6
[24, 9, 29, 14, 19, 27]
* now pivot 27 , i=-1
j=0 , i=-1 and pivot =27
arr[i]  index out of bound

i=0 j=0  arr[i]=arr[j]=24   but arr[i+1]=9
-------------------------------------------
j=1 start  , pivot =27 ,[24, 9, 29, 14, 19, 27]
arr[j] =9  and pivot =27   arr[j]<pivot =true
i++ i=1  and arr[i] =24
swap  --now arr[i]=9  and arr[j]=9

--------------------------------------------
in for loop j=2  and i=1 by prev
arr[j] =arr[2] = 29 <pivot(27)  false
not in if

j=3 and i=1
14<27  true     in if  i++ and i=2
swap arr[2] with arr[3]              arr[i+1] =14
      29           14

j=4 and i=2  //[24, 9, 14, 29, 19, 27]
arr[4]=19 <pivot 27  True n i++ i=3
swap arr[3] to arr[j]

[24, 9, 14, 19, 29, 27]


for loop end j=5

------------------------------------------------------
now i=3 ......arr[i+1] =29
swap with arr[end]=arr[5]=27

[24, 9, 14, 19, 27, 29]

partition return i+1 = 3+1 =4



-------------------------------------------------
now again chceked with start 0 and end =3

now pivot is 19  arr[j]=19  [24, 9, 14, 19, 27, 29]
now j=0 and i=-1
24<19 false not enter in loop to swap
---------------------------------------
for j=1 i=-1
9<19 i++ i=0  swap arr[i] with arr[j]
arr[0]=24 swap with arr[j]=arr[1]=9   [9, 24, 14, 19, 27, 29]


j=2 i=0
14<19 true i++ i=1
swap logic arr[i] with arr[j]  [9, 14, 24, 19, 27, 29]

now j=3 end for loop

arr[i+1] = arr[2]=24
arr[end] =19
swap  above two
[9, 14, 19, 24, 27, 29]


return partion =i=2

so again quickstart (arr , 0 , p-1)  p-1 thats 2-1
start=0 and i=-1 [9, 14, 19, 24, 27, 29] now 14 will pivot
9<14 true i=0 and
swap arr[0] with arr[0]

return i+1 i=1




---------------------------------------
while doing revert
git revert commit id
:wq!

git commit -m ""

git push

three steps need to perform

*/




