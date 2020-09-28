public class ShiftQueue{
  public static  int [] makeQueue(int capacity){
// Checks for the special case of capacity being an integer less then zero
    if(capacity < 0){
      return null;
    }
// Creates a new queue and populates it with -1    
    int [] queue = new int[capacity];
    for(int i = 0; i < queue.length; i++){
      queue[i] = -1;
    }
    return queue;
  }
  
  public static boolean addToEndOfQueue(int [] queue, int newItem){
// Checks for the special case of newItem being an integer equal to -1 or
// Queue Length = 0 and returns false
    if(newItem == -1){
      return false;
    }
    if(queue.length == 0){
      return false;
    }
// Replaces the first element that equals -1 in queue[]
    for(int i = 0; i < queue.length; i++){
      if(queue[i] == -1){
        queue[i] = newItem;
        return true;
      }
    }
    return false;  
  }
  
  public static boolean removeFromFrontOfQueue(int [] queue){
    if(queue[0]== -1){
      return false;
    }
    if(queue.length == 0){
      return false;
    }
// First slide all elements over to the left, then replace the last element by -1; 
    for(int i = 0; i < (queue.length-1); i++){
      queue[i] = queue[i+1];     
    }
    queue[(queue.length-1)] = -1;
    return true;
  }
  
  public static String queueString(int [] queue){
    String queueString = "";
    if(queue.length == 0){
      return "";
    }
    if(queue[0]== -1){
      return "";
    }
// Grab each element in the list and turn them into a string to represent the queue
    for(int i = 0; i < queue.length; i++){
      if(queue[i] != -1){
      queueString = queueString + queue[i]+ " ";
      }
    }
    return queueString;
  }
}

