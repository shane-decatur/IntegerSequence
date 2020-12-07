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

  public ArraySequence(IntegerSequence otherseq){
    currentIndex = 0;
    data = new int[otherseq.length()];
    while (otherseq.hasNext()){
      data[currentIndex] = otherseq.next();
      currentIndex++;
    }
    otherseq.reset();
    reset();
  }

  public boolean hasNext(){
    return currentIndex < data.length;
  }

  public int next(){
    if (!hasNext()){
      throw new NoSuchElementException();
    }
    int temp = data[currentIndex];
    currentIndex++;
    return temp;
  }

  public int length(){
    return data.length;
  }

  public void reset(){
    currentIndex = 0;
  }
}
