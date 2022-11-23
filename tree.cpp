#include<iostream>
#include<sstream>

using namespace std;

struct TreeNode{
    int* val;
    int* left;
    int* right;
}
 
void main() {
    vector<int> preorder = {3,9,20,15,7};
    vector<int> inorder = {9,3,15,20,7};

    solution(preorder, inorder);
}

int preorder = 0;
unordered_map<int, int> inorderIndex;

class solution {
    
}