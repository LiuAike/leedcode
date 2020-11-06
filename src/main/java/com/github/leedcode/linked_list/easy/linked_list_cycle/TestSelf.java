package com.github.leedcode.linked_list.easy.linked_list_cycle;

/**
 * @author yifeng.liu
 * @date 2019-07-04 09:47
 */
public class TestSelf {
    public static void main(String[] args) {

    }

    /**
     * 方法一：一直判断是否指向下一个node，只要node不为空，就表示有环
     */
//    public class SolutionOne {
//        public boolean hasCycle(ListNode head) {
//            Set<Node> set = new HashSet<Node>();
//            while(head.next != null) return true;
//            return false;
//        }
//    }

    /**
     * 方案二：Set判重
     */
//    public class SolutionTwo {
//        public boolean hasCycle(ListNode head) {
//
//            Set<ListNode> nodesSeen = new HashSet<>();
//            while (head != null) {
//                if (nodesSeen.contains(head)) {
//                    return true;
//                } else {
//                    nodesSeen.add(head);
//                }
//                head = head.next;
//            }
//            return false;
//        }
//    }

    /**
     * 方案二：快慢指针,若是存在换，多次循环后，slow和fast会相遇
     *
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Linked List Cycle.
     * Memory Usage: 39.6 MB, less than 8.90% of Java online submissions for Linked List Cycle.
     */
//    public class SolutionTwo {
//        public boolean hasCycle(ListNode head) {
//            if (head == null) {
//                return false;
//            }
//
//            ListNode slow = head;
//            ListNode fast = head.next;
//            while (slow != fast) {
//                if (fast == null || fast.next == null) {
//                    return false;
//                }
//                slow = slow.next;
//                fast = fast.next.next;
//            }
//            return true;
//        }
//    }
}
