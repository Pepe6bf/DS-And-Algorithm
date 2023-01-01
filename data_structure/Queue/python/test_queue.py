from queue import Queue

queue = Queue()

print("===== enqueue() 세 번 호출 =====")
queue.enqueue(1)
queue.enqueue(2)
queue.enqueue(3)

print(queue.front().data)

print("===== dequeue() 네 번 호출 =====")
print(queue.dequeue())
print(queue.dequeue())
print(queue.dequeue())
print(queue.dequeue())

print("is_empty : ", queue.is_empty())
