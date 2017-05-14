import java.util.*;

public class SetCollectionTest{
  public static void main(String[] args){
    System.out.println("Set Collection Test program.");

    //create HashMap
    Set<String> hs1 = new HashSet<String>();

    //add value
    hs1.add("value1");
    hs1.add("value3");
    hs1.add("value4");
    hs1.add("value2");


    //get all value
    for(String eachValue: hs1){
      System.out.println(eachValue);
    }


  }
}
