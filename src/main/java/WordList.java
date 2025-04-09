import java.util.*;

public class WordList
{
  private ArrayList <String> myList;

  public WordList() { myList = new ArrayList<String>(); }
  public void add(String word) { myList.add(word); }
  public String toString() { return myList.toString(); }

  public int numWordsOfLength(int len)
  {
    int x = 0;
      for(int i = 0; i < myList.size(); i++){
        if(myList.get(i).length() == len){
        x++;
      }
    }
return x; 
  }

  public void removeWordsOfLength(int len)
  {
  while (i < myList.size()) {
      if ((myList.get(i)).length() == len)
        myList.remove(i); 
      else
        i++;
    }
  } 


  }
}
