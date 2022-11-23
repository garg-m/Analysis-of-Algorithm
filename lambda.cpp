#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    vector<vector<int>> costs = {{10,20}, {30,200}, {400,50}, {30,20}};

    sort(begin(costs), end(costs), 
        [](const vector<int> &o1, const vector<int> &o2)
            {
                return (o1[0] - o1[1] < o2[0] - o2[1]);
            }
        );

    for(vector<int> &a: costs)
        cout << a[0] << ", " << a[1] << endl;
    // clr();
    return 0;
}