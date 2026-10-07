
class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this(val, null);
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class LinkedList {
    ListNode head;

    public LinkedList() {
        head = null;
    }

    public int get(int index) {
        ListNode curr = head;
        int i = 0;

        while (curr != null) {
            if (i == index) {
                return curr.val;
            }

            i++;
            curr = curr.next;
        }

        return -1;
    }

    public void insertHead(int val) {
        ListNode newHead = new ListNode(val);
        newHead.next = head;
        head = newHead;
    }

    public void insertTail(int val) {
        ListNode newNode = new ListNode(val);

        if (head == null) {
            head = newNode;
            return;
        }

        ListNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    public boolean remove(int index) {
        if (head == null) {
            return false;
        }

        if (index == 0) {
            head = head.next;
            return true;
        }

        ListNode temp = head;

        for (int i = 0; i < index - 1; i++) {
            if (temp.next == null) {
                return false;
            }

            temp = temp.next;
        }

        if (temp.next == null) {
            return false;
        }

        temp.next = temp.next.next;

        return true;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> ll = new ArrayList<>();

        ListNode tmp = head;

        while (tmp != null) {
            ll.add(tmp.val);
            tmp = tmp.next;
        }

        return ll;
    }
}