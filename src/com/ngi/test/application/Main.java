package com.ngi.test.application;

import com.ngi.test.application.queue.SynchronizedPriorityQueue;

public class Main {

    public static void main(String[] args) {
        SynchronizedPriorityQueue<Integer> priorityQueue = new SynchronizedPriorityQueue<>();
        priorityQueue.add(1, 9);
        priorityQueue.add(2, 7);
        priorityQueue.add(3, 0);
        priorityQueue.add(4, 20);

        while(!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.remove());
        }
    }
}
