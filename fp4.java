import java.util.*;
class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
}
    public class fp4{
    static class biTree{
        static int idx = -1;
        public Node buildTree(int[] nodes){
            ++idx;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
        public  void preOrder(Node root){
            if(root== null){
                return ;
            }
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
       public  void levelOrder(Node root){
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node n = q.remove();
                if(n == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                else{
                    System.out.print(n.data+" ");
                    if(n.left!=null){
                        q.add(n.left);
                    }
                    if(n.right !=null){
                        q.add(n.right);
                    }
                }
            }

       }
       public int countNodes(Node root){
            if(root == null){
                return 0;
            }
            return countNodes(root.left)+countNodes(root.right)+1;
       }
       public int sumOfNodes(Node root){
            if(root == null){
                return 0;
            }
            int leftsum = sumOfNodes(root.left);
            int rightSum = sumOfNodes(root.right);
            return leftsum +rightSum+ root.data;
       }
       public int height(Node root){
            int h = 0;
            if(root == null){
                return 0;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node n = q.remove();
                if(n == null){
                    h++;
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                else{
                    if(n.left!=null){
                        q.add(n.left);

                    }
                    if(n.right != null){
                        q.add(n.right);
                    }
                }
            }
            return h;
       }
       public int height1(Node root){
            if(root == null){
                return 0;
            }
            int leftH = height1(root.left);
            int rightH = height1(root.right);
            return Math.max(leftH,rightH)+1;
       }
       public int diameter(Node root){
            if(root == null){
                return 0;
            }
            int dia1 = diameter(root.left);
            int dia2 = diameter(root.right);
            int dia3 = height(root.left)+height1(root.right)+1;

            return Math.max(dia3,Math.max(dia1,dia2));
        }

    }
  
    
    public static void main(String[] args){
        int[] nodes ={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        biTree bt = new fp4.biTree();
        
        Node root = bt.buildTree(nodes);
        bt.preOrder(root);
        System.out.println();
        bt.levelOrder(root);
        System.out.println("count of notes is "+bt.countNodes(root));
        System.out.println("Sum of node data is "+bt.sumOfNodes(root));
        System.out.println("Height of the Binary Tree "+bt.height1(root));
        System.out.println("Diameter of the tree "+bt.diameter(root));
    }
}

