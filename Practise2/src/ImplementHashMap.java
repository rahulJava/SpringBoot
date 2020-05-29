import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Pair<U, V> {
  public U first;
  public V second;

  public Pair(U first, V second) {
    this.first = first;
    this.second = second;
  }
}

class Bucket {
  private LinkedList<Pair<Integer,Integer>> container;

  public Bucket() {
    container = new LinkedList<Pair<Integer,Integer>>();
  }

  public void update(Integer key,Integer Value) {
   boolean found = false;
      for(Pair<Integer,Integer> pair: this.container)
   {
       if(pair.first.equals(key))
       {
            pair.second = Value;
        found = true;
       }
   }
      if(!found)
          this.container.add(new Pair<Integer,Integer>(key,Value));
  }
//   public void update(Integer key, Integer value) {
//     boolean found = false;
//     for (Pair<Integer, Integer> pair : this.container) {
//       if (pair.first.equals(key)) {
//         pair.second = value;
//         found = true;
//       }
//     }
//     if (!found)
//       this.container.add(new Pair<Integer, Integer>(key, value));
//   }  
    

  public void remove(Integer key) {
      for(Pair<Integer,Integer>pair:this.container)
      {
          if(pair.first.equals(key))
          {
              this.container.remove(pair);
              break;
          }
      }
    
  }
public Integer get(Integer key)
{
    for(Pair<Integer,Integer> pair: this.container)
    {
        if(pair.first.equals(key))
        {
            return pair.second;
        }
    }
    return -1;
}
}
class MyHashMap {

    private List<Bucket> hash_table;
    private int moduloValue;
    /** Initialize your data structure here. */
    public MyHashMap() {
        this.moduloValue=739;
        this.hash_table= new ArrayList<Bucket>();
        for(int i=0;i<this.moduloValue;i++)
        {
            this.hash_table.add(new Bucket());
        }
        
    }
    public int _hash(int key)
    {
        return (key%this.moduloValue);
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
    int index= this._hash(key);
        this.hash_table.get(index).update(key,value);
        
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        int index= this._hash(key);
        return this.hash_table.get(index).get(key);
        
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        int index= this._hash(key);
        this.hash_table.get(index).remove(key);        
    }


}


/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */