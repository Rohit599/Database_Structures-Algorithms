/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class LinkedList
{
    static class Node    // static class so that main can access it
    {
        int info;
        Node next;
    }
    Node start;
    LinkedList()    //constructor
    {
        start=null;
    }
    void create()   // Creating a Linked List of integers from 1 to 5
    {
        Node ptr;
        for(int i=1;i<=5;i++)
        {
            if(i==1)
            start=ptr=new Node();
            else
            ptr=ptr.next;
            ptr.info=i;
            if(i==5)
            ptr.next=null;
            else 
            ptr.next=new Node();
        }
    } // create
    
    void display()
    {
        Node ptr=start;
        while(ptr!=null)
        {
            System.out.print(ptr.info+" ")
            ptr=ptr.next;
        }
        System.out.println();
    } // display
    void displayFor()    //Display using for loop
    {
        for(Node ptr=start;ptr!=null;ptr=ptr.next)
        {
             System.out.print(ptr.info+" ")
        }
        System.out.println();
    } // displayFor
    
    void insert(int value, int pos)    // Inserting a integer at position pos
    {
        Node ptr=null;
        Node tmp=new Node();
        tmp.info=value;
        if(pos==1)
        {
            tmp.next=start;
            start=tmp;
        }  //if
        // Insert somewhere in between
        else
        {
            int ctr=0;
            for(ptr=start;ptr!=null;ptr=ptr.next)
            {
                ctr++;
                if(pos-1==ctr)
                {
                    tmp.next=ptr.next;
                    ptr.next=tmp;
                }  // if
            }  // for
        } // else
    }  // insert
    void delete(int pos)
    {
        Node ptr=null;
        if(pos==1)  // Delete first Node
        {
            start=start.next;
        }
        else
        {
          for(ptr=start;ptr!=null;ptr=ptr.next)
            {
                ctr++;
                if(pos-1==ctr)
                {
                    ptr.next=ptr.next.next;
                } // if
            }  // for
        }  // else
    }  // delete
    
    void concat(LinkedList List2)
    {
        Node ptr=null;
        for(ptr=start;ptr!=null;ptr=ptr.next)
        {
            if(ptr.next==null)
            {
                ptr.next=List2.start;
                break;
            }
        }
    }  // concat
    
    Node split(int splitPos)
    {
        Node start2=null,ptr=null; int ctr=0;
        for(ptr=start;ptr!=null;ptr=ptr.next)
        {
            ctr++;
            if(pos==ctr)
            {
                start2=ptr.next;
                ptr.next=null;
                break;
            }
        }
        return start2;  // Returning Starting node of new formed Linked List
    }
    
    void reverse
    {
        Node ptr=null, pptr=start, nptr=start.next, start.next=null;
        while(nptr!=null)
        {
            ptr=nptr;
            nptr=ptr.next;
            ptr.next=pptr;
            pptr=ptr;
        }
        start=ptr;
    }  // reverse
    
    void swapFirstLast()
    {
        Node last=null, secondLast=null;
        for(Node ptr=start;ptr.next!=null;ptr=ptr.next)
        {
            if(ptr.next.next==null)
            {
            secondLast=ptr;  // Second last node
            last=ptr.next; // Last node
            }
        }
        last.next=start.next;
        secondLast.next=start;
        start.next=null;
        start=last;
    }  // swapFirstLast
    
    void swap2nodes(int node1, node2)
    {
        Node beforeFirst, first, beforeSecond, second, tmp;
        int ctr=0;
        for(Node ptr=start;ptr!=null;ptr++)
        {
            ctr++
            if(ctr==node1-1)
            beforeFirst=ptr;
            if(ctr==node1)
            first=ptr;
            if(ctr==node2-1)
            beforeSecond=ptr;
            if(ctr==node2)
            second=ptr;
        }
        beforeFirst.next=second;
        tmp=first.next;
        first.next=second.next;
        second.next=tmp;
        beforeSecond.next=first;
    }  // swap2nodes
    
    void sort()  // Decending order
    {
        for(Node ptr1=start;ptr1!=null;ptr1=ptr1.next)
        {
            for(Node ptr2=ptr1;ptr2!=null;ptr2=ptr2.next)
            {
                if(ptr1.info<ptr2.info)
                {
                    int t=ptr1.info;
                    ptr1.info=ptr2.info;
                    ptr2.info=t;
                }  // if
            }
        }
    }  // sort
    
    void displayREC(Node ptr)  // Displaying using recursion from a specific node
    {
        System.out.print(ptr.info+" ");
        if(ptr!=null)   // Base Condition
        displayREC(ptr.next);
    }  // displayREC
    
    int sum(Node ptr)  // Sum of info of nodes from a specific position ptr by recursion
    {
        if(ptr.next==null)
        return ptr.info;
        else
        return ptr.info+sum(ptr.next);
    }  // sum
    
    int count(Node ptr)   // Counting no. of nodes from ptr using Recursion
    {
        if(ptr.next==null)
        return 1;
        else
        return 1+count(ptr.next);
    } // count
    
    void createCircular()   // Creating a Linked List of integers from 1 to 5
    {
        Node ptr;
        for(int i=1;i<=5;i++)
        {
            if(i==1)
            start=ptr=new Node();
            else
            ptr=ptr.next;
            ptr.info=i;
            if(i==5)
            ptr.next=start;
            else 
            ptr.next=new Node();
        }
    } // createCircular

    void displayCircular()
    {
        Node ptr=start;
        while(ptr!=start)
        {
            System.out.print(ptr.info+" ")
            ptr=ptr.next;
        }
        System.out.println();
    } // displayCircular

}
