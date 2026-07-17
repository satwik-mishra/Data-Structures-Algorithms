class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class basic_operations {
    public static void display(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null)
                System.out.print("->");
            current = current.next;
        }
        System.out.println();
    }

    public static void count_number_of_nodes(Node head) {
        Node current = head;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }
        System.out.println("Number of nodes in the linked list : " + count);
    }

    public static boolean search_for_a_node(Node head, int target) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == target) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public static void find_max(Node head) {
        Node current = head;
        int max_value = current.data;
        while (current != null) {
            if (current.data > max_value) {
                max_value = current.data;
            }
            current = current.next;
        }
        System.out.println("maximum value : " + max_value);
    }

    public static int find_min(Node head) {
        Node current = head;
        int min_value = current.data;
        while (current != null) {
            if (current.data < min_value) {
                min_value = current.data;
            }
            current = current.next;
        }
        return min_value;
    }

    public static int find_sum_of_nodes(Node head) {
        Node current = head;
        int sum = 0;
        while (current != null) {
            sum = sum + current.data;
            current = current.next;
        }
        return sum;
    }

    public static int find_avg_of_nodes(Node head) {
        Node current = head;
        int avg, count = 0, sum = 0;
        while (current != null) {
            sum += current.data;
            count++;
            current = current.next;
        }
        avg = sum / count;
        return avg;
    }

    public static void even_and_odd_nodes(Node head) {
        Node current = head;
        int even_count = 0, odd_count = 0;
        while (current != null) {
            if (current.data % 2 == 0) {
                even_count++;
            } else {
                odd_count++;
            }
            current = current.next;
        }
        System.out.println("Number of even elements : " + even_count);
        System.out.println("Number of odd elements : " + odd_count);
    }
    public static void count_positive_and_negative_nodes(Node head) {
        Node current = head;
        int positive_count = 0, negative_count = 0;
        while (current != null) {
            if (current.data>0) {
                positive_count++;
            } else {
                negative_count++;
            }
            current = current.next;
        }
        System.out.println("Number of positive nodes : " + positive_count);
        System.out.println("Number of negative nodes : " + negative_count);
    }
    public static int find_first_occurance(Node head,int target)
    {
        Node current=head;
        int count=0;
        while(current!=null)
        {
            count++;
            if(current.data==target)
            {
                return count; 
            }
            current=current.next;
        }
        return -1;
    }
    public static int find_last_occurance(Node head,int target)
    {
        Node current=head;
        int last_position=-1;
        int position=0;
        while(current!=null)
        {
            position++;
            if(target==current.data)
            {
                last_position=position;
            }
            current=current.next;
        }
        return last_position;
    }
    public static int count_frequency_of_target(Node head,int target)
    {
        Node current=head;
        int freq=0;
        while(current!=null)
        {
            if(current.data==target)
            {
                freq++;
            }
            current=current.next;
        }
        return freq;
    }
    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(-5);
        Node third = new Node(13);
        Node fourth = new Node(-22);
        Node fifth = new Node(7);
        Node sixth = new Node(-1);
        Node seventh=new Node(13);
        // Connecting the nodes
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next=seventh;
        Node head = first;
        display(head);
        count_number_of_nodes(head);
        System.out.println(search_for_a_node(head, 30));
        find_max(head);
        System.out.println("Minimum value : " + find_min(head));
        System.out.println("Sum of nodes : " + find_sum_of_nodes(head));
        System.out.println("Average of nodes : " + find_avg_of_nodes(head));
        even_and_odd_nodes(head);
        count_positive_and_negative_nodes(head);
        System.out.println("first occurance : "+find_first_occurance(head, 13));
        System.out.println("Last occurance : "+find_last_occurance(head,13));
        System.out.println("frequency of the target is : "+count_frequency_of_target(head, 13));
    }
}
