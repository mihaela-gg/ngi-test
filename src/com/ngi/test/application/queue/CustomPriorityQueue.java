package com.ngi.test.application.queue;

public class CustomPriorityQueue<E extends Comparable<? super E>> {
    private Element<E>[] queue;
    private int index;

    public CustomPriorityQueue() {
        queue = new Element[10];
        index = 0;
    }

    /**
     * Check if the queue is empty
     * @return true if the queue is empty
     */
    public boolean isEmpty() {
        return index == 0;
    }

    /**
     * Add a new element to the queue
     * @param label
     * @param priority
     */
    public void add(E label, int priority) {
        Element<E> element = new Element<>(label, priority);
        if (index == queue.length) {
            resize();
        }

        queue[index] = element;
        index++;
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
        for (int i = 0; i < index; i++) {
            if (queue[i].getPriority() > queue[deletedIndex].getPriority()) {
                deletedIndex = i;
            }
        }

        Element<E> result = queue[deletedIndex];
        index--;
        queue[deletedIndex] = queue[index];

        return result;
    }

    private void resize() {
        Element<E>[] newQueue = new Element[index + 1];
        System.arraycopy(queue, 0, newQueue, 0, index);
        queue = newQueue;
    }
}
