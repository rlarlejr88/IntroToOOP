package collections.list;


import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public class MyArrayList implements List, RandomAccess {
  private static final int DEFAULT_SIZE = 10;
  private Object[] elementData;
  private int size;

  public MyArrayList() {
    // TODO: Implement Me
    elementData = new Object[DEFAULT_SIZE];
  }

  public MyArrayList(int initialCapacity) {
    if (initialCapacity >= 0) {
      elementData = new Object[initialCapacity];
    } else {
      throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
    }
  }

  public MyArrayList(Collection c) {
    elementData = c.toArray();
  }

  @Override
  public int size() {
    // TODO: Implement Me
    return elementData.length;
  }

  @Override
  public boolean isEmpty() {
    // TODO: Implement Me\
    if(elementData.length == 0){
      return true;
    }
    else{
      return false;
    }
  }

  @Override
  public boolean contains(Object o) {
    for (int i = 0; i < elementData.length; i++)
      if (o.equals(elementData[i])) return true;

    return false;
  }

  @Override
  public Iterator iterator() {
    // DO NOT NEED TO IMPLEMENT
    return null;
  }

  @Override
  public Object[] toArray() {
    // TODO: Implement Me
    return Arrays.copyOf(elementData, elementData.length);
  }

  @Override
  public Object[] toArray(Object[] a) {
    // DO NOT NEED TO IMPLEMENT
    return new Object[0];
  }

  @Override
  public boolean add(Object o) {
    // TODO: Implement Me
    if (size == elementData.length) {
      elementData = grow(size + 1);
    }
    elementData[size] = o;
    size++;
    return true;
  }

  private Object[] grow(int minCapacity) {
    return elementData = Arrays.copyOf(elementData, minCapacity + minCapacity / 2);
  }

  @Override
  public boolean remove(Object o) {
    int i= indexOf(o);
    if (i == -1) {
      return false;
    }
    get(i);
    for (int i=index; i < elementData.length-1; i++) {
      array[i] = array[i+1];
    }
    return true;
  }

  @Override
  public boolean containsAll(Collection c) {

    for (Object e: collection) {
      if (!contains(e)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public boolean addAll(Collection c) {
    boolean	flag = true;
    for (Object e: collection) {
      flag &= add(e);
    }
    return true;

  }

  @Override
  public boolean addAll(int index, Collection c) {
    // TODO: Implement Me
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean removeAll(Collection c) {
    // TODO: Implement Me
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean retainAll(Collection c) {
    // TODO: Implement Me
    throw new UnsupportedOperationException();
  }

  @Override
  public void clear() {
    // TODO: Implement Me
    for (int i = 0; i < size; i++) {
      elementData[i] = null;
    }
  }

  @Override
  public Object get(int index) {
    // TODO: Implement Me
    if (index < 0 || index >= size) {
      throw new ArrayIndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }
    return elementData[index];
  }

  @Override
  public Object set(int index, Object element) {
    Object o = get(index);
    elementData[index] = element;

    return o;
  }

  @Override
  public void add(int index, Object element) {
    // TODO: Implement Me
    add(element);
    for (int i=size-1; i>index; i--) {
      elementData[i] = elementData[i-1];
    }
    elementData[index] = element;

  }

  @Override
  public Object remove(int index) {

    Object e = get(index);
    for (int i = index; i < elementData.length-1; i++) {
      elementData[i] = elementData[i+1];
    }
    size--;
    return element;
  }

  @Override
  public int indexOf(Object o) {
    for (int i = 0; i<elementData.length; i++) {
      if (elementData[i].equals(o)) {
        return i;
      }
    }
    return -1;

  }

  @Override
  public int lastIndexOf(Object o) {
    /// see notes on indexOf
    for (int i = elementData.length-1; i>=0; i--) {
      if (elementData[i].equals(o)) {
        return i;
      }
    }
    return -1;
    return 0;
  }

  @Override
  public ListIterator listIterator() {
    // DO NOT NEED TO IMPLEMENT
    return null;
  }

  @Override
  public ListIterator listIterator(int index) {
    // DO NOT NEED TO IMPLEMENT
    return null;
  }

  @Override
  public List subList(int fromIndex, int toIndex) {
    List arrlist = Arrays.copyOfRange(array, fromIndex, toIndex);
    return arrlist;
  }
}