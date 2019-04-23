package com.ngi.test.test;

import com.ngi.test.application.queue.SynchronizedPriorityQueue;
import com.ngi.test.application.queue.Element;
import org.junit.Test;

public class SynchronizedPriorityQueueTest {

    @Test
    public void testAddPriorityQueue() {
        SynchronizedPriorityQueue<String> priorityQueue = new SynchronizedPriorityQueue<>();
        priorityQueue.add("broken leg", 10);
        priorityQueue.add("paper cut", 5);
        priorityQueue.add("gunshot wound", 20);

        Element<String> highestPriority = priorityQueue.remove();
        assert highestPriority.getLabel().equals("gunshot wound");
        assert highestPriority.getPriority() == 20;
    }
}
