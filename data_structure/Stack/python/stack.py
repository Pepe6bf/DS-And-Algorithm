import sys, os
sys.path.append(os.path.dirname(os.path.abspath(os.path.dirname(__file__))))

from linked_list import linked_list
LinkedList = linked_list.LinkedList

class Stack:
    list = []

    def __init__(self):
        self.list = LinkedList()

    def push(self, data):
        self.list.insert_at(0, data)

    def pop(self):
        try:
            return self.list.delete_at(0)
        except Exception as e:
            return None

    def peek(self):
        return self.list.get_node_at(0)

    def is_empty(self):
        return (self.list.count == 0)