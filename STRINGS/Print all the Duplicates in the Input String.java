public class GFG {
    
    public static void doit(String S){
        int[] count = new int[256];
        for(int i = 0 ; i < S.length(); i++){
            count[S.charAt(i)]++;
        }
        for(int j = 0; j< 256; j++){
            if(count[j]>1){
                System.out.println((char)(j)+" "+count[j]);
            }
        }
    }   
 
    public static void main(String[] args)
    {
        String str = "test string";
        doit(str);
    }
}
