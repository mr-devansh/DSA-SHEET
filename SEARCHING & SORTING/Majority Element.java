class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        int ele = 0;
        int count = 0;
        for(int i = 0; i< size ;i++){
            if(count==0){
                ele = a[i];
            }
            if(a[i]==ele){
                count++;
            }
            else{
                count--;
            }
        }
        count = 0;
        for(int i =0; i<size; i++){
            if(a[i]==ele){
                count++;
            }
        }
        if(count>size/2){
            return ele;
        }
        else{
            return -1;
        }
    }
}
