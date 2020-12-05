import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
  private int start,end,current;

  public Range(int start, int end){
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
    return 0;
  }
}
