import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  int currentIndex;
  int[] data;

  public ArraySequence(int[] other){
    currentIndex = 0;
    data = new int[other.length];
    for (int i = 0; i < other.length; i++){
      data[i] = other[i];
    }
  }

  public boolean hasNext(){
    return false;
  }

  public int next(){
    return 0;
  }

  public int length(){
    return 0;
  }

  public void reset(){ }
}
