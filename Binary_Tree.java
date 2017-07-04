/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class BinaryTree
{
    class Node
    {
        int data;
        Node right;
        Node left;
    }
    static Node Root;
    BinaryTree()   //  constructor
    {
        Root=null;
    }
    void createRoot(int info)
    {
        if(Root==null)
        {
            Root=new Node();
            Root.data=info;
            Root.right=null;
            Root.left=null;
        
        }
    }
    void create(Node ptr,char pos, int after, int info)
    {
        if(ptr!=null)
        {
            if(ptr.data==after)
            {
                Node newNode=new Node();
                newNode.data=info;
                newNode.left=newNode.right=null;
                if(pos=='l')
                ptr.left=newNode;
                else if(pos=='r')
                ptr.right=newNode;
            }
            create(ptr.left,pos,after,info);
        }
    }
    
    int countNodes(Node ptr)
    {
        if(ptr!=null)
        {
            return 1+countNodes(ptr.left)+countNodes(ptr.right);
        }
        else
        {
            return 0;
        }
    } // countNodes
    
    void displayInorder(Node ptr)
    {
        if(ptr!=null)
        {
            displayInorder(ptr.left);
            System.out.print(ptr.data+" ");
            displayInorder(ptr.right);
        }
    }
    
    void displayPreorder(Node ptr)
    {
        if(ptr!=null)
        {
             System.out.print(ptr.data+" ");
             displayPreorder(ptr.left);
             displayPreorder(ptr.right);
             
        }
    }
    
    void displayPostorder(Node ptr)
    {
        if(ptr!=null)
        {
             displayPreorder(ptr.right);
             displayPreorder(ptr.left);
             System.out.print(ptr.data+" ");
             
        }
    }
    public static void main (String[]args)
    {
        BinaryTree bt=new BinaryTree();
        bt.createRoot(0);
        bt.create(Root,'l',0,-1);
        bt.create(Root,'r',0,1);
        bt.create(Root,'l',-1,-2);
        bt.create(Root,'r',-1,-3);
        bt.create(Root,'l',1,2);
        bt.create(Root,'r',1,3);
        System.out.println("No. of Nodes: "+(bt.countNodes(Root)));
        System.out.print("InOrder :");
        bt.displayInorder(Root);
        System.out.println();
        System.out.print("PreOrder :");
        bt.displayInorder(Root);
        System.out.println();
        System.out.print("PostOrder :");
        bt.displayInorder(Root);
    }
}
