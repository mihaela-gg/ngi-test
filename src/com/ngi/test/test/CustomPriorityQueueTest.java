package com.ngi.test.test;

import com.ngi.test.application.queue.CustomPriorityQueue;
import com.ngi.test.application.queue.Element;
import org.junit.Test;

public class CustomPriorityQueueTest {

    @Test
    public void testAddPriorityQueue() {
        CustomPriorityQueue<String> priorityQueue = new CustomPriorityQueue<>();
        priorityQueue.add("broken leg", 10);
        priorityQueue.add("paper cut", 5);
        priorityQueue.add("gunshot wound", 20);

        Element<String> highestPriority = priorityQueue.remove();
        assert highestPriority.getLabel().equals("gunshot wound");
        assert highestPriority.getPriority() == 20;
    }
}
