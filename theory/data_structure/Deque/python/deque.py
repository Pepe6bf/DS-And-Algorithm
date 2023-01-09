import sys, os
sys.path.append(os.path.dirname(os.path.abspath(os.path.dirname(__file__))))

from linked_list import doubly_linked_list
DoublyLinkedList = doubly_linked_list.DoublyLinkedList


class Deque:
    def __init__(self):
        self.list = DoublyLinkedList()

    def print_all(self):
        self.list.print_all()

    def add_first(self, data):
        self.list.insert_at(0, data)

    def remove_first(self):
        return self.list.delete_at(0)

    def add_last(self, data):
        self.list.insert_at(self.list.count, data)

    def remove_last(self):
        return self.list.delete_last()

    def is_empty(self):
        return self.list.count == 0
