public class CheckSum{
// First Constructor method for computeCheckSum that accecpts an int array 
  public static int [] computeCheckSum(int[] data){
    int sum1 = 0;
    int sum2 = 0;
// For loop for adding ints to create a 64 bit checksum array
    for(int i = 0; i <(data.length); i++){
      sum1 =sum1 +data[i];
      sum2 =sum2 + sum1;
    }
// Create a new array called result that holds each of the 32 bit ckecksum and returns a array of length 2
    int [] result = new int[2];
    result[0] = sum1;
    result[1] = sum2;
    return result;
  }
// Second constructor if the input for Checksum is a string
  public static int [] computeCheckSum(String message){
    int[] test = RunCheckSum.stringToInts(message);
    return computeCheckSum(test);
  }
// Boolean checking that the data input matches the expected by checking both arrays[0] and [1] values   
   public static boolean verifyCheckSum(int [] data, int [] expected){ 
   int [] first = computeCheckSum(data);
   if(first[0] == expected[0] && first[1] == expected[1]){
    return true;
   }
   return false;
  }
// Boolean checking that the message input matches the expectedHex by checking both arrays[0] and [1] values  
 public static  boolean verifyCheckSum(String message, String expectedHex){
   int [] first = computeCheckSum(message);
   int [] second = RunCheckSum.hexStringToInts(expectedHex);
   if(first[0] == second[0] && first[1] == second[1]){
    return true;
   }
   return false;
  }
}
  
  