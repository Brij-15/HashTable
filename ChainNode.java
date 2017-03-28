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
}
