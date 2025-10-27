import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    printNTimes("hello",5);
  }

  public static void printNTimes(String word, int N)
  {
    // code solution here
    for (int i = 0; i < word.length(); i++) // for each letter in the word... (loop)
    {
      String letter = word.substring(i, i+1);
      for (int j = 0; j < N; j++)     // print that letter N times (loop)
      {
        System.out.print(letter);
      }
      System.out.println();
      }
    }


  public static void printNums()
  {
    // code solution here
    for (int i = 10; i > 0; i--)
    {
      int N = 
      for (int j = 0; j < 1; j++)
      {
        System.out.print(i);
      }
    }
  }

  public static void uprightNumberTriangle(int N)
  {
    // code solution here
  }

  public static void starTree()
  {
    // code solution here
  }

  public static void multTable()
  {
    // code solution here
  }

  
}
