public class ChainNode<K,V> {
private K key;
private V value;
ChainNode <K, V> next;

public ChainNode(K newKey, V newValue, ChainNode<K,V> nextNode){
  key = newKey;
  value = newValue;
  next = nextNode;
}
public V getValue(){
  return value;
}

public K getKey(){
  return key;
}

public ChainNode getNext(){
  return next;
}

public void setNext(ChainNode<K,V> newNode){
  next = newNode;
}
}
