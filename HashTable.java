import java.util.*;
import java.io.*;
public class HashTable<K, V>{
  //hash function is x mod tablesize
private int tableSize = 101;
private ChainNode<K,V>[] table;

public static void main(String [] args){

}//ends main

public HashTable(){
  table = new ChainNode[tableSize];
}//end constructor

public boolean tableIsEmpty(){
return tableSize == 0;
}//ends tableIsEmpty

public void tableInsert(K key, V value) throws HashException{
if(tableSize != 0){
int index = hashIndex(key);
ChainNode<K,V> node = new ChainNode<K,V>(key,value,null);
node.setNext(table[index]);
table[index].setNext(node);
}
}//ends insert

public V tableRetrieve(K searchKey){
  int i = hashIndex(searchKey);
  ChainNode<K,V> node = table[i];
  while((node != null)&&(node.getKey() != searchKey)){
    node = node.next;
  }
  if(node != null){
    return node.getValue();

  } else {
    return null;
  }
}

public int hashIndex(K key){
  String k = key.toString().toLowerCase();
  int total = 0;
  int temp;
  Character tempChar;
  for(int i = 0; i < k.length(); i++){
    tempChar = k.charAt(i);
    temp = Character.getNumericValue(tempChar);
    temp = temp - 30; //convert from ASCII value
    total = temp + total;
    total = total * 32;
  }
total = total % tableSize;
return total;
}//ends hashIndex

}//ends HashTable
