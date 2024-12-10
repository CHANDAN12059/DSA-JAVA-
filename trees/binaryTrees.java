package trees;

import java.util.*;

public class PreorderTree {
    public static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static class BinaryTree {

        static int idx = -1;

        public static Node buildTree(int nodes[]) {

            idx++;

            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;

        }


        public static void preOrder(Node root){

            if(root==null){
                return;
            }


            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);



        }

        public static void  levelOrderTraversal(Node root){

            Queue<Node> q=new LinkedList<>();

            q.add(root);
            q.add(null);

            while(!q.isEmpty()){

                Node curr=q.remove();

                if(curr==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                else{

                    System.out.print(curr.data+" ");

                    if(curr.left!=null){
                        q.add(curr.left);
                    }

                    if(curr.right!=null){
                        q.add(curr.right);
                    }


                }



            }



        }





    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        tree.levelOrderTraversal(root);

    }
}
