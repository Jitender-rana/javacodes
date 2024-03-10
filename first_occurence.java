public class first_occurence {
    public static int first_occurence_key(int arr[],int key,int i){
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i]==key){
            return i;

        }
        return first_occurence_key(arr, key, i+1);


    }
    public static int last_occurence_key(int arr[],int key,int i){
        if(i<0){
            return -1;
        }
        if(arr[i]==key){
            return i;

        }
        return last_occurence_key(arr, key, i-1);


    }
    //or another way of writing this last_occurence
    public static int last_occurence(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isfound=last_occurence(arr, key, i+1);//checking forward first.
        
        if(isfound == -1 && arr[i]==key){//comparing withself.
            return i;
        }
        return isfound;
    }
    
    public static void main(String args[]){
        int arr[]={1,2,4,6,4,5,3};
        int key=4;
        int num=first_occurence_key(arr,key,0);
        int num1=last_occurence_key(arr,key,arr.length-1);
        if(num1==-1){
            System.out.println("Element not found");
        }else{
            System.out.println("elemnt found at "+(num1+1)+" position.");
        }
    }
}
