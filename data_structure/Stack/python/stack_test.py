from stack import Stack

stack = Stack()

print("=========== 첫 번째 출력 ===========")
stack.push(1)
stack.push(2)
stack.push(3)
stack.push(4)

print(stack.pop().data)
print(stack.pop().data)
print(stack.pop().data)
print(stack.pop().data)

print("=========== 두 번째 출력 ===========")
stack.push(1)
stack.push(2)
stack.push(3)
stack.push(4)

print(stack.peek().data)
stack.pop()
print(stack.peek().data)
print("isEmpty : ", stack.is_empty())
stack.pop()
stack.pop()
stack.pop()
print("isEmpty : ", stack.is_empty())
print(stack.pop())