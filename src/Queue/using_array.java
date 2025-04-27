package Queue;

public class using_array {

    int[] data;
    int front;
    int rear;
    int cnt = 0;

    using_array() {
        data = new int[5];
        front = -1;
        rear = -1;
    }

    using_array(int cap) {
        data = new int[cap];
        front = -1;
        rear = -1;
    }

    public boolean isEmpty() {
        return (front == -1 && rear == -1);
    }

    public boolean isFull() {
        return rear == data.length - 1;
    }

    public void push(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (isEmpty()) {
                front++;
            }
            rear++;
            data[rear] = element;
            cnt++;
        }
    }

    public void pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is Empty");
        }

        int val = data[front];

        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front++;
        }

        System.out.println("Popped " + val);
        cnt--;
    }

    public void top() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is Empty");
        }
        System.out.println(data[front]);
    }

    public void size() {
        System.out.println("Size: " + cnt);
    }

    public static void main(String[] args) throws Exception {
        using_array q = new using_array(); // create an instance

        q.push(2);
        q.size();
        q.top();
        q.pop();
        q.size();
    }
}
