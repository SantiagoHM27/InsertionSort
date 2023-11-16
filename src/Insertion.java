class Insertion{
    public static void main(String []args){
        int []arr = {10, 10, 1, 8, 7, 5, 7, 2, 3};
        for(int j = 1; j < arr.length; j++){
            int actual = arr[j];

            int i = j-1;
            while(i >= 0 && arr[i] > actual){
                arr[i+1] = arr[i]; 
                i--;
            }
            arr[i+1]=actual;
        }
        for(int elem: arr){
            System.out.print(elem + " ");
        }
    }
}
