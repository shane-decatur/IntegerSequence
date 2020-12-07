import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
  private int start,end,current;

  public Range(int start, int end){
    if (start > end){
      throw new IllegalArgumentException();
    }
    this.start = start;
    this.end = end + 1;
    current = start;
  }

  public void reset(){
    current = start;
  }
  public int length(){
    return end - start;
  }

  public boolean hasNext(){
    if (current < end){
      return true;
    }
    return false;
  }

  public int next(){
    if (hasNext()){
      int temp = current;
      current++;
      return temp;
    }
    else throw new NoSuchElementException();
  }
}
