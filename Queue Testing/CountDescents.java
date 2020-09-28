public class CountDescents{
  public static int countDescents(int[] xs){
// Declare a int holder for keeping the total tally of descents
    int dCount = 0;
    
/* Two "if" control checks to see whether we need to return an
 immediate value for xs[].length being less then 1 or equal 0 to*/
    if (xs.length == 0){
        return 0;
      }
    if (xs.length == 1){
        return 1;
      }
/* This for loop runs through the given xs array checking for 
  the basic less then or greater value, note that it starts at i = 1
  not i = 0 due to my way of checking the array*/ 
    
    for(int i =1; i < xs.length; i++){
      if( xs.length == i && dCount == 0){
          return 1;
        }
// "if" checks to see if the previous number in xs is greater or equal to the next xs[i]
      if (xs[i-1]  >= xs[i]){
        continue;
      }else{
        dCount++;
      }
    }
// "if" after running all other tests looks to see if there was only the same number in xs[3,3,3,3]
    if(dCount == 0){
          return 1;
        }
// Using logic to assume that all tests cover other avenues, allways adds the first descent +1    
    return dCount+1;
  }
}