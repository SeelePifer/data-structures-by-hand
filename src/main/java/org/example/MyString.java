package org.example;



public final class MyString {

    private final int[] characters;
    private final int length;

    public MyString(String spec){
        this.characters = spec.codePoints().toArray();
        this.length = spec.length();
    }

    public MyString concat(MyString other) {
        int[] combined = new int[length + other.length];
        System.arraycopy(characters, 0, combined, 0, length);
        System.arraycopy(other.characters, 0, combined, length, other.length);
        return new MyString(new String(combined, 0, combined.length));
    }
    public int compareTo(MyString other){
        int minLenght = Math.min(length, other.length);
        //linear

        for(int i = 0; i < minLenght; i++) {
          if(characters[i] != other.characters[i]){
              return characters[i] - other.characters[i];
          }
        }
        return length - other.length;
    }
    public MyString[] split(int chunkSize){
        int numChunk = (int) Math.ceil( (double) length / chunkSize);
        MyString[] chunks = new MyString[numChunk];
        //linear
        for(int i = 0; i < numChunk; i++) {
          int start = i * chunkSize;
          int end = Math.min(start + chunkSize, length);
          chunks[i] = new MyString(new String(characters, start, end - start));
        }
        return chunks;
    }
    public int indexOf(MyString target){
        int targetLenght = target.length;
         if(targetLenght == 0){
             // array is empty
             return 0;
         }
         outer:
         //quadratic time
         for(int i = 0; i < length - targetLenght + 1; i++) {
           for(int j = 0; j < targetLenght; j++) {
             if(characters[i + j] != target.characters[j]){
                 continue outer;
             }
           }
           return i;
         }
         return -1;
    }

    @Override
    public String toString() {
        return new String(characters, 0, length);
    }

}
