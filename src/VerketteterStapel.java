import java.util.EmptyStackException;

public class VerketteterStapel<E> implements IStapel<E> {
    Element<E> top;

    private static class Element<T> {
        private T key;
        private Element<T> next;

        Element(T e) {
            this.key = e;
            this.next = null;
        }

        Element(T e, Element<T> next) {
            this.key = e;
            this.next = next;
        }


        public Boolean equals(Element<T> obj)
        {
            if (obj == null) return false;
            if(next == null && obj.next != null || next != null && obj.next == null)
            {
                return false;
            }
            if(next != null && obj.next != null)
            {
                return key.equals(obj.key) && next.equals(obj);
            }
            else
            {
                return key.equals(obj.key);
            }
        }
    }

    public VerketteterStapel() {
        top = null;
    }

    @Override
    public E top() throws EmptyStackException {
        if (this.top == null) {
            throw new EmptyStackException();
        }
        return top.key;
    }

    @Override
    public E pop() throws EmptyStackException {
        if (this.top == null) {
            throw new EmptyStackException();
        }
        var temp = top;
        top = temp.next;
        return temp.key;
    }

    @Override
    public void push(E e) {
        Element<E> temp = new Element<>(e, top);
        top = temp;
    }

    @Override
    public boolean equals(Object e){
        if ( !(e instanceof VerketteterStapel)) return false;
        VerketteterStapel v = (VerketteterStapel) e;
        return ( this.top.equals(v.top()));
    }

    @Override
    public String toString() {
        if (top == null) return "[]";
        StringBuilder sb = new StringBuilder("[");
        Element<E> temp = top;
        while (temp.next != null) {
            sb.append(temp.key.toString()).append(", ");
            temp = temp.next;
        }
        sb.append(temp.key.toString()).append("]");
        return sb.toString();
    }
}
