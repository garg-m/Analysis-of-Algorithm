#include <iostream>
#include <conio.h>

using namespace std;

class ArrayList
{
 private:

	struct controlblock {

		int capacity;
		int *arr_ptr;
	};

  controlblock *s;

 public:
	Arraylist(int capacity)
	{

	s = new controlblock ;
	s -> capacity=capacity;
	s -> arr_ptr=new int[s->capacity];
	}

	void addElement(int index, int data){

	if (index>=0 && index <= s->capacity-1)
		data = s->arr_ptr[index];
	else
		cout<<"\nArray index not valid";

	}

	void viewlist(){

	int i;
	for(i = 0; i<s->capacity; i++){
		 
	}

	}
};
