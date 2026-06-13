            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    Node compute(Node head){
        if(head == null ||  head.next == null){
            return head;
        }
        head = reverse(head);
        int max = head.data;
        Node curr = head;
        
        while(curr != null && curr.next != null){
            if(curr.next.data < max){
                curr.next = curr.next.next;
            }else{
                curr = curr.next;
                max = curr.data;
            }
            
            
        
    }
    return reverse(head);
        // code here
        
        
    }
}