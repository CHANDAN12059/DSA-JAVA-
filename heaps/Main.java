package heaps;

import java.util.*;

public class Main {

    public static class Heap {

        ArrayList<Integer> a = new ArrayList<>();

        public void add(int data) {

            a.add(data);

            int size = a.size() - 1;

            int parent = (size - 1) / 2;

            while (a.get(size) < a.get(parent)) {
                int temp = a.get(size);
                a.set(size, a.get(parent));
                a.set(parent, temp);

                size = parent;
                parent = (size - 1) / 2;
            }

        }

        public int peek() {

            return a.get(0);

        }

        public void remove() {

            int temp = a.get(0);
            a.set(0, a.get(a.size() - 1));
            a.set(a.size()-1, temp);
            a.remove(a.size() - 1);

        }

        public void heapify(int i) {
            int left = (2 * i) + 1 ;
            int right = (2 * i) + 2 ;
            int minIndex = i;

            if (left < a.size() && a.get(i) > a.get(left)) {

                minIndex = left;

            }

            if (right < a.size() && a.get(i) > a.get(right)) {
                minIndex = right;
            }

            if (minIndex != i) {

                int temp = a.get(i);
                a.set(i, a.get(minIndex));
                a.set(minIndex, temp);
                heapify(minIndex);

            }

        }

        public boolean isEmpty(){
            return a.size()==0;
        }

    }

    public static void main(String[] args) {

        Heap h=new Heap();
        h.add(322421);
        h.add(123);
        h.add(2001);
        h.add(12);
        h.add(13232);

        while(!h.isEmpty()){
            System.out.print(h.peek()+" ");
            h.remove();
        }

    }
}
