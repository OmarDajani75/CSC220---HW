package edu.sfsu;
public class LList<T> implements ListInterface<T> {

    private Node firstNode; // reference to first node
    private int numberOfNodes;

    public LList() {
        clear();
    } // end default constructor

    @Override
    public void add(T newEntry) {
        Node newNode = new Node(newEntry);
        if (isEmpty()) {
            firstNode = newNode;
        } else // add to end of nonempty list
        {
            Node lastNode = getNodeAt(numberOfNodes);
            lastNode.setNext(newNode); // make last node reference new node
        } // end if
        numberOfNodes++;
    }

    @Override
    public boolean add(int newPosition, T newEntry) {
        boolean isSuccessful = true;
        if ((newPosition >= 1) && (newPosition <= numberOfNodes + 1)) {
            Node newNode = new Node(newEntry);
            if (newPosition == 1) // case 1
            {
                newNode.setNext(firstNode);
                firstNode = newNode;
            } else // case 2: list is not empty
            { // and newPosition > 1
                Node nodeBefore = getNodeAt(newPosition - 1);
                Node nodeAfter = nodeBefore.getNext();
                newNode.setNext(nodeAfter);
                nodeBefore.setNext(newNode);
            } // end if
            numberOfNodes++;
        } else {
            isSuccessful = false;
        }
        return isSuccessful;
    }

    @Override
    public T remove(int givenPosition) {
        T result = null; // return value
        if ((givenPosition >= 1) && (givenPosition <= numberOfNodes)) {
            assert !isEmpty();
            if (givenPosition == 1) // case 1: remove first entry
            {
                result = firstNode.getItem(); // save entry to be removed
                firstNode = firstNode.getNext();
            } else // case 2: not first entry
            {
                Node nodeBefore = getNodeAt(givenPosition - 1);
                Node nodeToRemove = nodeBefore.getNext();
                Node nodeAfter = nodeToRemove.getNext();
                nodeBefore.setNext(nodeAfter);
                result = nodeToRemove.getItem(); // save entry to be removed
            } // end if
            numberOfNodes--;
        } // end if
        return result;
    }
    public T remove(){
        T result=null;
        assert !isEmpty() ;
        result = firstNode.getItem() ;
        firstNode = firstNode.getNext() ;
        numberOfNodes--;
        return result ;
    }
    @Override
    public void clear() {
        firstNode = null;
        numberOfNodes = 0;
    }

    @Override
    public boolean replace(int givenPosition, T newEntry) {
        boolean isSuccessful = true;
        if ((givenPosition >= 1) && (givenPosition <= numberOfNodes)) {
            assert !isEmpty();
            Node desiredNode = getNodeAt(givenPosition);
            desiredNode.setItem(newEntry);
        } else {
            isSuccessful = false;
        }
        return isSuccessful;
    }

    @Override
    public T getEntry(int givenPosition) {
        T result = null; // result to return
        if ((givenPosition >= 1) && (givenPosition <= numberOfNodes)) {
            assert !isEmpty();
            result = getNodeAt(givenPosition).getItem();
        } // end if
        return result;
    }

    @Override
    public boolean contains(T anEntry) {
        boolean found = false;
        Node currentNode = firstNode;
        while (!found && (currentNode != null)) {
            if (anEntry.equals(currentNode.getItem())) {
                found = true;
            } else {
                currentNode = currentNode.getNext();
            }
        } // end while
        return found;
    }

    @Override
    public int getLength() {
        return numberOfNodes ;
    }

    @Override
    public boolean isEmpty() {
        boolean result;
        if (numberOfNodes == 0) // or getLength() == 0
        {
            assert firstNode == null;
            result = true;
        } else {
            assert firstNode != null;
            result = false;
        } // end if
        return result;
    }

    @Override
    public T[] toArray() {
        // the cast is safe because the new array contains null entries
        @SuppressWarnings("unchecked")
        T[] result = (T[]) new Object[numberOfNodes];
        int index = 0;
        Node currentNode = firstNode;
        while ((index < numberOfNodes) && (currentNode != null)) {
            result[index] = currentNode.getItem();
            currentNode = currentNode.getNext();
            index++;
        } // end while
        return result;
    }

    private Node getNodeAt(int givenPosition) {
        assert (firstNode != null)
                && (1 <= givenPosition) && (givenPosition <= numberOfNodes);
        Node currentNode = firstNode;
// traverse the chain to locate the desired node
        for (int counter = 1; counter < givenPosition; counter++) {
            currentNode = currentNode.getNext();
        }
        assert currentNode != null;
        return currentNode;
    } // end getNodeAt

    class Node {

        public T getItem() {
            return item;
        }

        public void setItem(T item) {
            this.item = item;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        T item;
        Node next;

        Node(T item) {
            this(item, null);
        }

        Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }

        @Override
        public String toString() {
            return item.toString();
        }

    }
}
