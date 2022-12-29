class Node:
    data = None
    next = None

    def __init__(self, data, next = None):
        self.data = data
        self.next = next


class LinkedList:
    head = None
    count = 0

    def insert_at(self, index, data):
        if index > self.count or index < 0:
            raise IndexError

        new_node = Node(data)

        if index == 0:
            new_node.next = self.head
            self.head = new_node
        else:
            current_node = self.head

            for i in range(index - 1):
                current_node = current_node.next
            new_node.next = current_node
            current_node.next = new_node
        self.count += 1

    def get_node_at(self, index):
        if index >= self.count or index < 0:
            raise IndexError

        current_node = self.head
        for i in range(index):
            current_node = current_node.next

        return current_node

    def print_all(self):
        current_node = self.head
        text = "["

        for i in range(self.count):
            text += str(current_node.data)

            if i is not self.count - 1:
                text += ", "

            current_node = current_node.next
        text += "]"
        print(text)

    def clear(self):
        self.head = None
        self.count = 0

    def insert_last(self, data):
        self.insert_at(self.count, data)

    def delete_at(self, index):
        if index >= self.count or index < 0:
            raise IndexError

        current_node = self.head

        if index == 0:
            delete_node = self.head
            self.head = self.head.next
            self.count -= 1

            return delete_node
        else:
            for i in range(index - 1):
                current_node = current_node.next

            delete_node = current_node.next
            current_node.next = current_node.next.next
            self.count -= 1

            return delete_node

    def delete_last(self):
        return self.delete_at(self.count - 1)


