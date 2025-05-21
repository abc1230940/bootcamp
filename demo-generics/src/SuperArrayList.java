public class SuperArrayList<T> {
  private T[] values;

  public SuperArrayList() {
    this.values = (T[]) new Object[0];

  }

  public T[] getValues() {
    return this.values;
  }

  public T get(int index) {
    if (index < 0 || index >= this.values.length) {
      return null;
    }
    return this.values[index];
  }

  public int size() {
    return this.values.length;
  }

  public void setValues(T[] values) {
    this.values = values;
  }

  public boolean add(T newValue) {
    T[] newValues = (T[]) new Object[this.values.length + 1];
    for (int i = 0; i < this.values.length; i++) {
      if (this.values[i] == null) {
        newValues[i] = this.values[i];
        newValues[newValues.length - 1] = newValue;
        this.values = newValues;
      }

    }
    return true;
  }

  public static void main(String[] args) {
    SuperArrayList<String> strings = new SuperArrayList<>();
    strings.add("abc");
    strings.add("def");
    // ArrayList -> naturally support for-each

    for (int i = 0; i < strings.size(); i++) {
      
    }
  }
}
