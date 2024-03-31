package lr3.part3;

public class Task8 {

    public static void main(String[] args) {
        LinkedList<User> list = new LinkedList<>();
        User user1 = new User("Misha", 23);
        User user2 = new User("Katya", 24);
        User user3 = new User("Daniil", 24);
        User user4 = new User("Roman", 42);

        list.createHead(user1);
        list.createHead(user2);

        list.addFirst(user3);
        list.addFirst(user4);

        list.createTail(user1);
        list.createTail(user2);

        list.addLast(user1);
        list.addLast(user2);


        list.insert(0, user3);

        list.removeFirst();

        list.removeLast();

        list.remove(0);

        list.createHeadRec(user3);

        System.out.println(list);
    }
}

class LinkedList<E> {

    private int size;
    private Node<E> next;

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder("[");
        Node<E> current = next;

        if (next == null) {
            return "[]";
        }

        while (current.next != null) {
            output.append("%s, ".formatted(current));
            current = current.next;
        }

        return "%s]".formatted(output.append(current));
    }

    private static class Node<E> {
        private E value;
        private Node<E> next;

        public Node(E value) {
            this.value = value;
            this.next = null;
        }

        @Override
        public String toString() {
            return value.toString();
        }
    }

    public void createHead(E value) {
        Node<E> newNode = new Node<>(value);

        if (next == null) {
            next = newNode;
        } else {
            Node<E> current = next;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }

        size++;
    }

    public void createTail(E value) {
        Node<E> newNode = new Node<>(value);

        if (next != null) {
            newNode.next = next;
        }

        next = newNode;

        size++;
    }

    public void addFirst(E value) {
        createTail(value);
    }

    public void addLast(E value) {
        createHead(value);
    }

    public void insert(int index, E value) {
        if (index > size - 1 | index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }

        if (index == 0) {
            createTail(value);
            return;
        }

        int counter = 0;
        Node<E> current = next;

        while (counter != index - 1) {
            current = current.next;
            counter++;
        }

        Node<E> newNode = new Node<>(value);

        newNode.next = current.next;
        current.next = newNode;

        size++;
    }

    public void removeFirst() {
        if (size == 0) {
            throw new NullPointerException();
        }

        next = next.next;

        size--;
    }

    public void removeLast() {
        if (size == 0) {
            throw new NullPointerException();
        }

        if (size == 1) {
            next = null;
            size--;
            return;
        }

        int counter = 0;
        Node<E> current = next;

        while (counter != size - 2) {
            current = current.next;
            counter++;
        }

        current.next = null;

        size--;
    }

    public void remove(int index) {
        if (index > size - 1 | index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }

        if (size == 0) {
            throw new NullPointerException();
        }

        if (index == 0) {
            removeFirst();
            return;
        }

        int counter = 0;
        Node<E> current = next;

        while (counter != index - 1) {
            current = current.next;
            counter++;
        }

        current.next = current.next.next;
        size--;
    }

    public void createHeadRec(E value) {
        next = createHeadRec(next, value);
        size++;
    }

    private Node<E> createHeadRec(Node<E> current, E value) {
        if (current == null) {
            return new Node<>(value);
        }

        current.next = createHeadRec(current.next, value);

        return current;
    }
}

class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
               "name='" + name + '\'' +
               ", age=" + age +
               '}';
    }
}