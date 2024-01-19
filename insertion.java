#include<stdio.h>
#include<stdlib.h>
typedef struct node{
    int data;
    struct node* next;
}NODE;
NODE *start=NULL,*tptr,*prev=NULL,*newNode;
void insert(int n){
     newNode=(NODE*)malloc(sizeof(NODE));
     newNode->data=n;
     newNode->next=NULL;
     if(start==NULL){
         start=newNode;
     }else{
         for(tptr=start,prev=start;tptr&&n>=tptr->data;prev=tptr,tptr=tptr->next);
         if(start==tptr){
             newNode->next=start;
             start=newNode;
         }else{
             prev->next=newNode;
             newNode->next=tptr;
         }
     }
     
}
void display(){
    for(tptr=start;tptr;tptr=tptr->next)
    printf("%d ",tptr->data);
}
int main(){
    insert(10);
    insert(20);
    insert(5);
    insert(7);
    insert(45);
    insert(65);
    insert(1);
    insert(100);
    display();
    return 0;
}
