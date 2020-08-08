#include <iostream>
using namespace std;

typedef struct tagNode{
    int data;
    struct tagNode* NextNode;
} Node;

Node* SLL_CreateNode(ElementType NewData){
    Node* NewNode = (Node*)malloc(sizeof(Node));

    NewNode->data=NewData;
    NewNode->NextNode=NULL;

    return NewNode;
}

void SLL_AppendNode(Node** Head, Node* NewNode){
    if((*Head)==NULL){
        *Head = NewNode;
    } else {
        Node* Tail = (*Head);
        while(Tail->NextNode != NULL){
            Tail=Tail->NextNode;
        }
        Tail->NextNode = NewNode;
    }
}

void SLL_DestoryNode(Node* Node){
    free(Node);
}


void main(){
    Node myNode;
    Node* newNode = (Node*)malloc(sizeof(Node));

    Node* List = NULL;
    Node* NewNode = NULL;

    NewNode = SLL_CreateNode(117);
    SLL_AppendNode(&List, NewNode);
    
    NewNode = SLL_CreateNode(119);
    SLL_AppendNode(&List, NewNode);

    
}
