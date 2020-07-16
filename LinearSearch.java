 class LinearSearch
{

  public  static int Number(int[] arr, int key)
   {
      int num = arr.length;
      for(int i = 0; i < num; i++)
      {
         
         if(arr[i] == key)
            return i;
      }
      
      return -1;
   }
   public static void main(String[] args)
   {
      int[] arr = {15, 25, 35, 55, 75, 95};
      int key = 55;
      int output = Number(arr, key);
      if(output == -1)
      {
         System.out.println("Sorry!!Element is not present");
      }
      else
      {
         System.out.println("Element is present at index " + output);
      }
   }
}