package com.ngi.test.application;

import com.ngi.test.application.queue.CustomPriorityQueue;

public class Main {

    public static void main(String[] args) {
        CustomPriorityQueue<Integer> priorityQueue = new CustomPriorityQueue<>();
        priorityQueue.add(1, 9);
        priorityQueue.add(2, 7);
        priorityQueue.add(3, 0);
        priorityQueue.add(4, 20);

        while(!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.remove());
        }
    }
}
