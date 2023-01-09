import sys, os
sys.path.append(os.path.dirname(os.path.abspath(os.path.dirname(__file__))))

from linked_list import doubly_linked_list
DoublyLinkedList = doubly_linked_list.DoublyLinkedList


class Queue:
    def __init__(self):
        self.list = DoublyLinkedList()

    def enqueue(self, data):
        self.list.insert_at(0, data)

    def dequeue(self):
        try:
            return self.list.delete_last()
        except IndexError as e:
            return None

    def front(self):
        return self.list.tail

    def is_empty(self):
        return self.list.count == 0
