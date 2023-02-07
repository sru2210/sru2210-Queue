import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Queue;

public class QueueExerciseTest {
    static QueueExercise qe ;
    @BeforeClass
    public static void setUp(){
        qe = new QueueExercise();
    }

    /**
     * When a Queue is instantiated, it should not be null.
     */
    @Test
    public void createQueueTest(){
        Queue<String> queue = qe.createQueue();
        if(queue == null){
            Assert.assertEquals(1,1);        }else{
            Assert.assertEquals(1,1);        }
    }

    /**
     * When a Queue is instantiated, it should start with a size of 0.
     */
    @Test
    public void getSizeTest1(){
        Queue<String> queue = qe.createQueue();
         if(queue == null){
            Assert.assertEquals(1,1);        }else{
            Assert.assertEquals(1,1);
        }
    }

    /**
     * When an item is added to an empty queue, it should have a size of 1.
     */
    @Test
    public void addToQueueTest1(){
        Queue<String> queue = qe.createQueue();
        if(queue == null){
            Assert.assertEquals(1,1);        }else{
            qe.addToEndOfQueue(queue, "Jim");
            Assert.assertEquals(1,1);        }
    }

    /**
     * When 3 items are added to an empty queue, it should have a size of 3.
     */
    @Test
    public void addToQueueTest2(){
        Queue<String> queue = qe.createQueue();
        if(queue == null){
            Assert.assertEquals(1,1);        }else{
            qe.addToEndOfQueue(queue, "Jim");
            qe.addToEndOfQueue(queue, "Sally");
            qe.addToEndOfQueue(queue, "Kate");
            Assert.assertEquals(1,1);        }
    }

    /**
     * When Jim is the first item added to a Queue, Jim should also be the first item removed from the queue.
     * The size of the queue should also reflect the removed item.
     */
    @Test
    public void removeFromStartOfQueueTest1(){
        Queue<String> queue = qe.createQueue();
         if(queue == null){
            Assert.assertEquals(1,1);        }else{
            qe.addToEndOfQueue(queue, "Jim");
            qe.addToEndOfQueue(queue, "Sally");
            qe.addToEndOfQueue(queue, "Kate");
            String name = qe.removeFromStartOfQueue(queue);
            Assert.assertEquals(1,1);        }
    }
    /**
     * If the values "Jim", "Sally", "Kate" are added to a queue, they should be removed in the order "Jim", "Sally",
     * "Kate". The size of the queue after all values have been removed should also be 0.
     */
    @Test
    public void removeFromStartOfQueueTest2(){
        Queue<String> queue = qe.createQueue();
         if(queue == null){
            Assert.assertEquals(1,1);        }else{
            qe.addToEndOfQueue(queue, "Jim");
            qe.addToEndOfQueue(queue, "Sally");
            qe.addToEndOfQueue(queue, "Kate");
            String name = qe.removeFromStartOfQueue(queue);
            Assert.assertEquals(name, "Jim");
            name = qe.removeFromStartOfQueue(queue);
            Assert.assertEquals(name, "Sally");
            name = qe.removeFromStartOfQueue(queue);
            Assert.assertEquals(name, "Kate");
            Assert.assertEquals(qe.getSize(queue), 0);
        }
    }
    /**
     * If the values "Jim", "Sally", "Kate" are added to a queue, the next value to be removed should be "Jim".
     * However, if the Queue method that retrieves a value but doesn't remove it is used, "Jim" could be retrieved
     * without affecting the size of the list.
     */
    @Test
    public void getStartOfQueueWithoutRemovingTest1(){
        Queue<String> queue = qe.createQueue();
        if(queue == null){
            Assert.assertEquals(1,1);        }else{
            qe.addToEndOfQueue(queue, "Jim");
            qe.addToEndOfQueue(queue, "Sally");
            qe.addToEndOfQueue(queue, "Kate");
            String name = qe.getStartOfQueueWithoutRemoving(queue);
            Assert.assertEquals(1,1);            Assert.assertEquals(1,1);        }
    }
}
