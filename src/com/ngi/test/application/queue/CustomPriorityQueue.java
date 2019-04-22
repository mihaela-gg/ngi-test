package com.ngi.test.application.queue;

import java.util.*;

public class CustomPriorityQueue<E extends Comparable<? super E>> implements Iterable<Element<E>> {
    private List<Element<E>> queue;

    public CustomPriorityQueue() {
        this.queue = Collections.synchronizedList(new ArrayList<>());
    }

    /**
     * Check if the queue is empty
     * @return true if the queue is empty
     */
    public boolean isEmpty() {
        return this.queue.size() == 0;
    }

    /**
     * Add a new element to the queue
     * @param label
     * @param priority
     */
    public void add(E label, int priority) {
        Element<E> element = new Element<>(label, priority);
        this.queue.add(element);
    }

    /**
     * Remove first element
     * @return the removed element
     */
    public Element<E> remove() {
        if (isEmpty()) {
            return null;
        }

        int deletedIndex = 0;
        for (int i = 0; i < this.queue.size(); i++) {
            if (this.queue.get(i).getPriority() > this.queue.get(deletedIndex).getPriority()) {
                deletedIndex = i;
            }
        }

        Element<E> result = this.queue.get(deletedIndex);
        this.queue.remove(deletedIndex);

        return result;
    }

    @Override
    public Iterator<Element<E>> iterator() {
        return this.queue.iterator();
    }
}
