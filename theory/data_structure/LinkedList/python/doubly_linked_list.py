class Node:
    def __init__(self, data, next = None, prev = None):
        self.data = data
        self.next = next
        self.prev = prev


class DoublyLinkedList:
    def __init__(self):
        self.head = None
        self.tail = None
        self.count = 0

    def print_all(self):
        current_node = self.head
        text = "["

        for i in range(self.count):
            text += str(current_node.data)
            current_node = current_node.next

            if i is not self.count - 1:
                text += ", "

        text += "]"
        print(text)

    def clear(self):
        self.head = None
        self.count = 0

    def insert_at(self, index, data):
        if index > self.count or index < 0:
            raise IndexError

        new_node = Node(data)
        if index == 0:
            new_node.next = self.head
            if self.head is not None:
                self.head.prev = new_node
            self.head = new_node
        elif index == self.count:
            new_node.next = None
            new_node.prev = self.tail
            self.tail.next = new_node
        else:
            current_node = self.head

            for i in range(index - 1):
                current_node = current_node.next
            new_node.next = current_node.next
            new_node.prev = current_node
            current_node.next = new_node
            new_node.next.prev = new_node

        if new_node.next == None:
            self.tail = new_node

        self.count += 1

    def insert_last(self, data):
        self.insert_at(self.count, data)

    def delete_at(self, index):
        if index >= self.count or index < 0:
            raise IndexError

        current_node = self.head

        if index == 0:
            delete_node = self.head
            if self.head.next is None:
                self.head = None
                self.tail = None
            else:
                self.head = self.head.next
                self.head.prev = None

            self.count -= 1

            return delete_node
        elif index == self.count - 1:
            delete_node = self.tail
            self.tail.prev.next = None
            self.tail = self.tail.prev
            self.count -= 1

            return delete_node
        else:
            for i in range(index - 1):
                current_node = current_node.next

            delete_node = current_node.next
            current_node.next = current_node.next.next
            current_node.next.prev = current_node
            self.count -= 1

            return delete_node

    def delete_last(self):
        return self.delete_at(self.count - 1)

    def get_node_at(self, index):
        if index >= self.count or index < 0:
            raise IndexError("범위를 넘어갔습니다.")

        current_node = self.head
        for i in range(index):
            current_node = current_node.next

        return current_node