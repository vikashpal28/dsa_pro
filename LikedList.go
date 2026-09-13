package main

import "fmt"

type Node struct {
	data int
	next *Node
}

func printList(head *Node) {
	curr := head
	for curr != nil {
		fmt.Printf("%d->", curr.data)
		curr = curr.next
	}
	fmt.Println("null")
}

func insertAtEnd(head *Node, data int) *Node {
	newNode := &Node{data: data}

	// If the list is empty, the new node becomes the head
	if head == nil {
		return newNode
	}

	curr := head

	for curr.next != nil {
		curr = curr.next
	}
	// Link the new node
	curr.next = newNode
	return head
}

func main() {
	var head *Node = nil // explicitly showing nil, though `var head *Node` defaults to nil

	head = insertAtEnd(head, 1)
	head = insertAtEnd(head, 2)
	head = insertAtEnd(head, 3)

	printList(head)
}
