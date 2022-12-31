from linked_list import Node, LinkedList

node1 = Node(1)
node2 = Node(2)
node3 = Node(3)

node1.next = node2
node2.next = node3

print(node1.data)
print(node1.next.data)
print(node1.next.next.data)

list = LinkedList()

print("======== insert_at() 다섯 번 호출 ========")
list.insert_at(0, 0)
list.insert_at(1, 1)
list.insert_at(2, 2)
list.insert_at(3, 3)
list.insert_at(4, 4)
list.print_all()

print("======== clear() 호출 ========")
list.clear()
list.print_all()

print("======== insert_last() 세 번 호출 ========")
list.insert_last(0)
list.insert_last(1)
list.insert_last(2)
list.print_all()

print("======== delete_at() 호출 ========")
list.delete_at(0)
list.print_all()
list.delete_at(1)
list.print_all()

print("======== delete_last() 호출 ========")
list.insert_last(5)
list.print_all()
list.delete_last()
list.delete_last()
list.print_all()

print("======== get_node_at() 호출 ========")
list.insert_at(1, 1)
list.insert_at(2, 2)
list.insert_at(3, 3)
list.insert_at(4, 4)
list.insert_at(5, 5)

second = list.get_node_at(2)
print(second)


