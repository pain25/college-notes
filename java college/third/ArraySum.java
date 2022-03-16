  class ArraySum{
   public static void main(String[] args) {
        int[] arr={9,8,7,6,5,44,55,4,3,1,64,5};
        int sum=0;
        int avg=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            count++;
            sum+=arr[i];


        }
        avg=sum/count;
        System.out.println(avg);
        }
        }
